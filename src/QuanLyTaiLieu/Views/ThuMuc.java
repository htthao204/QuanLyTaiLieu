/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package QuanLyTaiLieu.Views;

import QuanLyTaiLieu.Controllers.NguoiDungController;
import QuanLyTaiLieu.Controllers.ThuMucController;
import QuanLyTaiLieu.Models.ThuMucModel;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class ThuMuc extends javax.swing.JFrame {

    /**
     * Creates new form ThuMuc
     */
    public ThuMuc() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnNguoiDung = new javax.swing.JButton();
        btnTaiLieu = new javax.swing.JButton();
        btnQuyenTruyCap = new javax.swing.JButton();
        btnThuMuc = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        btnTrangChu = new javax.swing.JButton();
        btnThungRac1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnTaiXuong = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbThuMuc = new javax.swing.JTable();
        btnXem = new javax.swing.JButton();
        btnTaiLen = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 4));

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setFocusTraversalPolicyProvider(true);

        btnNguoiDung.setBackground(new java.awt.Color(0, 128, 128));
        btnNguoiDung.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNguoiDung.setForeground(new java.awt.Color(204, 255, 255));
        btnNguoiDung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/group.png"))); // NOI18N
        btnNguoiDung.setText("  NGƯỜI DÙNG");
        btnNguoiDung.setPreferredSize(new java.awt.Dimension(197, 39));
        btnNguoiDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNguoiDungActionPerformed(evt);
            }
        });

        btnTaiLieu.setBackground(new java.awt.Color(0, 128, 128));
        btnTaiLieu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTaiLieu.setForeground(new java.awt.Color(204, 255, 255));
        btnTaiLieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paper.png"))); // NOI18N
        btnTaiLieu.setText("  TÀI LIỆU");
        btnTaiLieu.setPreferredSize(new java.awt.Dimension(197, 39));
        btnTaiLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaiLieuActionPerformed(evt);
            }
        });

        btnQuyenTruyCap.setBackground(new java.awt.Color(0, 128, 128));
        btnQuyenTruyCap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnQuyenTruyCap.setForeground(new java.awt.Color(204, 255, 255));
        btnQuyenTruyCap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/access-control.png"))); // NOI18N
        btnQuyenTruyCap.setText("  QUYỀN TRUY CẬP");
        btnQuyenTruyCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuyenTruyCapActionPerformed(evt);
            }
        });

        btnThuMuc.setBackground(new java.awt.Color(0, 128, 0));
        btnThuMuc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThuMuc.setForeground(new java.awt.Color(204, 255, 255));
        btnThuMuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/folder.png"))); // NOI18N
        btnThuMuc.setText("THƯ MỤC");
        btnThuMuc.setPreferredSize(new java.awt.Dimension(197, 39));
        btnThuMuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThuMucActionPerformed(evt);
            }
        });

        btnDangXuat.setBackground(new java.awt.Color(0, 128, 128));
        btnDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDangXuat.setForeground(new java.awt.Color(204, 255, 255));
        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/power-off.png"))); // NOI18N
        btnDangXuat.setPreferredSize(new java.awt.Dimension(197, 39));
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        btnTrangChu.setBackground(new java.awt.Color(0, 128, 128));
        btnTrangChu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTrangChu.setForeground(new java.awt.Color(204, 255, 255));
        btnTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        btnTrangChu.setToolTipText("");
        btnTrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrangChuActionPerformed(evt);
            }
        });

        btnThungRac1.setBackground(new java.awt.Color(0, 128, 128));
        btnThungRac1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThungRac1.setForeground(new java.awt.Color(204, 255, 255));
        btnThungRac1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/recycle-bin.png"))); // NOI18N
        btnThungRac1.setText("  THÙNG RÁC");
        btnThungRac1.setPreferredSize(new java.awt.Dimension(197, 39));
        btnThungRac1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThungRac1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnThuMuc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQuyenTruyCap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(btnTaiLieu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNguoiDung, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTrangChu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThungRac1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnTrangChu)
                .addGap(46, 46, 46)
                .addComponent(btnNguoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnTaiLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnQuyenTruyCap)
                .addGap(43, 43, 43)
                .addComponent(btnThuMuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btnThungRac1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204), 2), "THƯ MỤC", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(51, 204, 255))); // NOI18N

        btnTaiXuong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTaiXuong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/download.png"))); // NOI18N
        btnTaiXuong.setText("TẢI XUỐNG");
        btnTaiXuong.setMaximumSize(null);
        btnTaiXuong.setMinimumSize(null);
        btnTaiXuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaiXuongActionPerformed(evt);
            }
        });

        tbThuMuc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbThuMuc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã thư mục", "Tên thư mục", "Chủ sở hữu", "Ngày tạo", "Kích cỡ", "Loại thư mục"
            }
        ));
        jScrollPane1.setViewportView(tbThuMuc);

        btnXem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ccc.png"))); // NOI18N
        btnXem.setText("XEM");
        btnXem.setMaximumSize(null);
        btnXem.setMinimumSize(null);
        btnXem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemActionPerformed(evt);
            }
        });

        btnTaiLen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTaiLen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/upload.png"))); // NOI18N
        btnTaiLen.setText("TẢI LÊN");
        btnTaiLen.setMaximumSize(null);
        btnTaiLen.setMinimumSize(null);
        btnTaiLen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaiLenActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trash.png"))); // NOI18N
        btnXoa.setText("XÓA");
        btnXoa.setToolTipText("");
        btnXoa.setMaximumSize(null);
        btnXoa.setMinimumSize(null);
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/next.png"))); // NOI18N
        jButton2.setText("CHIA SẺ");
        jButton2.setMaximumSize(null);
        jButton2.setMinimumSize(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Tìm kiếm thư mục:");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/magnifying-glass.png"))); // NOI18N
        jButton3.setText("TÌM KIẾM");
        jButton3.setMaximumSize(null);
        jButton3.setMinimumSize(null);

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        jButton4.setText("TÌM KIẾM CHI TIẾT");
        jButton4.setMaximumSize(null);
        jButton4.setMinimumSize(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sort-by.png"))); // NOI18N
        jLabel3.setText("Sắp xếp");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnTaiLen, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnXem, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(btnTaiXuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1045, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTaiXuong, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXem, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTaiLen, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconTL.png"))); // NOI18N
        jLabel2.setText("ỨNG DỤNG QUẢN LÝ TÀI LIỆU");

        jButton1.setBackground(new java.awt.Color(0, 128, 128));
        jButton1.setFont(new java.awt.Font("STXinwei", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 889, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnNguoiDungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNguoiDungActionPerformed
        try {
            FormNguoiDung nd = new FormNguoiDung();
              
            nd.setVisible(true);
            this.dispose();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }//GEN-LAST:event_btnNguoiDungActionPerformed

    private void btnQuyenTruyCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuyenTruyCapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnQuyenTruyCapActionPerformed

    private void btnThuMucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThuMucActionPerformed
        // TODO add your handling code here:
        ThuMuc tm =new ThuMuc();
        tm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnThuMucActionPerformed

    private void btnTrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrangChuActionPerformed
        // TODO add your handling code here:
        TrangChu TC = new TrangChu();
        TC.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTrangChuActionPerformed

    private void btnTaiXuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiXuongActionPerformed

        int selectedRow = tbThuMuc.getSelectedRow();  // Giả sử bạn có JTable để chọn thư mục
        if (selectedRow != -1) {
            boolean result = false;
                result = new ThuMucController().taiXuongThuMuc(selectedRow);
            if (result) {
                JOptionPane.showMessageDialog(this, "Tải xuống thành công và đã mở thư mục!");
            } else {
                JOptionPane.showMessageDialog(this, "Tải xuống không thành công!");
            }
            }
         else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một thư mục để tải xuống.");
        }

            
    }//GEN-LAST:event_btnTaiXuongActionPerformed

    private void btnXemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemActionPerformed
        // Lấy chỉ số dòng được chọn từ JTable
        try
        {
    
        int selectedRow = tbThuMuc.getSelectedRow(); // tableThuMuc là tên bảng của bạn

        if (selectedRow != -1) {        
            // Lấy Mã thư mục từ cột tương ứng trong dòng được chọn (ví dụ cột thứ 0 chứa mã thư mục)
            int maThuMuc = (int) tbThuMuc.getValueAt(selectedRow, 0); // 0 là chỉ số cột chứa mã thư mục

            // Khởi tạo controller
            ThuMucController thuMucController = new ThuMucController();

                // Lấy đường dẫn thư mục từ controller
                String folderPath = thuMucController.getDuongDanThuMuc(maThuMuc);

                // Nếu có đường dẫn thư mục hợp lệ, hiển thị file
                if (folderPath != null && !folderPath.isEmpty()) {
                    HienThiFile ht = new HienThiFile(folderPath); // Truyền đường dẫn thư mục vào constructor
                    ht.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "Đường dẫn thư mục không hợp lệ.");
                }

        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn thư mục.");
        }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }//GEN-LAST:event_btnXemActionPerformed
private long getFolderSize(File folder) {
    long length = 0;
    File[] files = folder.listFiles();
    if (files != null) {
        for (File file : files) {
            if (file.isFile()) {
                length += file.length();
            } else {
                length += getFolderSize(file); // Gọi đệ quy để tính kích thước thư mục con
            }
        }
    }
    return length;
}

    private void btnTaiLenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiLenActionPerformed
     try {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFolder = fileChooser.getSelectedFile();
            
            // Thư mục gốc của dự án
            Path projectRoot = Paths.get(System.getProperty("user.dir"));
            
            // Đường dẫn tuyệt đối của thư mục đã chọn
            Path absolutePath = selectedFolder.toPath();

            // Kiểm tra xem hai đường dẫn có cùng root hay không
            if (!absolutePath.getRoot().equals(projectRoot.getRoot())) {
                JOptionPane.showMessageDialog(this, "Thư mục đã chọn không cùng root với thư mục gốc của dự án.");
                return;
            }
            
            // Chuyển đổi sang đường dẫn tương đối
            Path relativePath = projectRoot.relativize(absolutePath);
            
            String duongDanTuongDoi = relativePath.toString().replace("\\", "/");
            String tenThuMuc = selectedFolder.getName();
            
            // Xử lý và lưu trữ dữ liệu
            NguoiDungController nguoiDungController = new NguoiDungController();
            String chuSoHuu = nguoiDungController.getTenTaiKhoanDangNhap();
            java.sql.Date sqlNgayTao = new java.sql.Date(System.currentTimeMillis());
            String kichCo = String.valueOf(getFolderSize(selectedFolder));
            String loaiThuMuc = "File folder";

            ThuMucController thuMucController = new ThuMucController();
            boolean isSuccess = thuMucController.ThemThuMuc(
                tenThuMuc, chuSoHuu, sqlNgayTao, kichCo, loaiThuMuc, duongDanTuongDoi
            );

            if (isSuccess) {
                hienThiFileVaoBang();
            } else {
                JOptionPane.showMessageDialog(this, "Có lỗi xảy ra khi tải lên thư mục.");
            }
        }
    } catch(Exception ex) {
        JOptionPane.showMessageDialog(null, ex.getMessage());
    }
    }//GEN-LAST:event_btnTaiLenActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int row = tbThuMuc.getSelectedRow();
        if(row>=0){
            // Lấy ra cột 1 của dòng đã đã chọn
            String MaThuMuc = tbThuMuc.getValueAt(row, 0).toString();
            try {
                if(new ThuMucController().XoaThuMuc(MaThuMuc)){
                    JOptionPane.showMessageDialog(null, "Xóa thư mục thành công!");
                    hienThiFileVaoBang();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Xóa thư mục thất bại!");
                }
            } catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        }
        else {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn một thư mục để xóa.");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnTaiLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiLieuActionPerformed
        FormQuanLyTaiLieu formqltl=new FormQuanLyTaiLieu();
        formqltl.show();
        this.dispose();
    }//GEN-LAST:event_btnTaiLieuActionPerformed

    private void btnThungRac1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThungRac1ActionPerformed
        FormThungRac formrac=new FormThungRac();
        formrac.show();
        this.dispose();
    }//GEN-LAST:event_btnThungRac1ActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        // TODO add your handling code here:
        FormDangNhap dn = new FormDangNhap();
        dn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDangXuatActionPerformed

    
      private void hienThiFileVaoBang() throws ClassNotFoundException {
    try {
        ThuMucController thuMucController = new ThuMucController();
        ArrayList<ThuMucModel> thuMucList = thuMucController.getAll(); // Lấy tất cả thư mục từ cơ sở dữ liệu

        DefaultTableModel tableModel = (DefaultTableModel) tbThuMuc.getModel();
        tableModel.setRowCount(0); // Xóa dữ liệu cũ trên bảng

        // Lặp qua các thư mục và hiển thị lên bảng
        for (ThuMucModel tm : thuMucList) {
            int maThuMuc = tm.getMaThuMuc();
            String tenThuMuc = tm.getTenThuMuc(); 
            String chuSoHuu = tm.getChuSoHuu();
            String ngayTao = tm.getNgayTao();
            String kichCo = tm.getKichCo();   
            String loaiThuMuc = tm.getLoaiThuMuc();
            String duongDan = tm.getDuongDan();   

            // Thêm dữ liệu vào bảng
            tableModel.addRow(new Object[] {maThuMuc, tenThuMuc, chuSoHuu, ngayTao, kichCo, loaiThuMuc,  duongDan});
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Lỗi khi lấy dữ liệu thư mục: " + ex.getMessage());
    }
}
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        try {
            hienThiFileVaoBang();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ThuMuc.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(ThuMuc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThuMuc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThuMuc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThuMuc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThuMuc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnNguoiDung;
    private javax.swing.JButton btnQuyenTruyCap;
    private javax.swing.JButton btnTaiLen;
    private javax.swing.JButton btnTaiLieu;
    private javax.swing.JButton btnTaiXuong;
    private javax.swing.JButton btnThuMuc;
    private javax.swing.JButton btnThungRac1;
    private javax.swing.JButton btnTrangChu;
    private javax.swing.JButton btnXem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tbThuMuc;
    // End of variables declaration//GEN-END:variables
}
