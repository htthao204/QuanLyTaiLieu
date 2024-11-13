/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package QuanLyTaiLieu.Views;

import QuanLyTaiLieu.Controllers.TaiLieuController1;
import QuanLyTaiLieu.Controllers.ThungRacController;
import QuanLyTaiLieu.Models.TaiLieu;
import QuanLyTaiLieu.Models.ThungRac;
import QuanLyTaiLieu.Views.FormChiaSeTaiLieu;
import QuanLyTaiLieu.Views.FormThungRac;
import java.awt.Desktop;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class FormQuanLyTaiLieu extends javax.swing.JFrame {

    DefaultTableModel tablemodel;
    ArrayList<TaiLieu> dstl;
    Connection con=null;
    int row;
    public FormQuanLyTaiLieu() {
        initComponents();
        HienThiTaiLieu();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnNguoiDung = new javax.swing.JButton();
        btnTaiLieu1 = new javax.swing.JButton();
        btnQuyenTruyCap = new javax.swing.JButton();
        btnDanhMuc = new javax.swing.JButton();
        btnThungRac1 = new javax.swing.JButton();
        btnTrangChu = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableQuanLyTaiLieu = new javax.swing.JTable();
        btnLuu = new javax.swing.JButton();
        btnChiaSe = new javax.swing.JButton();
        btnTaiXuong = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        txtTim = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        btnXem = new javax.swing.JButton();
        btnTaiLen = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cboSapXep = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 892, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));

        btnNguoiDung.setBackground(new java.awt.Color(0, 128, 128));
        btnNguoiDung.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNguoiDung.setForeground(new java.awt.Color(204, 255, 255));
        btnNguoiDung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/group.png"))); // NOI18N
        btnNguoiDung.setText("  NGƯỜI DÙNG");
        btnNguoiDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNguoiDungActionPerformed(evt);
            }
        });

        btnTaiLieu1.setBackground(new java.awt.Color(0, 128, 0));
        btnTaiLieu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTaiLieu1.setForeground(new java.awt.Color(204, 255, 255));
        btnTaiLieu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paper.png"))); // NOI18N
        btnTaiLieu1.setText("  TÀI LIỆU");
        btnTaiLieu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaiLieu1ActionPerformed(evt);
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

        btnDanhMuc.setBackground(new java.awt.Color(0, 128, 128));
        btnDanhMuc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDanhMuc.setForeground(new java.awt.Color(204, 255, 255));
        btnDanhMuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/folder.png"))); // NOI18N
        btnDanhMuc.setText("  THƯ MỤC");
        btnDanhMuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDanhMucActionPerformed(evt);
            }
        });

        btnThungRac1.setBackground(new java.awt.Color(0, 128, 128));
        btnThungRac1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThungRac1.setForeground(new java.awt.Color(204, 255, 255));
        btnThungRac1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/recycle-bin.png"))); // NOI18N
        btnThungRac1.setText("  THÙNG RÁC");
        btnThungRac1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThungRac1ActionPerformed(evt);
            }
        });

        btnTrangChu.setBackground(new java.awt.Color(0, 128, 128));
        btnTrangChu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTrangChu.setForeground(new java.awt.Color(204, 255, 255));
        btnTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        btnTrangChu.setText(" TRANG CHỦ");
        btnTrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrangChuActionPerformed(evt);
            }
        });

        btnDangXuat.setBackground(new java.awt.Color(0, 128, 128));
        btnDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDangXuat.setForeground(new java.awt.Color(204, 255, 255));
        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/power-off.png"))); // NOI18N
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDanhMuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQuyenTruyCap, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(btnTaiLieu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNguoiDung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThungRac1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnTrangChu)
                .addGap(37, 37, 37)
                .addComponent(btnNguoiDung)
                .addGap(45, 45, 45)
                .addComponent(btnTaiLieu1)
                .addGap(45, 45, 45)
                .addComponent(btnQuyenTruyCap)
                .addGap(54, 54, 54)
                .addComponent(btnDanhMuc)
                .addGap(55, 55, 55)
                .addComponent(btnThungRac1)
                .addGap(52, 52, 52)
                .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(204, 255, 204));

        tableQuanLyTaiLieu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tableQuanLyTaiLieu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableQuanLyTaiLieu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ TÀI LIỆU", "TÊN TÀI LIỆU", "CHỦ SỠ HỮU", "NGÀY TẠO", "KÍCH CỠ", "LOẠI"
            }
        ));
        tableQuanLyTaiLieu.setFocusable(false);
        tableQuanLyTaiLieu.setRowHeight(30);
        tableQuanLyTaiLieu.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableQuanLyTaiLieu.setUpdateSelectionOnSort(false);
        tableQuanLyTaiLieu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableQuanLyTaiLieuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableQuanLyTaiLieu);

        btnLuu.setBackground(new java.awt.Color(153, 255, 153));
        btnLuu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLuu.setText("LƯU");
        btnLuu.setPreferredSize(new java.awt.Dimension(100, 30));
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnChiaSe.setBackground(new java.awt.Color(153, 255, 153));
        btnChiaSe.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnChiaSe.setText("CHIA SẺ");
        btnChiaSe.setPreferredSize(new java.awt.Dimension(100, 30));
        btnChiaSe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiaSeActionPerformed(evt);
            }
        });

        btnTaiXuong.setBackground(new java.awt.Color(153, 255, 153));
        btnTaiXuong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTaiXuong.setText("TẢI XUỐNG");
        btnTaiXuong.setPreferredSize(new java.awt.Dimension(100, 30));
        btnTaiXuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaiXuongActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(153, 255, 153));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoa.setText("XÓA");
        btnXoa.setPreferredSize(new java.awt.Dimension(100, 30));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        txtTim.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTim.setForeground(new java.awt.Color(204, 204, 204));
        txtTim.setText("Nhập thông tin tài liệu muốn tìm kiếm");
        txtTim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTimMouseClicked(evt);
            }
        });

        btnTim.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTim.setText("TÌM");
        btnTim.setPreferredSize(new java.awt.Dimension(100, 30));
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        btnXem.setBackground(new java.awt.Color(153, 255, 153));
        btnXem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXem.setText("XEM");
        btnXem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemActionPerformed(evt);
            }
        });

        btnTaiLen.setBackground(new java.awt.Color(153, 255, 153));
        btnTaiLen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTaiLen.setText("TẢI LÊN");
        btnTaiLen.setPreferredSize(new java.awt.Dimension(100, 30));
        btnTaiLen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaiLenActionPerformed(evt);
            }
        });

        cboSapXep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tên tài liệu", "Ngày tạo mới nhất", " " }));
        cboSapXep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboSapXepMouseClicked(evt);
            }
        });
        cboSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSapXepActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Sắp xếp:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(btnTaiLen, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(btnChiaSe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btnXem, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnTaiXuong, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 358, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(cboSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addGap(2, 2, 2)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTaiLen, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChiaSe, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXem, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTaiXuong, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tableQuanLyTaiLieuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableQuanLyTaiLieuMouseClicked
     
    }//GEN-LAST:event_tableQuanLyTaiLieuMouseClicked
public void openDocument(String filePath) {
    try {
        URI uri = new URI(filePath);  // filePath sẽ là URL của tài liệu trên web
        Desktop.getDesktop().browse(uri);  // Mở tài liệu trong trình duyệt web
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Không thể mở tài liệu: " + e.getMessage());
    }
}
   
    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
         int row = tableQuanLyTaiLieu.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn tài liệu để lưu!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int maTL = Integer.parseInt(tableQuanLyTaiLieu.getValueAt(row, 0).toString()); // Mã tài liệu
        String tenTL = tableQuanLyTaiLieu.getValueAt(row, 1).toString();  // Tên tài liệu (cột 1)
        String chuSoHuu = tableQuanLyTaiLieu.getValueAt(row, 2).toString(); // Chủ sở hữu (cột 2)
        int kichCo = Integer.parseInt(tableQuanLyTaiLieu.getValueAt(row, 4).toString()); // Kích cỡ (cột 4)
        String loai = tableQuanLyTaiLieu.getValueAt(row, 5).toString(); // Loại tài liệu (cột 5)

        if (tenTL.isEmpty() || chuSoHuu.isEmpty() || loai.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin tài liệu!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        TaiLieu tl = new TaiLieu();
        tl.setMaTL(maTL);
        tl.setTenTL(tenTL);
        tl.setChuSoHuu(chuSoHuu);
        tl.setKichCo(kichCo);
        tl.setLoai(loai);

        TaiLieuController1 tailieuController = new TaiLieuController1();
        if (tailieuController.CapNhatTaiLieu(tl) > 0) {
            HienThiTaiLieu(); // Cập nhật lại bảng
            JOptionPane.showMessageDialog(this, "Thông tin tài liệu đã được cập nhật!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Không thể cập nhật thông tin tài liệu!", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
    
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnTaiXuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiXuongActionPerformed

        int row = tableQuanLyTaiLieu.getSelectedRow();

       // Kiểm tra xem có chọn dòng nào không
       if (row == -1) {
           JOptionPane.showMessageDialog(this, "Vui lòng chọn tài liệu để tải xuống.");
           return;
       }

       TaiLieu tl = dstl.get(row);

       String duongDanFile = tl.getDuongdan();
       System.out.println("Đường dẫn tệp: " + duongDanFile);

       if (duongDanFile == null || duongDanFile.isEmpty()) {
           JOptionPane.showMessageDialog(this, "Tài liệu không có đường dẫn tệp.");
           return;
       }

       File file = new File(duongDanFile);

       if (!file.exists()) {
           JOptionPane.showMessageDialog(this, "Tài liệu không tồn tại.");
           return;
       }
       String thuMucTaiXuong = "D:/";  // Sử dụng thư mục D:\
       File fileTaiXuong = new File(thuMucTaiXuong + file.getName()); // Lưu tệp vào D:\

       try {
       Files.copy(file.toPath(), fileTaiXuong.toPath(), StandardCopyOption.REPLACE_EXISTING);

       JOptionPane.showMessageDialog(this, "Tải xuống tài liệu thành công!");

       // Mở tệp vừa tải xuống
       Desktop desktop = Desktop.getDesktop();
       if (fileTaiXuong.exists()) {
           desktop.open(fileTaiXuong); // Mở tệp
       } else {
           JOptionPane.showMessageDialog(this, "Không thể mở tệp: Tệp không tồn tại.");
       }

   } catch (IOException e) {
       e.printStackTrace(); // In chi tiết lỗi ra console để tiện kiểm tra
       JOptionPane.showMessageDialog(this, "Không thể tải xuống hoặc mở tài liệu: " + e.getMessage());
   }
    }//GEN-LAST:event_btnTaiXuongActionPerformed
    private void HienThiTaiLieu()
    {

       try
        {
            TaiLieuController1 tailieuController = new TaiLieuController1();
            dstl = tailieuController.docTaiLieu();
            DefaultTableModel dftbl = (DefaultTableModel) tableQuanLyTaiLieu.getModel();
            dftbl.setRowCount(0); 
            for(int i=0;i<dstl.size();i++)
            {
                int matl=dstl.get(i).getMaTL();
                String tentl=dstl.get(i).getTenTL();
                String chusohuu=dstl.get(i).getChuSoHuu();
                Date ngaytao=dstl.get(i).getNgayTao();
                int kichco=dstl.get(i).getKichCo();
                String loai=dstl.get(i).getLoai();
                Object[] row=new Object[]{matl,tentl,chusohuu,ngaytao,kichco,loai};
                dftbl.addRow(row);
            }
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
        
    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
         
        try
        {
            int row = tableQuanLyTaiLieu.getSelectedRow();
            if (row == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn tài liệu muốn xóa!", "Thông báo", JOptionPane.QUESTION_MESSAGE);
            return;
        }
        int maTL = Integer.parseInt(tableQuanLyTaiLieu.getValueAt(row, 0).toString());
        String tenTL = tableQuanLyTaiLieu.getValueAt(row, 1).toString();
        String chusohuu = tableQuanLyTaiLieu.getValueAt(row, 2).toString();
        int kichthuoc= Integer.parseInt(tableQuanLyTaiLieu.getValueAt(row, 4).toString());
        String loai = tableQuanLyTaiLieu.getValueAt(row, 5).toString();
        int lc = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa tài liệu này?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (lc == JOptionPane.YES_OPTION) {
        TaiLieuController1 tailieuController = new TaiLieuController1();
        TaiLieu tl = new TaiLieu();
        tl.setMaTL(maTL);
        System.out.println("Document ID before adding to recycle bin: " + maTL);
        // Thực hiện xóa tài liệu
        if (tailieuController.XoaTaiLieu(tl) > 0) {
            // Chuyển tài liệu vào thùng rác
            ThungRac tlRac = new ThungRac();
            tlRac.setMaTL(maTL);
            tlRac.setTenTL(tenTL);
            tlRac.setChuSoHuu(chusohuu);
            tlRac.setKichCo(kichthuoc);
            tlRac.setLoai(loai);
            tlRac.setNgayXoa(new java.sql.Date(System.currentTimeMillis()));
            ThungRacController thungRacController = new ThungRacController();
            thungRacController.ThemThungRac(tlRac);

            HienThiTaiLieu();
            JOptionPane.showMessageDialog(this, "Tài liệu đã được xóa và chuyển vào thùng rác.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Không thể xóa tài liệu này.", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }}
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        try
        {
            if (txtTim.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã hoặc tên tài liệu cần tìm", "Yêu cầu", JOptionPane.ERROR_MESSAGE);
            HienThiTaiLieu();
            return;
            }
            TaiLieuController1 tailieuController=new TaiLieuController1();
            ArrayList<TaiLieu> kqTimKiem=tailieuController.TimKiemTaiLieu(txtTim.getText());
            DefaultTableModel tablemodel=(DefaultTableModel) tableQuanLyTaiLieu.getModel();
            tablemodel.setRowCount(0);
            for(int i=0;i<kqTimKiem.size();i++)
            {
                int matl=kqTimKiem.get(i).getMaTL();
                String tentl=kqTimKiem.get(i).getTenTL();
                String chusohuu=kqTimKiem.get(i).getChuSoHuu();
                Date ngaytao=kqTimKiem.get(i).getNgayTao();
                int kichco=kqTimKiem.get(i).getKichCo();
                String loai=kqTimKiem.get(i).getLoai();
                Object[] row=new Object[]{matl,tentl,chusohuu,ngaytao,kichco,loai};
                tablemodel.addRow(row);
            }
            if (kqTimKiem.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy tài liệu nào phù hợp.", "Kết quả", JOptionPane.INFORMATION_MESSAGE);
        }
            
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnTimActionPerformed
    
    
    private void btnXemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemActionPerformed
       int row = tableQuanLyTaiLieu.getSelectedRow();
        if (row != -1) {
        int maTaiLieu = (Integer) tableQuanLyTaiLieu.getValueAt(row, 0);  

        TaiLieuController1 taiLieuController = new TaiLieuController1();
        String duongdan = taiLieuController.layDuongDanTaiLieu(maTaiLieu);  // Truyền mã tài liệu vào phương thức

        if (duongdan != null && !duongdan.isEmpty()) {
            String filePath = duongdan.replace("\\", "/");  

            File fileTaiXuong = new File(filePath);
            if (fileTaiXuong.exists()) {
                try {
                    // Mở tài liệu bằng Desktop API
                    Desktop desktop = Desktop.getDesktop();
                    desktop.open(fileTaiXuong); // Mở tệp
                } catch (IOException e) {
                    // Xử lý lỗi nếu không thể mở tài liệu
                    JOptionPane.showMessageDialog(this, "Không thể mở tệp: " + e.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(this, "Tệp không tồn tại.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Không tìm thấy đường dẫn tài liệu.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn tài liệu.");
    }
    }//GEN-LAST:event_btnXemActionPerformed

    private void btnTaiLenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiLenActionPerformed
    LuaChonTaiLen tailen=new LuaChonTaiLen();
    tailen.setVisible(true);
    //this.dispose();
    }//GEN-LAST:event_btnTaiLenActionPerformed

    private void btnChiaSeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiaSeActionPerformed
        FormChiaSeTaiLieu chiase=new FormChiaSeTaiLieu();
        chiase.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnChiaSeActionPerformed

    private void txtTimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTimMouseClicked
        txtTim.setText("");
    }//GEN-LAST:event_txtTimMouseClicked

    private void cboSapXepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboSapXepMouseClicked
          
          try {
        // Lấy lựa chọn từ JComboBox
        String luaChon = (String) cboSapXep.getSelectedItem();

        // Kiểm tra lựa chọn của người dùng
        TaiLieuController1 controller = new TaiLieuController1();
        ArrayList<TaiLieu> dsTaiLieu = new ArrayList<>();

        if (luaChon != null) {
            if (luaChon.equals("Tên tài liệu")) {
                // Gọi phương thức sắp xếp theo tên
                dsTaiLieu = controller.SapXepTheoTen();
            } else if (luaChon.equals("Ngày tạo mới nhất")) {
                // Gọi phương thức sắp xếp theo ngày
                dsTaiLieu = controller.SapXepTheoNgay();
            }

            // Cập nhật bảng với danh sách tài liệu đã sắp xếp
            updateTable(dsTaiLieu);
        }
    } catch (Exception ex) {
        // Hiển thị thông báo lỗi nếu có
        JOptionPane.showMessageDialog(null, ex.getMessage());
    }
    }//GEN-LAST:event_cboSapXepMouseClicked
    
    private void updateTable(ArrayList<TaiLieu> dsTaiLieu) {
    DefaultTableModel model = (DefaultTableModel) tableQuanLyTaiLieu.getModel();
    model.setRowCount(0);  // Xóa hết các hàng hiện tại trong bảng

    for (TaiLieu tl : dsTaiLieu) {
        model.addRow(new Object[]{
            tl.getMaTL(),
            tl.getTenTL(),
            tl.getChuSoHuu(),
            tl.getNgayTao(),
            tl.getKichCo(),
            tl.getLoai()
        });
    }
}

    private void cboSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSapXepActionPerformed

    }//GEN-LAST:event_cboSapXepActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        // TODO add your handling code here:
        FormDangNhap dn = new FormDangNhap();
        dn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnTrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrangChuActionPerformed
        // TODO add your handling code here:
        TrangChu t = new TrangChu();
        t.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTrangChuActionPerformed

    private void btnThungRac1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThungRac1ActionPerformed
        FormThungRac thungrac=new FormThungRac();
        thungrac.show();
        this.dispose();
    }//GEN-LAST:event_btnThungRac1ActionPerformed

    private void btnDanhMucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDanhMucActionPerformed
        ThuMuc thumuc=new ThuMuc();
        thumuc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDanhMucActionPerformed

    private void btnQuyenTruyCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuyenTruyCapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnQuyenTruyCapActionPerformed

    private void btnTaiLieu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiLieu1ActionPerformed
        FormQuanLyTaiLieu formtl=new FormQuanLyTaiLieu();
        formtl.show();
        this.dispose();
    }//GEN-LAST:event_btnTaiLieu1ActionPerformed

    private void btnNguoiDungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNguoiDungActionPerformed
        FormNguoiDung nd=new FormNguoiDung();
        nd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNguoiDungActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormQuanLyTaiLieu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChiaSe;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnDanhMuc;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnNguoiDung;
    private javax.swing.JButton btnQuyenTruyCap;
    private javax.swing.JButton btnTaiLen;
    private javax.swing.JButton btnTaiLieu1;
    private javax.swing.JButton btnTaiXuong;
    private javax.swing.JButton btnThungRac1;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnTrangChu;
    private javax.swing.JButton btnXem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboSapXep;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableQuanLyTaiLieu;
    private javax.swing.JTextField txtTim;
    // End of variables declaration//GEN-END:variables
}
