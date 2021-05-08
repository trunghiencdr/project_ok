/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.datve;
import connectSQL.LopKetNoi;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import module.Tram;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JOptionPane;
import module.Tau;
import module.Tuyen;
import javax.swing.JTabbedPane;
import module.Toa;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import module.TaiKhoan;
import module.TauChayTuyen;
import module.TuyenDiQuaTram;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */

public class JPanelTimVeTau extends javax.swing.JPanel {

    LopKetNoi ketNoiCSDL;
    ArrayList<Tram> DSTram;
    ArrayList<TuyenDiQuaTram> DSTuyen;  //Dùng Tuyến Đi Qua Trạm mà không dùng Tuyến là vì để lấy được Mã trạm mà khách cần lên, VÌ TÌM TUYẾN THEO TRẠM
    ArrayList<TauChayTuyen> DSTau;//Dùng để lưu thông tin maTuyen, maTau, thời gian rước khách và trả khách 
    ArrayList<Toa> DSToa;
    TreeMap<String,JTabbedPane> JTabbedPaneDSTau;
    TreeMap<String,NewJPanel> JTabbedPaneDSToa;
    DefaultTableModel model;
    public TaiKhoan taiKhoan;
    /**
     * Creates new form PanelTimVeTau
     */
    public JPanelTimVeTau(TaiKhoan taiKhoan) {
        initComponents();
        this.taiKhoan=taiKhoan;
        JTabbedPaneDSTau=new TreeMap<String,JTabbedPane>();
        JTabbedPaneDSToa=new TreeMap<String, NewJPanel>();
        ketNoiCSDL=new LopKetNoi();
        DSTram=ketNoiCSDL.getDSTram();
        for (Tram i: DSTram)
        {
            jComboBoxGaDi.addItem(i.getTenTram());
            jComboBoxGaDen.addItem(i.getTenTram());
        }
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupChonChieuDi = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jButtonTimVe = new javax.swing.JButton();
        jRadioButton1Chieu = new javax.swing.JRadioButton();
        jRadioButtonKhuHoi = new javax.swing.JRadioButton();
        jFormattedTextFieldNgayDi = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jFormattedTextFieldNgayVe = new javax.swing.JFormattedTextField();
        jComboBoxGaDi = new javax.swing.JComboBox<>();
        jComboBoxGaDen = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jlbThoiGianDi = new javax.swing.JLabel();
        jButtonDatVe1 = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jLabelChieu = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setText("TÌM VÉ TÀU");

        jLabel2.setText("Ga đi");

        jLabel3.setText("Ga đến");

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jButtonTimVe.setText("Tìm vé");
        jButtonTimVe.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButtonTimVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTimVeActionPerformed(evt);
            }
        });

        buttonGroupChonChieuDi.add(jRadioButton1Chieu);
        jRadioButton1Chieu.setText("1 chiều");
        jRadioButton1Chieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ChieuActionPerformed(evt);
            }
        });

        buttonGroupChonChieuDi.add(jRadioButtonKhuHoi);
        jRadioButtonKhuHoi.setText("Khứ hồi");
        jRadioButtonKhuHoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonKhuHoiActionPerformed(evt);
            }
        });

        jFormattedTextFieldNgayDi.setEnabled(false);

        jLabel5.setText("Ngày đi");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });

        jLabel6.setText("Ngày về");

        jFormattedTextFieldNgayVe.setEnabled(false);

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

        jLabelChieu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelChieu.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonTimVe, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDatVe1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(277, 277, 277)
                                .addComponent(jButton1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(jLabelChieu, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlbThoiGianDi, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(134, 134, 134))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxGaDi, 0, 198, Short.MAX_VALUE)
                                    .addComponent(jComboBoxGaDen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton1Chieu)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(jRadioButtonKhuHoi))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jFormattedTextFieldNgayDi)
                                                .addComponent(jFormattedTextFieldNgayVe, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jComboBoxGaDi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jComboBoxGaDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jRadioButton1Chieu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(15, 15, 15)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButtonKhuHoi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldNgayDi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldNgayVe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlbThoiGianDi, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonTimVe, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonDatVe1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonReset))
                                .addGap(6, 6, 6))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelChieu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(jLabel1)
                .addContainerGap(596, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonKhuHoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonKhuHoiActionPerformed
        // TODO add your handling code here:
        jFormattedTextFieldNgayVe.setEnabled(true);
        jLabelChieu.setText("Chiều đi");
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Chiều","Mã Tàu", "Mã Toa", "Ghế Số", "Thời Gian Đi", "Thời Gian Đến"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(163);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(163);
        }
    }//GEN-LAST:event_jRadioButtonKhuHoiActionPerformed

    private void jButtonTimVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTimVeActionPerformed
        // TODO add your handling code here:
        String maTramDi=TimMaTramTuongUng((String)jComboBoxGaDi.getSelectedItem());
        String maTramDen=TimMaTramTuongUng((String)jComboBoxGaDen.getSelectedItem()); 
        String strNgayDi=jFormattedTextFieldNgayDi.getText();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try {
            formatter.parse(strNgayDi);
            DSTuyen=ketNoiCSDL.getTuyenPhuHop(maTramDi, maTramDen);
            if (DSTuyen.size()==0)
            {
                JOptionPane.showMessageDialog(this, "Không tìm được tuyến phù hợp");
            }
            else
            {
                jButtonTimVe.setEnabled(false);
                jButtonDatVe1.setEnabled(true);
                model=(DefaultTableModel) jTable1.getModel();
                for (TuyenDiQuaTram i:DSTuyen)
                {
                    DSTau=ketNoiCSDL.getTauTheoMaTuyen(i.getMaTuyen(),jFormattedTextFieldNgayDi.getText()); //DS Tàu có khoảng thời gian phù hợp
                    if (DSTau.size()==0)
                {
                    jButtonTimVe.setEnabled(true);
                    jButtonDatVe1.setEnabled(false);
                    JOptionPane.showMessageDialog(this, "Không tìm được tàu phù hợp");
                }
                    boolean timDuocItNhat1Tau=false;
                    for (TauChayTuyen j:DSTau)
                {
                    TauChayTuyen tauPhuHop=ketNoiCSDL.getTauPhuHop(i.getMaTuyen(), i.getSTTDi(), i.getSTTDen(),j.getMaTau(), j.getThoiGianKhoiHanh(), jFormattedTextFieldNgayDi.getText());
                    if (tauPhuHop!=null)
                    {
                    timDuocItNhat1Tau=true;
                    String thoiGianDi=tauPhuHop.getThoiGianKhoiHanh().toString();
                    String thoiGianDen=tauPhuHop.getThoiGianDen().toString();
                    thoiGianDi=thoiGianDi.substring(0, thoiGianDi.length()-5);  //bỏ giây và mili giây
                    thoiGianDen=thoiGianDen.substring(0, thoiGianDen.length()-5);  //bỏ giây và mili giây
                    JTabbedPane jTabbedPaneTau=new JTabbedPane();
                    JTabbedPaneDSTau.put(tauPhuHop.getMaTau(),jTabbedPaneTau);
                    jTabbedPane1.add(tauPhuHop.getMaTau(),jTabbedPaneTau);
                    DSToa=ketNoiCSDL.getToaTheoMaTau(tauPhuHop.getMaTau());
                    for (Toa l:DSToa)
                    {   
                        NewJPanel newJPanel;
                        switch (l.getMaLoaiToa()) {
                            case "LT10":
                                newJPanel=new JPanelNgoiCung80(j.getMaTau(),l.getMaToa(),thoiGianDi,thoiGianDen,model,jLabelChieu.getText());
                                JTabbedPaneDSToa.put(l.getMaToa()+" "+thoiGianDi,newJPanel);
                                jTabbedPaneTau.add(l.getMaToa(),newJPanel);
                                break;
                            case "LT11":
                                newJPanel=new JPanelNgoiCung80(j.getMaTau(),l.getMaToa(),thoiGianDi,thoiGianDen,model,jLabelChieu.getText());
                                jTabbedPaneTau.add(l.getMaToa(),newJPanel);
                                JTabbedPaneDSToa.put(l.getMaToa()+" "+thoiGianDi,newJPanel);
                                break;
                            case "LT20":
                                newJPanel=new JPanelNgoiMem56(j.getMaTau(),l.getMaToa(),thoiGianDi,thoiGianDen,model,jLabelChieu.getText());
                                JTabbedPaneDSToa.put(l.getMaToa()+" "+thoiGianDi,newJPanel);
                                jTabbedPaneTau.add(l.getMaToa(),newJPanel);
                                break;
                            case "LT21":
                                newJPanel=new JPanelNgoiMem56(j.getMaTau(),l.getMaToa(),thoiGianDi,thoiGianDen,model,jLabelChieu.getText());
                                JTabbedPaneDSToa.put(l.getMaToa()+" "+thoiGianDi,newJPanel);
                                jTabbedPaneTau.add(l.getMaToa(),newJPanel);
                                break;
                            case "LT30":
                                newJPanel=new JPanelGiuongNamKhoang642(j.getMaTau(),l.getMaToa(),thoiGianDi,thoiGianDen,model,jLabelChieu.getText());
                                JTabbedPaneDSToa.put(l.getMaToa()+" "+thoiGianDi,newJPanel);
                                jTabbedPaneTau.add(l.getMaToa(),newJPanel);
                                break;
                            case "LT31":
                                newJPanel=new JPanelGiuongNamKhoang642(j.getMaTau(),l.getMaToa(),thoiGianDi,thoiGianDen,model,jLabelChieu.getText());
                                JTabbedPaneDSToa.put(l.getMaToa()+" "+thoiGianDi,newJPanel);
                                jTabbedPaneTau.add(l.getMaToa(),newJPanel);
                                break;
                            case "LT40":
                                newJPanel=new JPanelGiuongNamKhoang428(j.getMaTau(),l.getMaToa(),thoiGianDi,thoiGianDen,model,jLabelChieu.getText());
                                JTabbedPaneDSToa.put(l.getMaToa()+" "+thoiGianDi,newJPanel);
                                jTabbedPaneTau.add(l.getMaToa(),newJPanel);
                                break;
                            case "LT41":
                                newJPanel=new JPanelGiuongNamKhoang428(j.getMaTau(),l.getMaToa(),thoiGianDi,thoiGianDen,model,jLabelChieu.getText());
                                JTabbedPaneDSToa.put(l.getMaToa()+" "+thoiGianDi,newJPanel);
                                jTabbedPaneTau.add(l.getMaToa(),newJPanel);
                                break;
                        }
                        }
                    }
                    else
                    {
                        if (timDuocItNhat1Tau=false) 
                        {
                            JOptionPane.showMessageDialog(this, "Không có tàu nào chạy trong ngày đã chọn!");
                            jButtonTimVe.setEnabled(true);
                            jButtonDatVe1.setEnabled(false);
                        }
                    }
                }
                }
            }
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Hãy nhập ngày theo định dạng yyyy-MM-dd");
        }
        
        
        
    }//GEN-LAST:event_jButtonTimVeActionPerformed

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MousePressed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int dongDuocChon= jTable1.getSelectedRow();
        if (dongDuocChon!=-1)
        {
            if (jRadioButton1Chieu.isSelected())
            {
                String maToaCanXoa=model.getValueAt(dongDuocChon,1).toString();
                String soCuaChoNgoiCanXoa=model.getValueAt(dongDuocChon, 2).toString();
                String thoiGianDiCuaToaCanXoa=model.getValueAt(dongDuocChon,3).toString();
                NewJPanel jpnChuaChoNgoiCanXoa=JTabbedPaneDSToa.get(maToaCanXoa+" "+thoiGianDiCuaToaCanXoa);  //jpn chứa chỗ ngồi cần xoá
                jpnChuaChoNgoiCanXoa.enableJToggleButton(jpnChuaChoNgoiCanXoa.getJToggleButtonByText(soCuaChoNgoiCanXoa));//lấy JToggleButton rồi enable nó
                model.removeRow(dongDuocChon);
            }
            else
            {
                String maToaCanXoa=model.getValueAt(dongDuocChon,2).toString();
                String soCuaChoNgoiCanXoa=model.getValueAt(dongDuocChon, 3).toString();
                String thoiGianDiCuaToaCanXoa=model.getValueAt(dongDuocChon,4).toString();
                NewJPanel jpnChuaChoNgoiCanXoa=JTabbedPaneDSToa.get(maToaCanXoa+" "+thoiGianDiCuaToaCanXoa);  //jpn chứa chỗ ngồi cần xoá
                jpnChuaChoNgoiCanXoa.enableJToggleButton(jpnChuaChoNgoiCanXoa.getJToggleButtonByText(soCuaChoNgoiCanXoa));//lấy JToggleButton rồi enable nó
                model.removeRow(dongDuocChon);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Chọn 1 dòng muốn xoá trong bảng!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        // TODO add your handling code here:
//        int indexTauDuocChon=jTabbedPane1.getSelectedIndex();
//        String maTauDuocChon=jTabbedPane1.getTitleAt(indexTauDuocChon);
//        for (TuyenDiQuaTram i:DSTuyen)
//        {
//            if (maTauDuocChon.equals(i.getM()))
//            {
//                jlbThoiGianDi.setText(formatThoiGianDi.format(i.getGioXuatTram()));
//            }
//        }
//    JOptionPane.showMessageDialog(this, jTabbedPane1.getTitleAt(jTabbedPane1.getSelectedIndex()));
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void jRadioButton1ChieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ChieuActionPerformed
        // TODO add your handling code here:
        jFormattedTextFieldNgayDi.setEnabled(true);
        jFormattedTextFieldNgayVe.setEnabled(false);
        jLabelChieu.setText("");
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Tàu", "Mã Toa", "Ghế Số", "Thời Gian Đi", "Thời Gian Đến"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(163);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(163);
        }
    }//GEN-LAST:event_jRadioButton1ChieuActionPerformed

    private void jButtonDatVe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDatVe1ActionPerformed
        // TODO add your handling code here:
        for (int count=0;count<model.getRowCount();count++)
        {
            String tempMaTau=model.getValueAt(count,0).toString();//Table---|maTau,maToa,i.getText(),thoiGianDi,thoiGianDen|
            String tempMaToa=model.getValueAt(count, 1).toString();
            int tempChoNgoiSo=Integer.valueOf(model.getValueAt(count, 2).toString());
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm");
            Date tempThoiGianDi=null;
            try {
                tempThoiGianDi=formatter.parse(model.getValueAt(count, 3).toString());
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
            Timestamp timeStampThoiGianDi=new Timestamp(tempThoiGianDi.getTime());
            Date tempThoiGianDen=null;
            try {
                tempThoiGianDen=formatter.parse(model.getValueAt(count, 4).toString());
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
            Timestamp timeStampThoiGianDen=new Timestamp(tempThoiGianDen.getTime());
            ketNoiCSDL.addVe(taiKhoan.getTenTaiKhoan(), tempChoNgoiSo, timeStampThoiGianDi, timeStampThoiGianDen, 0, "V01", tempMaToa, tempMaTau);
        }
        
    }//GEN-LAST:event_jButtonDatVe1ActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        // TODO add your handling code here:
        jComboBoxGaDi.setSelectedIndex(0);
        jComboBoxGaDen.setSelectedIndex(0);
        jFormattedTextFieldNgayDi.setText("");
        jFormattedTextFieldNgayVe.setText("");
        jTabbedPane1.removeAll();
        model.setRowCount(0);
        jButtonTimVe.setEnabled(true);
    }//GEN-LAST:event_jButtonResetActionPerformed
    public String TimMaTramTuongUng(String tenTram)
    {
        for (Tram i:DSTram)
        {
            if (i.getTenTram().equals(tenTram)) return i.getMaTram();
        }
        return "";
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupChonChieuDi;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonDatVe1;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonTimVe;
    private javax.swing.JComboBox<String> jComboBoxGaDen;
    private javax.swing.JComboBox<String> jComboBoxGaDi;
    private javax.swing.JFormattedTextField jFormattedTextFieldNgayDi;
    private javax.swing.JFormattedTextField jFormattedTextFieldNgayVe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelChieu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1Chieu;
    private javax.swing.JRadioButton jRadioButtonKhuHoi;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jlbThoiGianDi;
    // End of variables declaration//GEN-END:variables
}