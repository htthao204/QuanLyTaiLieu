/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package QuanLyTaiLieu.Views;

import QuanLyTaiLieu.Controllers.NguoiDungController;
import QuanLyTaiLieu.Controllers.TaiLieuController1;
import QuanLyTaiLieu.Models.TaiLieu;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class LuaChonTaiLen extends javax.swing.JFrame {

    /**
     * Creates new form LuaChonTaiLen
     */
    public LuaChonTaiLen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnTaiThuMuc = new javax.swing.JButton();
        btnTaiTep = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        btnTaiThuMuc.setBackground(new java.awt.Color(255, 153, 153));
        btnTaiThuMuc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTaiThuMuc.setText("Tải thư mục lên");
        btnTaiThuMuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaiThuMucActionPerformed(evt);
            }
        });

        btnTaiTep.setBackground(new java.awt.Color(255, 153, 153));
        btnTaiTep.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTaiTep.setText("Tải tệp lên");
        btnTaiTep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaiTepActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Hủy");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTaiThuMuc)
                    .addComponent(btnTaiTep, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnTaiTep)
                .addGap(50, 50, 50)
                .addComponent(btnTaiThuMuc)
                .addGap(39, 39, 39)
                .addComponent(jButton1)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

private String getFileExtension(File file) {
    String fileName = file.getName();
    int dotIndex = fileName.lastIndexOf('.');
    if (dotIndex > 0) {
        return fileName.substring(dotIndex + 1).toLowerCase(); 
    }
    return "";  
}
    private void btnTaiTepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiTepActionPerformed
       
        try
        {
            JFileChooser fileChooser = new JFileChooser();
             fileChooser.setDialogTitle("Chọn các tệp để tải lên");
    fileChooser.setMultiSelectionEnabled(true);  // Cho phép chọn nhiều tệp

    int result = fileChooser.showOpenDialog(this);  // Hiển thị hộp thoại chọn tệp

    if (result == JFileChooser.APPROVE_OPTION) {
        File[] selectedFiles = fileChooser.getSelectedFiles();  // Lấy danh sách tệp đã chọn

        if (selectedFiles.length > 0) {
            NguoiDungController nguoiDungController = new NguoiDungController();
            String tenTaiKhoan = nguoiDungController.getTenTaiKhoanDangNhap();

            TaiLieuController1 taiLieuController = new TaiLieuController1();
            for (File file : selectedFiles) {
                if (file.isFile()) {
                    String filePath = file.getAbsolutePath();
                    String fileType = getFileExtension(file);

                    TaiLieu taiLieu = new TaiLieu();
                    taiLieu.setTenTL(file.getName());
                    taiLieu.setChuSoHuu(tenTaiKhoan);
                    taiLieu.setNgayTao(new java.util.Date());
                    taiLieu.setKichCo((int) file.length());
                    taiLieu.setLoai(fileType);
                    taiLieu.setDuongdan(filePath);
                    taiLieu.setDaXoa(false);

                    int resultUpload = taiLieuController.ThemTaiLieu(taiLieu, tenTaiKhoan);
                    if (resultUpload > 0) {
                        System.out.println("Tải lên thành công tệp: " + file.getName());
                        FormQuanLyTaiLieu formqltl=new FormQuanLyTaiLieu();
                        formqltl.show();
                        this.dispose();
                    } else {
                        System.out.println("Có lỗi khi tải lên tệp: " + file.getName());
                    }
                }
            }
            JOptionPane.showMessageDialog(this, "Các tệp đã được tải lên.");
        }
        } else {
            JOptionPane.showMessageDialog(this, "Không có tệp nào được chọn.");
        }
        
   } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Lỗi khi cập nhật: " + ex.getMessage());
           }
    }//GEN-LAST:event_btnTaiTepActionPerformed

    private void btnTaiThuMucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiThuMucActionPerformed
  JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Chọn thư mục để tải lên");
    fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);  // Chỉ cho phép chọn thư mục
    int result = fileChooser.showOpenDialog(this);  // Hiển thị hộp thoại chọn thư mục
    
    if (result == JFileChooser.APPROVE_OPTION) {  // Kiểm tra nếu người dùng chọn thư mục
        File selectedDirectory = fileChooser.getSelectedFile();  // Lấy thư mục đã chọn
        File[] files = selectedDirectory.listFiles();  // Lấy danh sách các tệp trong thư mục

        if (files != null) {
            NguoiDungController nguoiDungController = new NguoiDungController();
            String tenTaiKhoan = nguoiDungController.getTenTaiKhoanDangNhap();

            TaiLieuController1 taiLieuController = new TaiLieuController1();
            for (File file : files) {
                if (file.isFile()) {
                    String filePath = file.getAbsolutePath();
                    String fileType = getFileExtension(file);

                    // Tạo đối tượng TaiLieu
                    TaiLieu taiLieu = new TaiLieu();
                    taiLieu.setTenTL(file.getName());
                    taiLieu.setChuSoHuu(tenTaiKhoan);
                    taiLieu.setNgayTao(new java.util.Date());
                    taiLieu.setKichCo((int) file.length());
                    taiLieu.setLoai(fileType);
                    taiLieu.setDuongdan(filePath);
                    taiLieu.setDaXoa(false);

                    // Thêm tài liệu vào cơ sở dữ liệu
                    int resultUpload = taiLieuController.ThemTaiLieu(taiLieu, tenTaiKhoan);
                    if (resultUpload > 0) {
                        FormQuanLyTaiLieu formqltl=new FormQuanLyTaiLieu();
                        formqltl.show();
                        this.dispose();
                    } else {
                        System.out.println("Có lỗi khi tải lên tệp: " + file.getName());
                    }
                }
            }
            JOptionPane.showMessageDialog(this, "Các tệp trong thư mục đã được tải lên.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Không có thư mục nào được chọn.");
    }

    }//GEN-LAST:event_btnTaiThuMucActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

       FormQuanLyTaiLieu formqltl=new FormQuanLyTaiLieu();
       formqltl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LuaChonTaiLen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTaiTep;
    private javax.swing.JButton btnTaiThuMuc;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
