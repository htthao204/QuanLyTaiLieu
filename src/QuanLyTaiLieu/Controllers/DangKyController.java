/*
 Chao các chế iuuu
 */
package QuanLyTaiLieu.Controllers;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;


public class DangKyController extends KetNoiCSDL {

private String hashPassword(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(password.getBytes());
            return Base64.getEncoder().encodeToString(hash); // Chuyển mã băm sang chuỗi Base64
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Không tìm thấy thuật toán mã hóa", e);
        }
    }

    // Thêm người dùng mới vào cơ sở dữ liệu với mật khẩu được mã hóa
    public void ThemNguoiDung(String HoVaTen, String SoDienThoai, String Email, String TenTaiKhoan, String MatKhau, String VaiTro) {
        String sql = "INSERT INTO tblNguoiDung (HoVaTen, SoDienThoai, Email, TenTaiKhoan, MatKhau, VaiTro) VALUES (?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, HoVaTen);
            ps.setString(2, SoDienThoai);
            ps.setString(3, Email);
            ps.setString(4, TenTaiKhoan);
            ps.setString(5, hashPassword(MatKhau)); // Mã hóa mật khẩu trước khi lưu
            ps.setString(6, VaiTro);
            
            int rs = ps.executeUpdate();
            if (rs != 0) {
                System.out.println("Thêm thành công!");
            } else {
                System.out.println("Thêm thất bại!");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // Kiểm tra xem số điện thoại đã tồn tại hay chưa
    public boolean isPhoneNumberExist(String SoDienThoai) {
        String sql = "SELECT COUNT(*) FROM tblNguoiDung WHERE SoDienThoai = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, SoDienThoai);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                return rs.getInt(1) > 0;  // Nếu có ít nhất 1 kết quả, số điện thoại đã tồn tại
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    // Kiểm tra xem email đã tồn tại hay chưa
    public boolean isEmailExist(String Email) {
        String sql = "SELECT COUNT(*) FROM tblNguoiDung WHERE Email = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, Email);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                return rs.getInt(1) > 0;  
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    // Kiểm tra xem tên tài khoản đã tồn tại hay chưa
    public boolean isUsernameExist(String TenTaiKhoan) {
        String sql = "SELECT COUNT(*) FROM tblNguoiDung WHERE TenTaiKhoan = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, TenTaiKhoan);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                return rs.getInt(1) > 0;  
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
  
}

