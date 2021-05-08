/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moduledao;

import DungChung.StringDungChung;
import com.github.lgooddatepicker.components.DatePicker;
import connectSQL.LopKetNoi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import module.Chuyen;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ChuyenDao {

    static final int thoiGianNghiTuyen = 1; // giờ
    static final int thoiGianDoiTuyen = 3; // ngày
    static final int thoiGianTauTrungTuyen = 1; // trùng tuyến trùng ngày bd và kt thì phải cách nhau 1 giờ

    public static boolean kiemTraMaTrung(String ma) {
        try {
            ResultSet rs = LopKetNoi.select("select maChuyen from Chuyen "
                    + "where maChuyen = ?", ma);
            if (rs.next()) {
                return false;
            }
        } catch (Exception e) {
            System.out.println("Kiem tra Ma trung bi loi");
        }
        return true;
    }

//    public static boolean kiemTraThoiGianTrung(String maTuyen, String maThoiGian, LocalTime tgKhoiHanh,
//            LocalTime tgDen, String trangThai) {// nếu mã tuyến mã thời gian trạng thái trùng thì kiểm tra thời gian 
//        
//        
//    }
    public static String thoiGianSangString(Date ngayBD, Date ngayKT) {
        return StringDungChung.DateSangString(ngayBD, "dd/MM/yyyy") + " đến " + StringDungChung.DateSangString(ngayKT, "dd/MM/yyyy");
    }

    public static int layLoTrinhTuyen(String maTuyen) {
        int gio = -1;
        try {
            ResultSet rs = LopKetNoi.select("select max(thoiGianDen) from TuyenDiQuaTram where maTuyen = ?", maTuyen);
            while (rs.next()) {
                gio = rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return gio;
    }

    public static int layChuKiTuyen(String maTuyen) {/// trả về ngày
        int chuKiTuyen = (int) Math.ceil((layLoTrinhTuyen(maTuyen) * 2 + 2 * thoiGianNghiTuyen) / 24.0);// ngày
        return (chuKiTuyen % 2 == 0) ? chuKiTuyen : (chuKiTuyen + 1);
    }

    public static void loadDSChuyenVaoBang(ResultSet rs, DefaultTableModel model) {
        model.setRowCount(0);
        try {
            while (rs.next()) {
                String ma = rs.getString("maChuyen");
                String maTau = rs.getString("maTau");
                String maTuyen = rs.getString("maTuyen");
                String tenNgayHoatDong = rs.getString("tenNgayHoatDong");
                int gioKH = rs.getInt("gioKhoiHanh");
                LocalDate ngayKH = rs.getDate("ngayKhoiHanh").toLocalDate();
                Chuyen chuyen = new Chuyen(ma, maTau, maTuyen, tenNgayHoatDong, gioKH, ngayKH);
                int loTrinhTuyen = chuyen.getLoTrinhTuyen();
                int chuKiTuyen = chuyen.getChuKiTuyen();
                LocalDate luotDi = chuyen.getLuotDi().toLocalDate();
                LocalDate luotVe = chuyen.getLuotVe().toLocalDate();
                String ngayBDKT = chuyen.getNgayHoatDong();
//                LocalDateTime thoiGianDen = getThoiGianKT(maTuyen, thoiGianKH);
//                LocalDate ngayBD = rs.getDate(5).toLocalDate();
                // lay ngayBD KT 
                
                model.addRow(new Object[]{ma, maTau, maTuyen, loTrinhTuyen, chuKiTuyen, chuyen.getGioKhoiHanh(), luotDi, luotVe, ngayBDKT});
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("load ds chuyen vao bang that bai");
        }
    }

//    public boolean kiemTraThoiGianKHVaKetThuc(LocalTime tgKhoiHanh, LocalTime tgDen) {// xem co bi chong lap len nhau khong
//        // chia 2 trường hợp: 1 là nếu ngaybd và kt nằm trước 1 thằng trong bảng
//        // th2 là nếu ngaybd và kt nằm sau 1 thằng 
//        try {
//            ResultSet rs = LopKetNoi.select("select ngayBatDau, ngayKetThuc from KhoangThoiGianHoatDong order by ngayBatDau "
//                    + "ASC");
//            //th1
//            while (rs.next()) {
//                Date ngayBDSql = rs.getDate(1);
//                Date ngayKTSql = rs.getDate(2);
//
//                // kiem tra xem nó có cắt nhau không
//                // th1 là 1 trước một sau
//                if (ngayBD.compareTo(ngayBDSql) >= 0 && ngayBD.compareTo(ngayKTSql) <= 0) {
//                    return false;
//                }
//                if (ngayKT.compareTo(ngayBDSql) >= 0 && ngayKT.compareTo(ngayKTSql) <= 0) {
//                    return false;
//                }
//
//            }
//        } catch (Exception e) {
//            System.out.println("Loi");
//            e.printStackTrace();
//            return false;
//        }
//        return true;
//    }
    public static ArrayList<String> getLichTrinhTau(String maTau) {
        ArrayList<String> lichTrinh = new ArrayList<>();
        try {
            ResultSet rs = LopKetNoi.select("select thoiGianKhoiHanh, ngayKetThuc, trangThai"
                    + " from Chuyen where maTau = ?", maTau);
            while (rs.next()) {
                System.out.println("vao lich trinh tau");
                LocalDateTime thoiGianKH = rs.getTimestamp("thoiGianKhoiHanh").toLocalDateTime();
                lichTrinh.add(thoiGianKH + " đến " + getThoiGianKT(maTau, thoiGianKH) + ", từ ngày "
                        + thoiGianKH.toLocalDate() + " đến " + rs.getDate("ngayKetThuc") + " " + rs.getString("trangThai"));
            }
        } catch (Exception e) {
            System.out.println("get lich trinh tau that bai");
        }
        return lichTrinh;
    }

    public static LocalDateTime getThoiGianKT(String maTuyen, LocalDateTime thoiGianKH) {
        int gio = 0;
        try {
            ResultSet rs = LopKetNoi.select("select max(thoiGianDen) from tuyendiquatram where maTuyen = ?", maTuyen);
            if (rs.next()) {
                gio = rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println("get thoi gian kt that bai");
        }
        return thoiGianKH.plusHours(gio);
    }

    public static ArrayList<String> getDSTramDiQua(String maTuyen) {
        ArrayList<String> DS = new ArrayList<>();
        try {
            ResultSet rs = LopKetNoi.select("select tenTram from TuyenDiQuaTram where maTuyen=? order by thoiGianDen ASC", maTuyen);
            while (rs.next()) {
                DS.add(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("get ds tram di qua that bai");
        }
        return DS;
    }

    private static String getTramBDVaKetThuc(ArrayList<String> DS) {
        return DS.get(0) + "-" + DS.get(DS.size() - 1);
    }

    public static ArrayList<String> getDSTramBDVaKetThuc(ResultSet rsMaTuyen) {
        ArrayList<String> DSTramBDKT = new ArrayList<>();
        try {
            while (rsMaTuyen.next()) {
                String maTuyen = rsMaTuyen.getString(1);
                DSTramBDKT.add(getTramBDVaKetThuc(getDSTramDiQua(maTuyen)));
            }
        } catch (Exception e) {
            System.out.println("get ds tram bd va ket thuc that bai");
        }
        return DSTramBDKT;
    }

    public static ArrayList<String> getDSMaTau(ResultSet rsMaTau) {
        ArrayList<String> DSMaTau = new ArrayList<>();
        try {
            while (rsMaTau.next()) {
                DSMaTau.add(rsMaTau.getString(1));

            }
        } catch (Exception e) {
            System.out.println("get ds ma tau that bai");
        }
        return DSMaTau;
    }

//    public static String getMaThoiGianTuDate(Date ngayBD, Date ngayKT) {
//        String ma = null;
//        try {
//            ResultSet rs = LopKetNoi.select("select maThoiGianHoatDong from KhoangThoiGianHoatDong where ngayBatDau = ? and "
//                    + "ngayKetThuc = ?", ngayBD, ngayKT);
//            if (rs.next()) {
//                ma = rs.getString(1);
//            }
//        } catch (Exception e) {
//            System.out.println("get ma thoi gian that bai");
//        }
//        return ma;
//    }
    public static boolean kiemTraNgayBatDauVaKetThuc(LocalDate ngayBD, LocalDate ngayKT) {
        // chia 2 trường hợp: 1 là nếu ngaybd và kt nằm trước 1 thằng trong bảng
        // th2 là nếu ngaybd và kt nằm sau 1 thằng 
        try {
            ResultSet rs = LopKetNoi.select("select ngayBatDau, ngayKetThuc from chuyen order by ngayBatDau "
                    + "ASC");
            //th1
            while (rs.next()) {
                LocalDate ngayBDSql = rs.getDate(1).toLocalDate();
                LocalDate ngayKTSql = rs.getDate(2).toLocalDate();

                // kiem tra xem nó có cắt nhau không
                // th1 là 1 trước một sau
                if (ngayBD.compareTo(ngayBDSql) >= 0 && ngayBD.compareTo(ngayKTSql) <= 0) {
                    return false;
                }
                if (ngayKT.compareTo(ngayBDSql) >= 0 && ngayKT.compareTo(ngayKTSql) <= 0) {
                    return false;
                }

            }
        } catch (Exception e) {
            System.out.println("Loi");
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static boolean kiemTraDSNgayBDVaKT(String maTau) {
        try {
            ResultSet rs = LopKetNoi.select("select ngayBatDau, ngayKetThuc", maTau);
            while (rs.next()) {
                if (!kiemTraNgayBatDauVaKetThuc(rs.getDate(1).toLocalDate(), rs.getDate(2).toLocalDate())) {
                    return false;
                }
            }
        } catch (Exception e) {
            System.out.println("Kiem tra ds ngay bd va kt that bai");
        }
        return true;
    }

//    public static boolean kiemTraThoiGian(LocalTime thoiGianKH, LocalTime thoiGianKT) {
//        try {
//            
//        } catch (Exception e) {
//        }
//    }
    public static boolean kiemTraTGKH(String maTuyen, LocalDateTime TGKH1, LocalDateTime TGKH2) {
        if (TGKH1.toLocalTime().compareTo(TGKH2.toLocalTime()) != 0) {
            return true;
        }
        int gio = 0;
        ResultSet rs = LopKetNoi.select("select max(thoiGianDen) from TuyenDiQuaTram where maTuyen = ?", maTuyen);
        try {
            if (rs.next()) {
                gio = rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println("get thoi gian chay tuyen that bai");
        }
        // tinh chu ki

        int chuKiTuyen = (int) Math.ceil((gio * 2 + 2 * thoiGianNghiTuyen) / 24.0);// ngày
        if (chuKiTuyen % 2 != 0) {
            chuKiTuyen++;
        }
        int soNgay = Math.abs((int) ChronoUnit.DAYS.between(TGKH1, TGKH2));
        if (soNgay % chuKiTuyen == 0) {
            return false; // trùng thời gian khởi hành
        } else {
            return true;// không trùng thời gian khởi hành
        }

    }

    public static ArrayList<String> layTauHopLi(String maTuyen, String tenNgayHoatDong, LocalDateTime tgKhoiHanh) {
        String kiemTra = "";
        ArrayList<String> DSTau = new ArrayList<>();
//        LocalDateTime tgKetThuc = chuyen.getThoiGianDen();
//        LocalDate ngayBatDau = tgKhoiHanh.toLocalDate();
//        LocalDate ngayKetThuc = chuyen.getNgayKetThuc();
        try {
            ResultSet rs = LopKetNoi.select("select * from Chuyen where maTuyen = ? and tenNgayHoatDong = ?", maTuyen, tenNgayHoatDong);
            while (rs.next()) {
                // nếu trùng ngày hd thì xem tgkh nó có chồng lên nhau không
                LocalDateTime TGKHSql = rs.getDate("ngayKhoiHanh").toLocalDate().atTime(rs.getInt("gioKhoiHanh"), 0);
                if (!kiemTraTGKH(maTuyen, tgKhoiHanh, TGKHSql)) {// nếu trùng thời gian kh thì tra về rỗng
                    System.out.println("thoi gian kh trung nhau");
                    return null;
                }
            }// nếu chạy hết mà không trùng thời gian kh thì trả về ds tau bên bảng tàu chưa có trong chuyến
            try {
                System.out.println("Thoi Gian kh khong trung");
                ResultSet rsTau = LopKetNoi.select("select maTau from Tau where not exists(select maTau from Chuyen "
                        + "where Tau.maTau = Chuyen.maTau and "
                        + "tenNgayHoatDong = ?)", tenNgayHoatDong);
                while (rsTau.next()) {
                    DSTau.add(rsTau.getString(1));
                }
                return DSTau;

            } catch (Exception e) {
                System.out.println("tra ve tau chua co trong khoang thoi gian hoat dong that bai");
            }
        } catch (Exception e) {
            System.out.println("tim lich trinh tuyen that bai");
        }
        return DSTau;
    }

//    public static boolean kiemTraLichTrinhTuyen(Chuyen chuyen) {
//        String thongBao = "";
//
//    }
    public static boolean kiemTraNgayBDVaKetThuc(LocalDate ngayBD1, LocalDate ngayKT1, LocalDate ngayBD2, LocalDate ngayKT2) {
        if (ngayBD1.compareTo(ngayBD2) >= 0 && ngayBD1.compareTo(ngayKT2) <= 0) {
            return false;
        }
        if (ngayKT1.compareTo(ngayBD2) >= 0 && ngayKT1.compareTo(ngayKT2) <= 0) {
            return false;
        }
        return true; // không trùng ngày

    }

    public static boolean themChuyenVaoDB(Chuyen chuyen) {// thêm khi ngày bắt đầu của mới lớn hơn ngày kết thúc của cũ

        try {
            LopKetNoi.update("insert into Chuyen values(?,?,?,?,?,?)", chuyen.getMa(), chuyen.getMaTau(),
                    chuyen.getMaTuyen(), chuyen.getTenNgayHoatDong(), chuyen.getGioKhoiHanh(), chuyen.getNgayKhoiHanh());
        } catch (Exception e) {
            System.out.println("Them chuyen that bai do loi or do trung khoa");
            return false;
        }
        return true;
    }
//

    public static void suaChuyenTrongDB(Chuyen chuyen) { // lười kiểm tra thời gian bd và kt có trùng cái cũ không
        LopKetNoi.update("update Chuyen set maTau=?, maTuyen=?, tenNgayHoatDong=?, gioKhoiHanh=?, ngayKhoiHanh = ? where maChuyen = ?",
                chuyen.getMaTau(), chuyen.getMaTuyen(), chuyen.getTenNgayHoatDong(),
                chuyen.getGioKhoiHanh(), chuyen.getNgayKhoiHanh(), chuyen.getMa());

    }
////
//

    public static boolean xoaChuyenTrongDB(String maChuyen) {
        try {
            LopKetNoi.update("delete from Chuyen where maChuyen = ?", maChuyen);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
//

////
    public static void xoaChuyenKhoiBang(int hang, DefaultTableModel model) {
        model.removeRow(hang);
    }

    public static void getChuyenTuBangVaoDAL(int hang, JTable jtb, JTextField jtfMa, JComboBox jcbbTau, JTextField jtfMaTuyen, JComboBox jcbbTramBDKT,
            JComboBox jcbbGio, JComboBox jcbbPhut, DatePicker dpNgayBD, DatePicker dpNgayKT, JComboBox jcbbTrangThai) {
        jtfMa.setText(jtb.getValueAt(hang, 0) + "");
        jcbbTau.setSelectedItem(jtb.getValueAt(hang, 1) + "");
        String maTuyen = jtb.getValueAt(hang, 2) + "";
        jtfMaTuyen.setText(maTuyen);
        String tramBDKT = getTramBDVaKetThuc(getDSTramDiQua(maTuyen));
        jcbbTramBDKT.setSelectedItem(tramBDKT);
        String[] thoiGian = jtb.getValueAt(hang, 3).toString().split(":");
        jcbbGio.setSelectedItem(thoiGian[0]);
        jcbbPhut.setSelectedItem(thoiGian[1]);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate ngayBD = LocalDate.parse(jtb.getValueAt(hang, 4).toString(), dtf);
        LocalDate ngayKT = LocalDate.parse(jtb.getValueAt(hang, 5).toString(), dtf);
        dpNgayBD.setDate(ngayBD);
        dpNgayKT.setDate(ngayKT);
        jcbbTrangThai.setSelectedItem(jtb.getValueAt(hang, 6) + "");
    }
}
