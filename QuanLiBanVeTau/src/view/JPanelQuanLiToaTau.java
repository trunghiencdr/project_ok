/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ChuyenManHinhView;
import view.quanlitau.JPanelDanhSachTau;
import view.quanlitau.JPanelDanhSachToa;

/**
 *
 * @author admin
 */
public class JPanelQuanLiToaTau extends javax.swing.JPanel {

    /**
     * Creates new form JPanelQuanLiToaTau
     */
    public JPanelQuanLiToaTau() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpnTauDangChay = new javax.swing.JPanel();
        jlbTauDangChay = new javax.swing.JLabel();
        jpnHieuChinh = new javax.swing.JPanel();
        jlbHieuChinh = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jpnTauDangChay.setBackground(new java.awt.Color(255, 255, 255));
        jpnTauDangChay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpnTauDangChayMousePressed(evt);
            }
        });

        jlbTauDangChay.setBackground(new java.awt.Color(255, 255, 255));
        jlbTauDangChay.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlbTauDangChay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/outline_subway_black_24dp.png"))); // NOI18N
        jlbTauDangChay.setText("DANH SÁCH TÀU");

        javax.swing.GroupLayout jpnTauDangChayLayout = new javax.swing.GroupLayout(jpnTauDangChay);
        jpnTauDangChay.setLayout(jpnTauDangChayLayout);
        jpnTauDangChayLayout.setHorizontalGroup(
            jpnTauDangChayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnTauDangChayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTauDangChay, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
        );
        jpnTauDangChayLayout.setVerticalGroup(
            jpnTauDangChayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnTauDangChayLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlbTauDangChay, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpnHieuChinh.setBackground(new java.awt.Color(255, 255, 255));
        jpnHieuChinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpnHieuChinhMousePressed(evt);
            }
        });

        jlbHieuChinh.setBackground(new java.awt.Color(255, 255, 255));
        jlbHieuChinh.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlbHieuChinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/outline_edit_road_black_24dp.png"))); // NOI18N
        jlbHieuChinh.setText("DANH SÁCH TOA");

        javax.swing.GroupLayout jpnHieuChinhLayout = new javax.swing.GroupLayout(jpnHieuChinh);
        jpnHieuChinh.setLayout(jpnHieuChinhLayout);
        jpnHieuChinhLayout.setHorizontalGroup(
            jpnHieuChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnHieuChinhLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbHieuChinh, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
        );
        jpnHieuChinhLayout.setVerticalGroup(
            jpnHieuChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbHieuChinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jpnTauDangChay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnHieuChinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(393, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpnHieuChinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnTauDangChay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(456, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jpnTauDangChayMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnTauDangChayMousePressed
        // TODO add your handling code here:
        new ChuyenManHinhView(this, new JPanelDanhSachTau()).change();
    }//GEN-LAST:event_jpnTauDangChayMousePressed

    private void jpnHieuChinhMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnHieuChinhMousePressed
        // TODO add your handling code here:
        new ChuyenManHinhView(this, new JPanelDanhSachToa()).change();
    }//GEN-LAST:event_jpnHieuChinhMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlbHieuChinh;
    private javax.swing.JLabel jlbTauDangChay;
    private javax.swing.JPanel jpnHieuChinh;
    private javax.swing.JPanel jpnTauDangChay;
    // End of variables declaration//GEN-END:variables
}
