/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyTaiLieu.Models;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ThuMucModel {
    
    private int MaThuMuc;
    private String TenThuMuc;
    private String ChuSoHuu;
    private String NgayTao;
    private String KichCo;
    private String LoaiThuMuc;
    public String DuongDan;



    public ThuMucModel(ResultSet rs) throws SQLException{
        // Dat tên cột khớp với tên bảng
        this.MaThuMuc =rs.getInt("MaThuMuc");
        this.TenThuMuc = rs.getString("TenThuMuc");
        this.ChuSoHuu = rs.getString("ChuSoHuu");
        this.NgayTao = rs.getString("NgayTao");
        this.KichCo = rs.getString("KichCo");
        this.LoaiThuMuc = rs.getString("LoaiThuMuc");
        this.DuongDan = rs.getString("DuongDan");
    }

    public ThuMucModel() {
    }

    public ThuMucModel(int MaThuMuc, String TenThuMuc, String ChuSoHuu, String NgayTao, String KichCo, String LoaiThuMuc, String DuongDan) {
        this.MaThuMuc = MaThuMuc;
        this.TenThuMuc = TenThuMuc;
        this.ChuSoHuu = ChuSoHuu;
        this.NgayTao = NgayTao;
        this.KichCo = KichCo;
        this.LoaiThuMuc = LoaiThuMuc;
        this.DuongDan = DuongDan;
    }

   
    public int getMaThuMuc() {
        return MaThuMuc;
    }

    public String getTenThuMuc() {
        return TenThuMuc;
    }

    public String getChuSoHuu() {
        return ChuSoHuu;
    }

    public String getNgayTao() {
        return NgayTao;
    }

   

    public void setMaThuMuc(int MaThuMuc) {
        this.MaThuMuc = MaThuMuc;
    }

    public void setTenThuMuc(String TenThuMuc) {
        this.TenThuMuc = TenThuMuc;
    }

    public void setChuSoHuu(String ChuSoHuu) {
        this.ChuSoHuu = ChuSoHuu;
    }

    public void setNgayTao(String NgayTao) {
        this.NgayTao = NgayTao;
    }

    public String getKichCo() {
        return KichCo;
    }

    public String getLoaiThuMuc() {
        return LoaiThuMuc;
    }

    public String getDuongDan() {
        return DuongDan;
    }

    public void setKichCo(String KichCo) {
        this.KichCo = KichCo;
    }

    public void setLoaiThuMuc(String LoaiThuMuc) {
        this.LoaiThuMuc = LoaiThuMuc;
    }

    public void setDuongDan(String DuongDan) {
        this.DuongDan = DuongDan;
    }
    
    
    //
  private List<ThuMucModel> lst = new ArrayList<>();  // Danh sách các thư mục

    // Hàm tải xuống 
   
 public boolean taiXuongFolder(int row) {
    // Kiểm tra nếu DuongDan không phải là null hoặc rỗng
    if (this.DuongDan == null || this.DuongDan.isEmpty()) {
        System.out.println("Đường dẫn thư mục không hợp lệ.");
        return false;
    }

    File folder = new File(this.DuongDan);

    if (folder.exists() && folder.isDirectory()) {
        // Tạo đường dẫn mới trên ổ D
        String newDirPath = "D:\\" + folder.getName();  // Lấy tên thư mục và gắn vào ổ D
        File newFolder = new File(newDirPath);

        // Nếu thư mục đích không tồn tại, tạo mới
        if (!newFolder.exists()) {
            if (newFolder.mkdirs()) {
                System.out.println("Tạo thư mục mới tại: " + newDirPath);
            } else {
                System.out.println("Không thể tạo thư mục mới.");
                return false;
            }
        }

        // Sao chép các file từ thư mục gốc vào thư mục đích
        try {
            File[] files = folder.listFiles();
            if (files != null) {
                for (File file : files) {
                    File destFile = new File(newFolder, file.getName());
                    copyFile(file, destFile);
                }
            }
            System.out.println("Tải xuống thư mục thành công tại: " + newDirPath);
            return true;
        } catch (Exception e) {
            System.out.println("Lỗi khi sao chép thư mục: " + e.getMessage());
            return false;
        }
    }

    System.out.println("Thư mục không tồn tại.");
    return false;
}

private void copyFile(File source, File dest) throws IOException {
    try (InputStream in = new FileInputStream(source);
         OutputStream out = new FileOutputStream(dest)) {
        byte[] buffer = new byte[1024];
        int length;
        while ((length = in.read(buffer)) > 0) {
            out.write(buffer, 0, length);
        }
    }
}

    
} 

    
   
