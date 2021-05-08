/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.quanlitau;

import connectSQL.LopKetNoi;
import controller.ChuyenManHinhView;
import java.awt.event.MouseEvent;
import java.security.interfaces.DSAKeyPairGenerator;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;
import view.JPanelQuanLiToaTau;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class JPanelDanhSachTau extends javax.swing.JPanel {

    // loai button
    private String them = "THÊM TÀU";
    private String sua = "SỬA TÀU";
    private String thongTin = "THÔNG TIN TÀU";

    private DefaultTableModel tbmTau;
    private int hangDangChon = -1;
    private DefaultListModel<String> lmToa;

    /**
     * Creates new form JPanelDanhSachTau
     */
    public JPanelDanhSachTau() {
        initComponents();
        tbmTau = (DefaultTableModel) jtbTau.getModel();
        lmToa = new DefaultListModel<>();

        loadBangTau(LopKetNoi.select("select * from tau"), jtbTau);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdlThongTinTau = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jlbTenDialog = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfMaTau = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jlToa = new javax.swing.JList<>();
        btnXacNhan = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jlbMaTau = new javax.swing.JLabel();
        jlbSoLuongToa = new javax.swing.JLabel();
        jtfSoLuongToa = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jtbTau = new javax.swing.JTable();
        jLabel50 = new javax.swing.JLabel();
        btnThem1 = new javax.swing.JButton();
        btnSua1 = new javax.swing.JButton();
        btnXoa1 = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        jtfTimKiem1 = new javax.swing.JTextField();
        cbbTimKiem1 = new javax.swing.JComboBox<>();
        cbbSapXep1 = new javax.swing.JComboBox<>();
        jLabel52 = new javax.swing.JLabel();
        btnTroVe1 = new javax.swing.JButton();
        btnThongTin1 = new javax.swing.JButton();
        jSeparator25 = new javax.swing.JSeparator();
        jSeparator26 = new javax.swing.JSeparator();

        jdlThongTinTau.setMinimumSize(new java.awt.Dimension(435, 500));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jlbTenDialog.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jlbTenDialog.setText("THÊM TÀU");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Mã tàu:");

        jtfMaTau.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfMaTau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfMaTauActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Chọn toa:");

        jlToa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlToa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlToaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jlToa);

        btnXacNhan.setBackground(new java.awt.Color(255, 255, 255));
        btnXacNhan.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnXacNhan.setText("XÁC NHẬN");
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Số lượng toa:");

        jlbMaTau.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jlbMaTau.setForeground(new java.awt.Color(255, 51, 0));
        jlbMaTau.setText(" a");

        jlbSoLuongToa.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jlbSoLuongToa.setForeground(new java.awt.Color(255, 51, 0));
        jlbSoLuongToa.setText("a");

        jtfSoLuongToa.setEditable(false);
        jtfSoLuongToa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfSoLuongToa.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jlbTenDialog))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlbSoLuongToa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlbMaTau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfMaTau)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addComponent(jtfSoLuongToa, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(btnXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jlbTenDialog)
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfMaTau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbMaTau)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfSoLuongToa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jlbSoLuongToa)
                .addGap(57, 57, 57)
                .addComponent(btnXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jdlThongTinTauLayout = new javax.swing.GroupLayout(jdlThongTinTau.getContentPane());
        jdlThongTinTau.getContentPane().setLayout(jdlThongTinTauLayout);
        jdlThongTinTauLayout.setHorizontalGroup(
            jdlThongTinTauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jdlThongTinTauLayout.setVerticalGroup(
            jdlThongTinTauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jLabel49.setBackground(new java.awt.Color(255, 255, 255));
        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel49.setText("DANH SÁCH TÀU");

        jtbTau.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtbTau.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ TÀU", "DANH SÁCH TOA", "SỐ LƯỢNG TOA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbTau.setGridColor(new java.awt.Color(255, 255, 255));
        jtbTau.setRowHeight(25);
        jtbTau.setSelectionBackground(new java.awt.Color(51, 204, 255));
        jtbTau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbTauMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtbTauMousePressed(evt);
            }
        });
        jScrollPane13.setViewportView(jtbTau);

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel50.setText("Chức năng");

        btnThem1.setBackground(new java.awt.Color(255, 255, 255));
        btnThem1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnThem1.setText("THÊM");
        btnThem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem1ActionPerformed(evt);
            }
        });

        btnSua1.setBackground(new java.awt.Color(255, 255, 255));
        btnSua1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSua1.setText("SỬA");
        btnSua1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua1ActionPerformed(evt);
            }
        });

        btnXoa1.setBackground(new java.awt.Color(255, 255, 255));
        btnXoa1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnXoa1.setText("XÓA");
        btnXoa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa1ActionPerformed(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel51.setText("Tìm kiếm:");

        jtfTimKiem1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfTimKiem1KeyReleased(evt);
            }
        });

        cbbTimKiem1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbbTimKiem1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã tàu", "Mã toa" }));

        cbbSapXep1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbbSapXep1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã tàu a-z", "Mã tàu z-a" }));
        cbbSapXep1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbSapXep1ActionPerformed(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel52.setText("Sắp xếp:");

        btnTroVe1.setBackground(new java.awt.Color(255, 255, 255));
        btnTroVe1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/outline_arrow_back_black_24dp_1.png"))); // NOI18N
        btnTroVe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTroVe1ActionPerformed(evt);
            }
        });

        btnThongTin1.setBackground(new java.awt.Color(255, 255, 255));
        btnThongTin1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnThongTin1.setText("THÔNG TIN");
        btnThongTin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongTin1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(btnTroVe1)
                        .addGap(255, 255, 255)
                        .addComponent(jLabel49)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator26)
                            .addComponent(jSeparator25)
                            .addComponent(jScrollPane13)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addComponent(jLabel50)
                                        .addGap(59, 59, 59)
                                        .addComponent(btnThem1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(74, 74, 74)
                                        .addComponent(btnSua1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                                        .addComponent(btnXoa1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addComponent(jLabel51)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfTimKiem1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbbTimKiem1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel52)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbbSapXep1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnThongTin1, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(0, 32, Short.MAX_VALUE))))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnTroVe1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel49)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(btnThem1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThongTin1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator26, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbSapXep1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52)
                    .addComponent(jtfTimKiem1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51)
                    .addComponent(cbbTimKiem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtbTauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbTauMouseClicked
        // TODO add your handling code here:
        hangDangChon = jtbTau.getSelectedRow();
    }//GEN-LAST:event_jtbTauMouseClicked

    private void jtbTauMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbTauMousePressed
        // TODO add your handling code here:
        hangDangChon = jtbTau.getSelectedRow();
        if (hangDangChon != -1) {
            if (evt.getButton() == MouseEvent.BUTTON3) {
                hienThiDialog(thongTin);
            }
        }
    }//GEN-LAST:event_jtbTauMousePressed

    private void btnThem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem1ActionPerformed
        // TODO add your handling code here:
        hienThiDialog(them);
    }//GEN-LAST:event_btnThem1ActionPerformed

    private void btnSua1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua1ActionPerformed
        // TODO add your handling code here:
        if (hangDangChon < 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn đối tượng! Vui lòng chọn 1 dòng trong bảng");
        } else {
            hienThiDialog(sua);
        }
    }//GEN-LAST:event_btnSua1ActionPerformed

    private void btnXoa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa1ActionPerformed
        // TODO add your handling code here:
        if (hangDangChon < 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn đối tượng! Vui lòng chọn 1 hàng trong bảng");

        } else {
            int input = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa không?", "Cảnh báo", JOptionPane.YES_NO_OPTION);
            if (input == JOptionPane.YES_OPTION) {
                String maTau = jtbTau.getValueAt(hangDangChon, 0).toString();
                try {
                    if (LopKetNoi.update("delete from tau where maTau = ?", maTau)) {
                        tbmTau.removeRow(hangDangChon);
                        hangDangChon = -1;
                        jtbTau.clearSelection();
                    } else {
                        JOptionPane.showMessageDialog(this, "Không thể xóa vì có tàu đang chạy");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_btnXoa1ActionPerformed

    private void jtfTimKiem1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfTimKiem1KeyReleased
        // TODO add your handling code here:

        if (cbbTimKiem1.getSelectedIndex() == 0) {// tim kiem theo ma tau
            String maTau = jtfTimKiem1.getText();
            loadBangTau(LopKetNoi.select("select maTau, soLuongToa from tau where maTau like ?",
                    "%" + maTau + "%"), jtbTau);
        } else {// tim kiem theo ten tuyen
            String maToa = jtfTimKiem1.getText().trim();
            loadBangTau(LopKetNoi.select("select maTau, soLuongToa from tau, toaThuocTau where maToa like ?",
                    "%" + maToa + "%"), jtbTau);
        }
        hangDangChon = -1;
        jtbTau.clearSelection();
    }//GEN-LAST:event_jtfTimKiem1KeyReleased

    private void cbbSapXep1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbSapXep1ActionPerformed
        // TODO add your handling code here:
        if (cbbSapXep1.getSelectedIndex() == 0) {// sap xep ma tau tu a - z
            loadBangTau(LopKetNoi.select("select * from tau order by maTau ASC"), jtbTau);
        } else {// ma tau z-a
            loadBangTau(LopKetNoi.select("select * from tau order by maTau DESC"), jtbTau);
        }
        hangDangChon = -1;
        jtbTau.clearSelection();
    }//GEN-LAST:event_cbbSapXep1ActionPerformed

    private void btnTroVe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTroVe1ActionPerformed
        // TODO add your handling code here:
        new ChuyenManHinhView(this, new JPanelQuanLiToaTau()).change();
    }//GEN-LAST:event_btnTroVe1ActionPerformed

    private void btnThongTin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongTin1ActionPerformed
        // TODO add your handling code here:
        if (hangDangChon == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn 1 hàng trong bảng");
        } else
            hienThiDialog(thongTin);
    }//GEN-LAST:event_btnThongTin1ActionPerformed

    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanActionPerformed
        String loai = jlbTenDialog.getText();
        if (loai.equals(thongTin)) {
            jdlThongTinTau.dispose();
        } else if (loai.equals(them)) {
            if (themTau()) {
                JOptionPane.showMessageDialog(jdlThongTinTau, "Thêm thành công");
                setTruongRong();
                setThongBaoRong();
                loadDSToaChuaCoTauVaoList(jlToa);

            } else {
                JOptionPane.showMessageDialog(jdlThongTinTau, "Thêm thất bại");
            }
            hangDangChon = jtbTau.getRowCount() - 1;
        } else if (loai.equals(sua)) {
            if (suaTau()) {
                JOptionPane.showMessageDialog(jdlThongTinTau, "Sửa thành công");
            } else {
                JOptionPane.showMessageDialog(jdlThongTinTau, "Sửa thất bại");
            }
            jdlThongTinTau.dispose();
        }
    }//GEN-LAST:event_btnXacNhanActionPerformed

    private void jtfMaTauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMaTauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfMaTauActionPerformed

    private void jlToaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlToaMouseClicked
        // TODO add your handling code here:
        jtfSoLuongToa.setText(jlToa.getSelectedValuesList().size() + "");
    }//GEN-LAST:event_jlToaMouseClicked
//===============================================================================================
// load ds can thiet

    private void loadBangTau(ResultSet rs, JTable jtbTau) {

        DefaultTableModel model = (DefaultTableModel) jtbTau.getModel();
        model.setRowCount(0);
        try {
            while (rs.next()) {
                String maTau = rs.getString(1);
                String dsToa = "";
                try {
                    ResultSet rsToa = LopKetNoi.select("select maToa from ToaThuocTau where maTau = ?", maTau);
                    while (rsToa.next()) {
                        dsToa += rsToa.getString(1) + "-";
                    }
                    dsToa = dsToa.substring(0, dsToa.length() - 1);
                } catch (Exception e) {
                    System.out.println("Load bang tau that bai");
                    e.printStackTrace();
                }
                model.addRow(new Object[]{maTau, dsToa, rs.getString(2)});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //==================================================================
    private void setThongBaoRong() {
        jlbMaTau.setText(" ");
        jlbSoLuongToa.setText(" ");
    }

    private void hienTruong() {
        jtfMaTau.setEditable(true);
        jlToa.setEnabled(true);
    }

    private void tatTruong() {
        jtfMaTau.setEditable(false);
        jlToa.setEnabled(false);
    }

    private void setTruongRong() {
        jtfMaTau.setText("");
        jlToa.clearSelection();
    }

    public void setSelectedValues(JList list, ArrayList ds) {
        list.clearSelection();
        for (Object value : ds) {
            int index = getIndex((DefaultListModel) list.getModel(), value);
            System.out.println(index);
            if (index >= 0) {
                list.addSelectionInterval(index, index);
            }
        }
        list.ensureIndexIsVisible(list.getSelectedIndex());
    }

    public int getIndex(DefaultListModel model, Object value) {
        if (value == null) {
            return -1;
        }
        return model.indexOf(value);
    }

    private ArrayList<String> getDSToa(String maTau) {
        ArrayList<String> dsToa = new ArrayList<>();
        try {
            ResultSet rs = LopKetNoi.select("select maToa from ToaThuocTau where maTau = ?", maTau);
            while (rs.next()) {
                dsToa.add(rs.getString(1));
            }
        } catch (Exception e) {
            System.out.println("get ds toa that bai");
        }
        return dsToa;
    }

    private void loadThongTinSua() {
        String maTau = (String) jtbTau.getValueAt(hangDangChon, 0);
        jtfMaTau.setText(maTau);
        loadDSToaChuaCoTauVaoList(jlToa);
        ArrayList<String> DSToa = getDSToa(jtbTau.getValueAt(hangDangChon, 0).toString());
        lmToa = (DefaultListModel<String>) jlToa.getModel();
        for (String s : DSToa) {
            lmToa.addElement(s);
        }
        jlToa.setModel(lmToa);
        setSelectedValues(jlToa, DSToa);

    }

    private void loadDSToaChuaCoTauVaoList(JList jl) {
        DefaultListModel<String> model = new DefaultListModel<>();
        try {
            ResultSet rs = LopKetNoi.select("select maToa from Toa where not exists(select maToa from ToaThuocTau "
                    + "where Toa.maToa = ToaThuocTau.maToa) ");
            while (rs.next()) {
                model.addElement(rs.getString(1));
            }
            jl.setModel(model);
        } catch (Exception e) {
            System.out.println("load ds toa vao list sai");
            e.printStackTrace();
        }
        jl.setModel(model);
    }

    private void hienThiDialog(String loai) {
        setThongBaoRong();
        hienTruong();
        if (loai.equals(them)) {
            setTruongRong();
            loadDSToaChuaCoTauVaoList(jlToa);
        } else if (loai.equals(sua)) {
            jtfMaTau.setEditable(false);
            loadThongTinSua();
        } else if (loai.equals(thongTin)) {
            tatTruong();
            setThongBaoRong();
            jtfMaTau.setText(jtbTau.getValueAt(hangDangChon, 0).toString());
            lmToa.removeAllElements();
            ArrayList<String> dsToa = getDSToa(jtbTau.getValueAt(hangDangChon, 0).toString());
            for (String s : dsToa) {
                lmToa.addElement(s);
            }
            setSelectedValues(jlToa, dsToa);
            jlToa.setModel(lmToa);
            jtfSoLuongToa.setText(dsToa.size() + "");
        }

        jlbTenDialog.setText(loai);
        jdlThongTinTau.setLocationRelativeTo(this);
        jdlThongTinTau.setVisible(true);
    }

    private boolean kiemTraThemTau() {
        // kiem tra ma trung va so luong toa
        if (jtfMaTau.getText().equals("")) {
            jlbMaTau.setText("Không được để trống");
        } else {
            try {
                ResultSet rs = LopKetNoi.select("select maTau from Tau where maTau = ?", jtfMaTau.getText().trim());
                if (rs.next()) {
                    jlbMaTau.setText("Mã tàu đã tồn tại");
                } else {
                    jlbMaTau.setText(" ");
                }
            } catch (Exception e) {
                System.out.println("Kiểm tra mã tàu lỗi");
            }
        }

        // kiểm tra số lượng toa
        if (Integer.parseInt(jtfSoLuongToa.getText()) == 0) {
            jlbSoLuongToa.setText("Số lượng toa ít nhất là 1");
        } else {
            jlbSoLuongToa.setText(" ");
        }

        if (jlbMaTau.getText().equals(" ") && jlbSoLuongToa.getText().equals(" ")) {
            return true;
        } else {
            return false;
        }

    }

    private boolean themTau() {
        if (kiemTraThemTau()) {
            String maTau = jtfMaTau.getText().trim();
            ArrayList<String> DSToa = (ArrayList<String>) jlToa.getSelectedValuesList();
            LopKetNoi.update("insert into tau values(?,?)", maTau, DSToa.size());
            String chuoiToa = "";
            for (String s : DSToa) {
                LopKetNoi.update("insert into ToaThuocTau values(?,?)", maTau, s);
                chuoiToa += s + "-";
            }
            // them vao bang
            chuoiToa = chuoiToa.substring(0, chuoiToa.length() - 1);
            tbmTau.addRow(new Object[]{maTau, chuoiToa, DSToa.size()});
            int hangCuoi = jtbTau.getRowCount();
            jtbTau.scrollRectToVisible(jtbTau.getCellRect(hangCuoi - 1, 0, true));
            jtbTau.clearSelection();
            jtbTau.setRowSelectionInterval(hangCuoi - 1, hangCuoi - 1);
            return true;

        } else {
            return false;
        }
    }

    private boolean suaTau() {
        String maTau = jtfMaTau.getText();
        ArrayList<String> DSToa = (ArrayList<String>) jlToa.getSelectedValuesList();
        try {
            LopKetNoi.update("update tau set soLuongToa = ? where maTau = ?", DSToa.size(), maTau);
            LopKetNoi.update("delete from ToaThuocTau where maTau = ? ", maTau);
            String chuoiToa = "";
            for (String toa : DSToa) {
                LopKetNoi.update("insert into ToaThuocTau values(?,?)", maTau, toa);
                chuoiToa += toa + "-";
            }
            chuoiToa = chuoiToa.substring(0, chuoiToa.length() - 1);
            jtbTau.setValueAt(chuoiToa, hangDangChon, 1);
            jtbTau.setValueAt(DSToa.size(), hangDangChon, 2);

        } catch (Exception e) {
            System.out.println("sua tau that bai");
            e.printStackTrace();
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua1;
    private javax.swing.JButton btnThem1;
    private javax.swing.JButton btnThongTin1;
    private javax.swing.JButton btnTroVe1;
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JButton btnXoa1;
    private javax.swing.JComboBox<String> cbbSapXep1;
    private javax.swing.JComboBox<String> cbbTimKiem1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JDialog jdlThongTinTau;
    private javax.swing.JList<String> jlToa;
    private javax.swing.JLabel jlbMaTau;
    private javax.swing.JLabel jlbSoLuongToa;
    private javax.swing.JLabel jlbTenDialog;
    private javax.swing.JTable jtbTau;
    private javax.swing.JTextField jtfMaTau;
    private javax.swing.JTextField jtfSoLuongToa;
    private javax.swing.JTextField jtfTimKiem1;
    // End of variables declaration//GEN-END:variables
}