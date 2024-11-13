 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyTaiLieu.Controllers;

import QuanLyTaiLieu.Models.TaiLieu;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class TaiLieuController extends KetNoiCSDL {
    public ArrayList<TaiLieu> docTaiLieu() {
    ArrayList<TaiLieu> arrTaiLieu = new ArrayList<>();
    try {
        String sql = "SELECT * FROM TaiLieu WHERE DaXoa = 0";
        Statement statement = conn.createStatement();
        ResultSet result = statement.executeQuery(sql);
        
        while (result.next()) {
            TaiLieu tl = new TaiLieu();
            tl.setMaTL(result.getInt("MaTL")); // Lấy mã tài liệu kiểu int
            tl.setTenTL(result.getString("TenTL"));
            tl.setChuSoHuu(result.getString("ChuSoHuu"));
            tl.setNgayTao(result.getDate("NgayTao"));
            tl.setKichCo(result.getInt("KichCo"));
            tl.setLoai(result.getString("Loai"));
            tl.setDuongdan(result.getString("DuongDan"));
            tl.setDaXoa(result.getBoolean("DaXoa"));
            arrTaiLieu.add(tl);
        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex.getMessage());
    }
    return arrTaiLieu;
}
    public int CapNhatTaiLieu(TaiLieu tl) {
        int result = 0;
        String sql = "UPDATE TAILIEU SET TenTL = ?, ChuSoHuu = ?, KichCo = ?, Loai = ? WHERE MaTL = ?";
        
        try (PreparedStatement pre = conn.prepareStatement(sql)) {
            pre.setString(1, tl.getTenTL());      // Cập nhật tên tài liệu
            pre.setString(2, tl.getChuSoHuu());   // Cập nhật chủ sở hữu
            pre.setInt(3, tl.getKichCo());        // Cập nhật kích cỡ
            pre.setString(4, tl.getLoai());       // Cập nhật loại tài liệu
            pre.setInt(5, tl.getMaTL());          // Cập nhật theo mã tài liệu

            result = pre.executeUpdate(); // Thực thi câu lệnh update và trả về số dòng bị ảnh hưởng
        } catch (Exception e) {
            System.out.println("Lỗi cập nhật tài liệu: " + e.getMessage());
        }
        return result;
    }
   public int ThemTaiLieu(TaiLieu taiLieu, String tenNguoiTao) {
     String sql = "INSERT INTO TaiLieu (TenTL, ChuSoHuu, NgayTao, KichCo, Loai, Duongdan, DaXoa) VALUES (?, ?, ?, ?, ?, ?, ?)";
    try (PreparedStatement stmt = conn.prepareStatement(sql)) {
        System.out.println("TenTL: " + taiLieu.getTenTL());
        System.out.println("ChuSoHuu: " + tenNguoiTao);
        System.out.println("NgayTao: " + taiLieu.getNgayTao());
        System.out.println("KichCo: " + taiLieu.getKichCo());
        System.out.println("Loai: " + taiLieu.getLoai());
        System.out.println("Duongdan: " + taiLieu.getDuongdan());
        System.out.println("DaXoa: " + taiLieu.isDaXoa());

        stmt.setString(1, taiLieu.getTenTL());
        stmt.setString(2, tenNguoiTao);
        stmt.setDate(3, new java.sql.Date(taiLieu.getNgayTao().getTime()));
        stmt.setInt(4, taiLieu.getKichCo());
        stmt.setString(5, taiLieu.getLoai());
        stmt.setString(6, taiLieu.getDuongdan());
        stmt.setBoolean(7, taiLieu.isDaXoa());

        // Execute update and return the result
        return stmt.executeUpdate();
    } catch (Exception e) {
        e.printStackTrace(); // Handle SQLException properly
        return 0;  // Return 0 if there is an error
    }
}

   public String layDuongDanTaiLieu(int maTaiLieu) {
    String duongDan = null;  // Khởi tạo biến để lưu trữ đường dẫn
    String sql = "SELECT DuongDan FROM TaiLieu WHERE MaTL = ? AND DaXoa = 0";  // Truy vấn để lấy đường dẫn của tài liệu chưa xóa

    try (PreparedStatement prst = conn.prepareStatement(sql)) {
        prst.setInt(1, maTaiLieu);  // Set giá trị MaTL vào câu truy vấn

        ResultSet rs = prst.executeQuery();  // Thực thi truy vấn

        if (rs.next()) {
            duongDan = rs.getString("DuongDan");  // Lấy giá trị đường dẫn từ kết quả truy vấn
            System.out.print(duongDan);
        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Lỗi khi lấy đường dẫn: " + ex.getMessage());
    }

    return duongDan;  // Trả về đường dẫn tài liệu nếu tìm thấy, nếu không sẽ trả về null
}
   
    public ArrayList<TaiLieu> TimKiemTaiLieu(String key) {
    ArrayList<TaiLieu> dsTaiLieu = new ArrayList<TaiLieu>();
    try {
        // Chỉnh lại câu truy vấn SQL: Thêm dấu AND giữa các điều kiện
        String sql = "SELECT * FROM TaiLieu WHERE MaTL LIKE ? OR TenTL LIKE ? OR ChuSoHuu LIKE ?";
        PreparedStatement prst = conn.prepareStatement(sql);
        
        // Gán tham số vào câu lệnh SQL
        prst.setString(1, "%" + key + "%");
        prst.setString(2, "%" + key + "%");
        prst.setString(3, "%" + key + "%");
        
        // Thực thi câu truy vấn
        ResultSet rs = prst.executeQuery();
        
        // Xử lý kết quả truy vấn
        while (rs.next()) {
            TaiLieu tl = new TaiLieu();
            tl.setMaTL(rs.getInt("MaTL"));
            tl.setTenTL(rs.getString("TenTL"));
            tl.setChuSoHuu(rs.getString("ChuSoHuu"));
            tl.setNgayTao(rs.getDate("NgayTao"));
            tl.setKichCo(rs.getInt("KichCo"));
            tl.setLoai(rs.getString("Loai"));
            tl.setDaXoa(rs.getBoolean("DaXoa"));
            dsTaiLieu.add(tl);
        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex.getMessage());
    }
    return dsTaiLieu;
}

    public int XoaTaiLieu(TaiLieu tl)
    {
        try {
            String sql = "UPDATE TAILIEU SET DaXoa = ? WHERE MaTL = ?";
            PreparedStatement prst = conn.prepareStatement(sql);
            prst.setBoolean(1, true); 
            prst.setInt(2, tl.getMaTL()); // Set the document ID

            return prst.executeUpdate(); 
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return -1;
    
    }
    public ArrayList<TaiLieu> SapXepTheoTen() {
   ArrayList<TaiLieu> dsSort = new ArrayList<>();
    try {
        dsSort = docTaiLieu();

        dsSort.sort((TaiLieu tl1, TaiLieu tl2) -> tl1.getTenTL().compareToIgnoreCase(tl2.getTenTL()));
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex.getMessage());
    }
    return dsSort;

    }   
    public ArrayList<TaiLieu> SapXepTheoNgay() {
     ArrayList<TaiLieu> dsSort = new ArrayList<>();
    try {
        // Lấy danh sách tài liệu
        dsSort = docTaiLieu();

        // Kiểm tra nếu danh sách tài liệu không trống
        if (dsSort != null && !dsSort.isEmpty()) {
            // Sắp xếp theo ngày tạo (ngày tạo là đối tượng Date hoặc LocalDate)
            dsSort.sort((TaiLieu tl1, TaiLieu tl2) -> tl1.getNgayTao().compareTo(tl2.getNgayTao()));
        }

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex.getMessage());
    }
    return dsSort;
    }
}