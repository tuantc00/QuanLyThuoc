package btl_qlkhachhang;

import java.io.IOException;
import java.util.*;
import javax.swing.JOptionPane;
import object.*;
import object.FileUtils;

/**
 *
 * @author ddung
 */
public class TimKiemDonHang extends javax.swing.JFrame {

    /**
     * Creates new form TimKiemDonHang
     */
    ArrayList<KhachHang> dsKH = new ArrayList<>();
    ArrayList<DonHang> dsDH = new ArrayList<>();

    public TimKiemDonHang() {
        initComponents();
        if (getData("khachhang.txt") != null) {
            dsKH = getData("khachhang.txt");
        }
        // loadKHTable(dsKH);
        if (getData("donhang.txt") != null) {
            dsDH = getData("donhang.txt");
        }
        loadDHTable(dsDH);
        //txtTong.enable(false);

        //
        loadComboBoxData();
        disableTextFields();
//        txtTenKH.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbTimKiemDH = new javax.swing.JTable();
        btnQuayLai = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTenKH = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnSapXep = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        maKHComboBox = new javax.swing.JComboBox<>();
        maDonThuocComboBox = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtTenDonThuoc = new javax.swing.JTextField();
        timKiemBtn = new javax.swing.JButton();
        labelSoTienMin = new javax.swing.JLabel();
        labelSoTienMax = new javax.swing.JLabel();
        txtSoTienMin = new javax.swing.JTextField();
        txtSoTienMax = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbTimKiemDH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbTimKiemDH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTimKiemDHMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbTimKiemDH);

        btnQuayLai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnQuayLai.setText("<-- Quay lại");
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });

        jLabel8.setText("Mã khách hàng");

        jLabel9.setText("Tên khách hàng");

        jLabel10.setText("Mã đơn thuốc");

        btnSapXep.setText("Sắp xếp");
        btnSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        maKHComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        maDonThuocComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        maDonThuocComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maDonThuocComboBoxActionPerformed(evt);
            }
        });

        jLabel12.setText("Tên đơn thuốc");

        timKiemBtn.setText("Tìm kiếm");
        timKiemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timKiemBtnActionPerformed(evt);
            }
        });

        labelSoTienMin.setText("Số tiền từ");

        labelSoTienMax.setText("đến");

        txtSoTienMin.setText("0");

        txtSoTienMax.setText("122");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel3.setText("Tìm kiếm đơn hàng");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10)
                                .addComponent(jLabel12))
                            .addGap(31, 31, 31)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtTenKH)
                                .addComponent(maKHComboBox, 0, 169, Short.MAX_VALUE)
                                .addComponent(maDonThuocComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTenDonThuoc))
                            .addGap(43, 43, 43)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(labelSoTienMax, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtSoTienMax))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(labelSoTienMin, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtSoTienMin, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(92, 92, 92)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(90, 90, 90)
                                    .addComponent(btnXoa)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnSapXep))
                                .addComponent(timKiemBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(339, 339, 339))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(btnXoa)
                    .addComponent(btnSapXep)
                    .addComponent(maKHComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSoTienMin)
                    .addComponent(txtSoTienMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timKiemBtn)
                    .addComponent(labelSoTienMax)
                    .addComponent(txtSoTienMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(maDonThuocComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenDonThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Lấy ds trong file
    public ArrayList getData(String fileName) {
        ArrayList ds = new ArrayList<>();
        try {
            ds = FileUtils.docDanhSachTuFile(fileName);
        } catch (IOException | ClassNotFoundException e) {
//            JOptionPane.showMessageDialog(rootPane, e);
            JOptionPane.showMessageDialog(rootPane, "Không lấy được dữ liệu");
        }
        return ds;
    }

    public void loadDHTable(ArrayList list) {
        tbTimKiemDH.setModel(new DonHangTable(list));
    }

    private void loadComboBoxData() {
        HashSet<String> maKHSet = new HashSet<>();
        HashSet<String> maDonThuocSet = new HashSet<>();

        for (KhachHang kh : dsKH) {
            maKHSet.add(kh.getMakh());
        }
        for (DonHang dh : dsDH) {
            maDonThuocSet.add(dh.getMadh());
        }

        maKHComboBox.removeAllItems();
        maDonThuocComboBox.removeAllItems();

        for (String maKH : maKHSet) {
            maKHComboBox.addItem(maKH);
        }
        for (String maDonThuoc : maDonThuocSet) {
            maDonThuocComboBox.addItem(maDonThuoc);
        }
    }

    private void disableTextFields() {
        txtTenKH.setEnabled(false);
        //txtTenKH.setText("123");
        txtTenDonThuoc.setEnabled(false);
    }

    private void tbTimKiemDHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTimKiemDHMouseClicked
        // TODO add your handling code here:
        int dong = tbTimKiemDH.getSelectedRow();
        if (dong != -1) {
            DonHang dh = dsDH.get(dong);
            txtTenDonThuoc.setText(dh.getTenThuoc());
        }
    }//GEN-LAST:event_tbTimKiemDHMouseClicked

    private void btnSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnSapXepActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnXoaActionPerformed

    private void timKiemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timKiemBtnActionPerformed
        // TODO add your handling code here:
        String maKH = (String) maKHComboBox.getSelectedItem();
        String maDonThuoc = (String) maDonThuocComboBox.getSelectedItem();
        String tenKH = txtTenKH.getText().trim();
        String tenDonThuoc = txtTenDonThuoc.getText().trim();
        String soTienMinStr = txtSoTienMin.getText().trim();
        String soTienMaxStr = txtSoTienMax.getText().trim();

        double soTienMin = 0;
        double soTienMax = Double.MAX_VALUE;

        try {
            soTienMin = Double.parseDouble(soTienMinStr);
            soTienMax = Double.parseDouble(soTienMaxStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số tiền hợp lệ");
            return;
        }

        ArrayList<KhachHang> filteredKH = new ArrayList<>();
        ArrayList<DonHang> filteredDH = new ArrayList<>();

        for (KhachHang kh : dsKH) {
            if (maKH.equals(kh.getMakh())) {
                filteredKH.add(kh);
            }
            
            txtTenKH.setText(kh.getTenKh());
        }

        if (filteredKH.isEmpty() != true) {

            for (DonHang dh : dsDH) {
                if ((maDonThuoc.equals(dh.getMadh()) && maKH.equals(dh.getMakh()))
                        && (dh.getTien() >= soTienMin && dh.getTien() <= soTienMax)) {
                    filteredDH.add(dh);
                }
            }

            loadDHTable(filteredDH);
        }
    }//GEN-LAST:event_timKiemBtnActionPerformed

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
        // TODO add your handling code here:
        GiaoDien gd = new GiaoDien();
        gd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQuayLaiActionPerformed

    private void maDonThuocComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maDonThuocComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maDonThuocComboBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TimKiemDonHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TimKiemDonHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TimKiemDonHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TimKiemDonHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TimKiemDonHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnSapXep;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelSoTienMax;
    private javax.swing.JLabel labelSoTienMin;
    private javax.swing.JComboBox<String> maDonThuocComboBox;
    private javax.swing.JComboBox<String> maKHComboBox;
    private javax.swing.JTable tbTimKiemDH;
    private javax.swing.JButton timKiemBtn;
    private javax.swing.JTextField txtSoTienMax;
    private javax.swing.JTextField txtSoTienMin;
    private javax.swing.JTextField txtTenDonThuoc;
    private javax.swing.JTextField txtTenKH;
    // End of variables declaration//GEN-END:variables
}
