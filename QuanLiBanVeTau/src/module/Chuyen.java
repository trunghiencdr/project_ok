/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module;

import connectSQL.LopKetNoi;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.sql.ResultSet;
import java.util.HashMap;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Chuyen {

    private String ma;
    private String maTau;
    private String maTuyen;
    private String tenNgayHoatDong;
    private int gioKhoiHanh;
    private LocalDate ngayKhoiHanh;
    private final int thoiGianNghiTuyen = 1;

    public Chuyen() {
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getMaTau() {
        return maTau;
    }

    public void setMaTau(String maTau) {
        this.maTau = maTau;
    }

    public String getMaTuyen() {
        return maTuyen;
    }

    public void setMaTuyen(String maTuyen) {
        this.maTuyen = maTuyen;
    }

    public String getTenNgayHoatDong() {
        return tenNgayHoatDong;
    }

    public void setTenNgayHoatDong(String tenNgayHoatDong) {
        this.tenNgayHoatDong = tenNgayHoatDong;
    }

    public int getGioKhoiHanh() {
        return gioKhoiHanh;
    }

    public void setGioKhoiHanh(int gioKhoiHanh) {
        this.gioKhoiHanh = gioKhoiHanh;
    }

    public LocalDate getNgayKhoiHanh() {
        return ngayKhoiHanh;
    }

    public void setNgayKhoiHanh(LocalDate ngayKhoiHanh) {
        this.ngayKhoiHanh = ngayKhoiHanh;
    }

    public LocalDateTime getThoiGianKhoiHanh() {
        return ngayKhoiHanh.atTime(gioKhoiHanh, 0);
    }

    public HashMap<String, LocalDateTime> getThoiGianTungTram(LocalDateTime thoiGianDi, String tramDi, String tramDen) {
        HashMap<String, LocalDateTime> ThoiGianTungTram = new HashMap<>();
        try {
            ResultSet rsTramDi = LopKetNoi.select("select thoiGianDen from TuyenDiQuaTram "
                    + "where tenTram = ? and maTuyen = ?", tramDi, this.maTuyen);
            ResultSet rsTramDen = LopKetNoi.select("select thoiGianDen from TuyenDiQuaTram "
                    + "where tenTram = ? and maTuyen = ?", tramDen, this.maTuyen);
            if (rsTramDi.next() && rsTramDen.next()) {
                if (rsTramDi.getInt("thoiGianDen") < rsTramDen.getInt("thoiGianDen")) { // luot di
                    System.out.println("Vao luot di");
                    ResultSet rsTungTram = LopKetNoi.select("select tenTram, thoiGianDen from TuyenDiQuaTram where maTuyen = ?", this.maTuyen);
                    while (rsTungTram.next()) {
                        String tenTram = rsTungTram.getString(1);
                        int khoangThoiGian = rsTungTram.getInt(2);
                        LocalDateTime thoiGianDenTram = thoiGianDi.plusHours(khoangThoiGian);
                        ThoiGianTungTram.put(tenTram, thoiGianDenTram);
                    }
                } else {// luot ve
                    System.out.println("vao luot ve");
                    ResultSet rsMax = LopKetNoi.select("select max(thoiGianDen) from TuyenDiQuaTram where maTuyen = ?", this.maTuyen);
                    ResultSet rsTungTram = LopKetNoi.select("select tenTram, thoiGianDen from TuyenDiQuaTram where maTuyen = ?", this.maTuyen);
                    int maxThoiGian = rsMax.getInt(1);
                    while (rsTungTram.next()) {
                        String tenTram = rsTungTram.getString(1);
                        int thoiGianDenTram = rsTungTram.getInt(2);
                        ThoiGianTungTram.put(tenTram, thoiGianDi.plusHours(maxThoiGian - thoiGianDenTram));
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Loi get thoi gian tung tram");
            e.printStackTrace();
        }
        return ThoiGianTungTram;
    }

    public LocalDateTime getThoiGianDen() {
        return getThoiGianKhoiHanh().plusHours(getLoTrinhTuyen());
    }

    public int getLoTrinhTuyen() {
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

    public int getChuKiTuyen() {
        int chuKiTuyen = (int) Math.ceil((getLoTrinhTuyen() * 2 + 2 * thoiGianNghiTuyen) / 24.0);// ngày
        return (chuKiTuyen % 2 == 0) ? chuKiTuyen : (chuKiTuyen + 1);
    }

    public LocalDateTime getLuotDi() {
        return ngayKhoiHanh.atTime(gioKhoiHanh, 0);
    }

    public LocalDateTime getLuotVe() {
        return getLuotDi().plusDays(getChuKiTuyen() / 2);

    }

    public String getNgayHoatDong() {
        String s = null;
        try {
            ResultSet rs = LopKetNoi.select("select ngayBatDau, ngayKetThuc from NgayHoatDong where tenNgayHoatDong = ?",
                    this.tenNgayHoatDong);
            if (rs.next()) {
                s = rs.getDate(1) + " - " + rs.getDate(2);
            }
        } catch (Exception e) {
        }
        return s;
    }

    public Chuyen(String ma, String maTau, String maTuyen, String tenNgayHoatDong, int gioKhoiHanh, LocalDate ngayKhoiHanh) {
        this.ma = ma;
        this.maTau = maTau;
        this.maTuyen = maTuyen;
        this.tenNgayHoatDong = tenNgayHoatDong;
        this.gioKhoiHanh = gioKhoiHanh;
        this.ngayKhoiHanh = ngayKhoiHanh;
    }

}
