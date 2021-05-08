/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.datve2;

import connectSQL.LopKetNoi;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.print.attribute.standard.ReferenceUriSchemesSupported;
import module.Chuyen;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

/**
 *
 * @author admin
 */
public class JPanelTimVe2 extends javax.swing.JPanel {

    /**
     * Creates new form JPanelDatVe
     */
    private String maChuyenDuocChon = "";

    public JPanelTimVe2() {
        initComponents();
        napGaDiGaDenVaoCBB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnGoc = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonTimVe = new javax.swing.JButton();
        rdb1Chieu = new javax.swing.JRadioButton();
        rdbKhuHoi = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbbGaDi = new javax.swing.JComboBox<>();
        cbbGaDen = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButtonDatVe1 = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        dpNgayDi = new com.github.lgooddatepicker.components.DatePicker();
        dpNgayVe = new com.github.lgooddatepicker.components.DatePicker();
        jLabel8 = new javax.swing.JLabel();
        jpnChonChoNgoi = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jpnChonTau = new javax.swing.JPanel();
        jpnChonToa = new javax.swing.JPanel();

        jLabel2.setText("Ga đi");

        jLabel3.setText("Ga đến");

        jButtonTimVe.setText("Tìm vé");
        jButtonTimVe.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButtonTimVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTimVeActionPerformed(evt);
            }
        });

        rdb1Chieu.setText("1 chiều");
        rdb1Chieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb1ChieuActionPerformed(evt);
            }
        });

        rdbKhuHoi.setText("Khứ hồi");
        rdbKhuHoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbKhuHoiActionPerformed(evt);
            }
        });

        jLabel5.setText("Ngày đi");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });

        jLabel6.setText("Ngày về");

        cbbGaDi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbGaDiActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Xoá 1 vé trong bảng");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonDatVe1.setText("Đặt vé");
        jButtonDatVe1.setEnabled(false);
        jButtonDatVe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDatVe1ActionPerformed(evt);
            }
        });

        jButtonReset.setText("Reset");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        jLabel8.setText("chon cho ngoi");

        jpnChonChoNgoi.setBackground(new java.awt.Color(0, 51, 255));

        javax.swing.GroupLayout jpnChonChoNgoiLayout = new javax.swing.GroupLayout(jpnChonChoNgoi);
        jpnChonChoNgoi.setLayout(jpnChonChoNgoiLayout);
        jpnChonChoNgoiLayout.setHorizontalGroup(
            jpnChonChoNgoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 546, Short.MAX_VALUE)
        );
        jpnChonChoNgoiLayout.setVerticalGroup(
            jpnChonChoNgoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 177, Short.MAX_VALUE)
        );

        jLabel9.setText("chon tau");

        jLabel10.setText("chon toa");

        jpnChonTau.setBackground(new java.awt.Color(0, 102, 255));

        javax.swing.GroupLayout jpnChonTauLayout = new javax.swing.GroupLayout(jpnChonTau);
        jpnChonTau.setLayout(jpnChonTauLayout);
        jpnChonTauLayout.setHorizontalGroup(
            jpnChonTauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 411, Short.MAX_VALUE)
        );
        jpnChonTauLayout.setVerticalGroup(
            jpnChonTauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );

        jpnChonToa.setBackground(new java.awt.Color(0, 204, 255));

        javax.swing.GroupLayout jpnChonToaLayout = new javax.swing.GroupLayout(jpnChonToa);
        jpnChonToa.setLayout(jpnChonToaLayout);
        jpnChonToaLayout.setHorizontalGroup(
            jpnChonToaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 411, Short.MAX_VALUE)
        );
        jpnChonToaLayout.setVerticalGroup(
            jpnChonToaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnGocLayout = new javax.swing.GroupLayout(jpnGoc);
        jpnGoc.setLayout(jpnGocLayout);
        jpnGocLayout.setHorizontalGroup(
            jpnGocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnGocLayout.createSequentialGroup()
                .addGroup(jpnGocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnGocLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jpnGocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnGocLayout.createSequentialGroup()
                                .addComponent(jButtonTimVe, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonDatVe1)
                                .addGap(543, 543, 543)
                                .addComponent(jLabel8))
                            .addGroup(jpnGocLayout.createSequentialGroup()
                                .addGroup(jpnGocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnGocLayout.createSequentialGroup()
                                        .addGroup(jpnGocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(43, 43, 43)
                                        .addGroup(jpnGocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cbbGaDi, 0, 198, Short.MAX_VALUE)
                                            .addComponent(cbbGaDen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnGocLayout.createSequentialGroup()
                                        .addGroup(jpnGocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rdb1Chieu)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGroup(jpnGocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jpnGocLayout.createSequentialGroup()
                                                .addGap(42, 42, 42)
                                                .addComponent(rdbKhuHoi))
                                            .addGroup(jpnGocLayout.createSequentialGroup()
                                                .addGap(150, 150, 150)
                                                .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jpnGocLayout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addGroup(jpnGocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(dpNgayVe, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                                    .addComponent(dpNgayDi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jpnGocLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpnGocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(30, 30, 30)
                        .addGroup(jpnGocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpnChonTau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpnChonToa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(jpnChonChoNgoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnGocLayout.createSequentialGroup()
                        .addGap(417, 417, 417)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jpnGocLayout.setVerticalGroup(
            jpnGocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnGocLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpnGocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnGocLayout.createSequentialGroup()
                        .addGroup(jpnGocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(cbbGaDi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jpnGocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbbGaDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpnGocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnGocLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(rdb1Chieu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addGroup(jpnGocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(dpNgayDi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(jpnGocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(dpNgayVe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpnGocLayout.createSequentialGroup()
                                .addComponent(rdbKhuHoi)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(jpnGocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonTimVe, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonDatVe1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonReset))
                        .addGap(6, 6, 6))
                    .addGroup(jpnGocLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)))
                .addGroup(jpnGocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnGocLayout.createSequentialGroup()
                        .addGroup(jpnGocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnGocLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jpnChonTau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpnGocLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel9)))
                        .addGroup(jpnGocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnGocLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel10))
                            .addGroup(jpnGocLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jpnChonToa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jpnGocLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jpnChonChoNgoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnGoc, javax.swing.GroupLayout.PREFERRED_SIZE, 1061, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnGoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTimVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTimVeActionPerformed
        // TODO add your handling code here:

        String gaDi = cbbGaDi.getSelectedItem().toString();
        String gaDen = cbbGaDen.getSelectedItem().toString();

        String loaiVe = rdb1Chieu.isSelected() ? "1 chieu" : "khu hoi";
        LocalDate ngayDi = dpNgayDi.getDate();
        LocalDate ngayVe = dpNgayVe.getDate();
        ArrayList<Chuyen> DSChuyenDi = new ArrayList<>();
        ArrayList<Chuyen> DSChuyenVe = new ArrayList<>();
        DSChuyenDi = timChuyen(gaDi, gaDen, ngayDi);// chon ra nhung chuyen co tuyen va ngay chay thich hop
        if (loaiVe.equals("khu hoi")) {
            // nếu đang trên tuyến đi thì về là tuyến về
            //nếu đang trên tuyến về thì về là tuyến đi
            DSChuyenVe = timChuyen(gaDi, gaDen, ngayVe);

        }
        jpnChonTau.removeAll();
        jpnChonTau.setLayout(new FlowLayout());
        // loai 1 chieu
        for (Chuyen chuyen : DSChuyenDi) {

//            HashMap<String, LocalDateTime> thoiGianTungTram = chuyen.getThoiGianTungTram(ngayDi // chon ra nhung chuyen co thoi gian den tram thicch hop
//                    .atTime(chuyen.getGioKhoiHanh(), 0), gaDi, gaDen);
            LocalDateTime thoiGianDenGaDi = null;
            LocalDateTime thoiGianDenGaDen = null;
            try {
                String loaiTuyen = null;
                 try {
                        ResultSet rsLoaiTuyen = LopKetNoi.select("select dbo.xacDinhLoaiTuyen(?,?,?)", chuyen.getMaTuyen(), gaDi, gaDen);
                        if(rsLoaiTuyen.next()){
                            loaiTuyen=rsLoaiTuyen.getString(1);
                        }
                    } catch (Exception e) {
                        System.out.println("xac dinh loai tuyen loi");
                    }
                ResultSet rsGaDi = LopKetNoi.select("select dbo.xacDinhThoiGianDenTram(?,?,?,?)",
                        chuyen.getMa(), ngayDi.atTime(chuyen.getGioKhoiHanh(), 0), gaDi, loaiTuyen);
                ResultSet rsGaDen = LopKetNoi.select("select dbo.xacDinhThoiGianDenTram(?,?,?,?)",
                        chuyen.getMa(), ngayDi.atTime(chuyen.getGioKhoiHanh(), 0), gaDen, loaiTuyen);
                if (rsGaDi.next() && rsGaDen.next()) {
                    System.out.println("Vao rs ga di den");
                    thoiGianDenGaDi = rsGaDi.getTimestamp(1).toLocalDateTime();
                    thoiGianDenGaDen = rsGaDen.getTimestamp(1).toLocalDateTime();

                }
            } catch (Exception e) {
                System.out.println("xac dinh thoi gian den tram loi");
            }
            System.out.println(thoiGianDenGaDi);
            System.out.println(thoiGianDenGaDen);
            if (thoiGianDenGaDi.toLocalDate().compareTo(ngayDi) != 0) {
                continue;
            }
            System.out.println(chuyen.getMaTuyen());

            String thongTin = "<html>" + "<br/>"
                    + "Tàu: " + chuyen.getMaTau()
                    + "<br/>Từ:" + thoiGianDenGaDi
                    + "<br/>Đến:" + thoiGianDenGaDen + "</html>";
            JButton btn1 = new JButton(thongTin);
            btn1.setSize(100, 100);
            btn1.setBackground(new Color(0, 204, 255));
            btn1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    maChuyenDuocChon = chuyen.getMa();
                    System.out.println(chuyen.getMa());
                    jpnChonToa.removeAll();
                    jpnChonToa.setLayout(new FlowLayout());
                    try {
                        ResultSet rs = LopKetNoi.select("select maToa from Chuyen, ToaThuocTau where maChuyen = ? "
                                + "and Chuyen.maTau = ToaThuocTau.maTau", maChuyenDuocChon);
                        while (rs.next()) {
                            JButton btn = new JButton(rs.getString(1));
                            btn.setBackground(new Color(0, 204, 255));
                            jpnChonToa.add(btn);
                        }
                    } catch (Exception e) {
                        System.out.println("loi chon toa");
                    }
                    jpnChonToa.validate();
                    jpnChonToa.repaint();
                }
            });
            jpnChonTau.add(btn1);
        }
        jpnChonTau.validate();
        jpnChonTau.repaint();
    }//GEN-LAST:event_jButtonTimVeActionPerformed

    private void rdb1ChieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb1ChieuActionPerformed
        // TODO add your handling code here:
//        jFormattedTextFieldNgayDi.setEnabled(true);
//        jFormattedTextFieldNgayVe.setEnabled(false);
//        jLabelChieu.setText("");
//        jTable1.setModel(new javax.swing.table.DefaultTableModel(
//            new Object [][] {
//
//            },
//            new String [] {
//                "Mã Tàu", "Mã Toa", "Ghế Số", "Thời Gian Đi", "Thời Gian Đến"
//            }
//        ) {
//            boolean[] canEdit = new boolean [] {
//                false, false, false, false
//            };
//
//            public boolean isCellEditable(int rowIndex, int columnIndex) {
//                return canEdit [columnIndex];
//            }
//        });
//        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
//        jScrollPane1.setViewportView(jTable1);
//        if (jTable1.getColumnModel().getColumnCount() > 0) {
//            jTable1.getColumnModel().getColumn(0).setResizable(false);
//            jTable1.getColumnModel().getColumn(1).setResizable(false);
//            jTable1.getColumnModel().getColumn(2).setResizable(false);
//            jTable1.getColumnModel().getColumn(3).setResizable(false);
//            jTable1.getColumnModel().getColumn(3).setPreferredWidth(163);
//            jTable1.getColumnModel().getColumn(4).setResizable(false);
//            jTable1.getColumnModel().getColumn(4).setPreferredWidth(163);
//        }
    }//GEN-LAST:event_rdb1ChieuActionPerformed

    private void rdbKhuHoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbKhuHoiActionPerformed
        // TODO add your handling code here:
//        jFormattedTextFieldNgayVe.setEnabled(true);
//        jLabelChieu.setText("Chiều đi");
//        jTable1.setModel(new javax.swing.table.DefaultTableModel(
//            new Object [][] {
//
//            },
//            new String [] {
//                "Chiều","Mã Tàu", "Mã Toa", "Ghế Số", "Thời Gian Đi", "Thời Gian Đến"
//            }
//        ) {
//            boolean[] canEdit = new boolean [] {
//                false, false, false, false
//            };
//
//            public boolean isCellEditable(int rowIndex, int columnIndex) {
//                return canEdit [columnIndex];
//            }
//        });
//        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
//        jScrollPane1.setViewportView(jTable1);
//        if (jTable1.getColumnModel().getColumnCount() > 0) {
//            jTable1.getColumnModel().getColumn(0).setResizable(false);
//            jTable1.getColumnModel().getColumn(1).setResizable(false);
//            jTable1.getColumnModel().getColumn(2).setResizable(false);
//            jTable1.getColumnModel().getColumn(3).setResizable(false);
//            jTable1.getColumnModel().getColumn(4).setResizable(false);
//            jTable1.getColumnModel().getColumn(4).setPreferredWidth(163);
//            jTable1.getColumnModel().getColumn(5).setResizable(false);
//            jTable1.getColumnModel().getColumn(5).setPreferredWidth(163);
//        }
    }//GEN-LAST:event_rdbKhuHoiActionPerformed

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//        int dongDuocChon= jTable1.getSelectedRow();
//        if (dongDuocChon!=-1)
//        {
//            if (rdb1Chieu.isSelected())
//            {
//                String maToaCanXoa=model.getValueAt(dongDuocChon,1).toString();
//                String soCuaChoNgoiCanXoa=model.getValueAt(dongDuocChon, 2).toString();
//                String thoiGianDiCuaToaCanXoa=model.getValueAt(dongDuocChon,3).toString();
//                NewJPanel jpnChuaChoNgoiCanXoa=JTabbedPaneDSToa.get(maToaCanXoa+" "+thoiGianDiCuaToaCanXoa);  //jpn chứa chỗ ngồi cần xoá
//                jpnChuaChoNgoiCanXoa.enableJToggleButton(jpnChuaChoNgoiCanXoa.getJToggleButtonByText(soCuaChoNgoiCanXoa));//lấy JToggleButton rồi enable nó
//                model.removeRow(dongDuocChon);
//            }
//            else
//            {
//                String maToaCanXoa=model.getValueAt(dongDuocChon,2).toString();
//                String soCuaChoNgoiCanXoa=model.getValueAt(dongDuocChon, 3).toString();
//                String thoiGianDiCuaToaCanXoa=model.getValueAt(dongDuocChon,4).toString();
//                NewJPanel jpnChuaChoNgoiCanXoa=JTabbedPaneDSToa.get(maToaCanXoa+" "+thoiGianDiCuaToaCanXoa);  //jpn chứa chỗ ngồi cần xoá
//                jpnChuaChoNgoiCanXoa.enableJToggleButton(jpnChuaChoNgoiCanXoa.getJToggleButtonByText(soCuaChoNgoiCanXoa));//lấy JToggleButton rồi enable nó
//                model.removeRow(dongDuocChon);
//            }
//        }
//        else
//        {
//            JOptionPane.showMessageDialog(this, "Chọn 1 dòng muốn xoá trong bảng!");
//        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonDatVe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDatVe1ActionPerformed
        // TODO add your handling code here:
//        for (int count=0;count<model.getRowCount();count++)
//        {
//            String tempMaTau=model.getValueAt(count,0).toString();//Table---|maTau,maToa,i.getText(),thoiGianDi,thoiGianDen|
//            String tempMaToa=model.getValueAt(count, 1).toString();
//            int tempChoNgoiSo=Integer.valueOf(model.getValueAt(count, 2).toString());
//            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm");
//            Date tempThoiGianDi=null;
//            try {
//                tempThoiGianDi=formatter.parse(model.getValueAt(count, 3).toString());
//            } catch (ParseException ex) {
//                ex.printStackTrace();
//            }
//            Timestamp timeStampThoiGianDi=new Timestamp(tempThoiGianDi.getTime());
//            Date tempThoiGianDen=null;
//            try {
//                tempThoiGianDen=formatter.parse(model.getValueAt(count, 4).toString());
//            } catch (ParseException ex) {
//                ex.printStackTrace();
//            }
//            Timestamp timeStampThoiGianDen=new Timestamp(tempThoiGianDen.getTime());
//            ketNoiCSDL.addVe(taiKhoan.getTenTaiKhoan(), tempChoNgoiSo, timeStampThoiGianDi, timeStampThoiGianDen, 0, "V01", tempMaToa, tempMaTau);
//        }

    }//GEN-LAST:event_jButtonDatVe1ActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        // TODO add your handling code here:
//        cbbGaDi.setSelectedIndex(0);
//        cbbGaDen.setSelectedIndex(0);
//        jFormattedTextFieldNgayDi.setText("");
//        jFormattedTextFieldNgayVe.setText("");
//        jTabbedPane1.removeAll();
//        model.setRowCount(0);
//        jButtonTimVe.setEnabled(true);
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void cbbGaDiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbGaDiActionPerformed
        // TODO add your handling code here:
        if (cbbGaDi.getItemCount() != 0) {
            String tenTramDi = cbbGaDi.getSelectedItem().toString();
            ArrayList<String> DSTramKeTiep = layTramKeTiep(tenTramDi);
            cbbGaDen.removeAllItems();
            for (String s : DSTramKeTiep) {
                cbbGaDen.addItem(s);
            }
        }
    }//GEN-LAST:event_cbbGaDiActionPerformed

    private ArrayList<Chuyen> timChuyen(String gaDi, String gaDen, LocalDate ngayDi) {

        ArrayList<Chuyen> DSChuyen = new ArrayList<>();
        try {
            // select nhung tuyen nao thoa di qua ca ga di va ga den
            ResultSet rsTuyen = LopKetNoi.select("select maTuyen from Tuyen where exists(select maTuyen from TuyenDiQuaTram "
                    + "where Tuyen.maTuyen = TuyenDiQuaTram.maTuyen and tenTram = ?) "
                    + "and exists(select maTuyen from TuyenDiQuaTram where Tuyen.maTuyen = TuyenDiQuaTram.maTuyen "
                    + "and tenTram = ?)", gaDi, gaDen);
            while (rsTuyen.next()) {
                String maTuyen = rsTuyen.getString(1);
                //chon chuyen thich hop dua vao ngay
                ResultSet rsChuyen = LopKetNoi.select("select Chuyen.* from Chuyen, NgayHoatDong "
                        + "where Chuyen.tenNgayHoatDong = NgayHoatDong.tenNgayHoatDong "
                        + "and maTuyen = ? "
                        + "and ngayBatDau <= ? and ngayKetThuc >= ?", maTuyen, ngayDi, ngayDi);
                // chon ra nhung chuyen co ngay di nam trong khoang thoi gian hoat dong
                while (rsChuyen.next()) {
                    System.out.println(rsChuyen.getString(1));
                    Chuyen chuyen = new Chuyen(rsChuyen.getString(1), rsChuyen.getString(2), rsChuyen.getString(3),
                            rsChuyen.getString(4), rsChuyen.getInt(5), rsChuyen.getDate(6).toLocalDate());
                    // kiểm tra xem ngày đi đó có tàu nào chạy không
                    // co 2 truong hop la ga di < ga den thi la luot di
                    // con ga di > ga den thi la luot ve
                    int khoangCachNgay = 0;
                    String loaiTuyen = "";
                    try {
                        ResultSet rsLoaiTuyen = LopKetNoi.select("select dbo.xacDinhLoaiTuyen(?,?,?)", maTuyen, gaDi, gaDen);
                        if(rsLoaiTuyen.next()){
                            loaiTuyen=rsLoaiTuyen.getString(1);
                        }
                    } catch (Exception e) {
                        System.out.println("xac dinh loai tuyen loi");
                    }
                    if (loaiTuyen.equals("di")) {// neu di thi lay ngay khoi  hanh
                        khoangCachNgay = (int) ChronoUnit.DAYS.between(chuyen.getNgayKhoiHanh(), ngayDi);
                        System.out.println("Khoang cach ngay:" + khoangCachNgay);
                    } else {// neu la ve thi lay ngay khoi hanh cong them chu ki tuyen chia 2
                        khoangCachNgay = (int) ChronoUnit.DAYS.between(chuyen.getNgayKhoiHanh().
                                plusDays(chuyen.getChuKiTuyen() / 2), ngayDi);
                        System.out.println("Ve Khoang cach ngay:" + khoangCachNgay);
                    }

                    if (khoangCachNgay % chuyen.getChuKiTuyen() == 0) { //là ngày đó có tàu chạy
                        System.out.println("ngay di ok" + chuyen.getMa());
                        DSChuyen.add(chuyen);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("LOI GET CHUYEN THICH HOP");
            e.printStackTrace();
        }
        return DSChuyen;
    }

    private void napGaDiGaDenVaoCBB() {
        try {
            ResultSet rs = LopKetNoi.select("select tenTram from Tram");
            while (rs.next()) {
                cbbGaDi.addItem(rs.getString(1));
            }
        } catch (Exception e) {
        }
        if (cbbGaDi.getItemCount() != 0) {
            cbbGaDi.setSelectedIndex(0);
        }
    }

    private ArrayList<String> layTramKeTiep(String tramDi) {
        ArrayList<String> DSTramKeTiep = new ArrayList<>();
        try {
            ResultSet rs = LopKetNoi.select("with dstuyen(maTuyen) as (select maTuyen from TuyenDiQuaTram where tenTram = ?) "
                    + "select  distinct tenTram  from dstuyen, TuyenDiQuaTram where dstuyen.maTuyen = TuyenDiQuaTram.maTuyen "
                    + "and tenTram != ?", tramDi, tramDi);
            while (rs.next()) {
                DSTramKeTiep.add(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return DSTramKeTiep;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbbGaDen;
    private javax.swing.JComboBox<String> cbbGaDi;
    private com.github.lgooddatepicker.components.DatePicker dpNgayDi;
    private com.github.lgooddatepicker.components.DatePicker dpNgayVe;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonDatVe1;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonTimVe;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel jpnChonChoNgoi;
    private javax.swing.JPanel jpnChonTau;
    private javax.swing.JPanel jpnChonToa;
    private javax.swing.JPanel jpnGoc;
    private javax.swing.JRadioButton rdb1Chieu;
    private javax.swing.JRadioButton rdbKhuHoi;
    // End of variables declaration//GEN-END:variables
}
