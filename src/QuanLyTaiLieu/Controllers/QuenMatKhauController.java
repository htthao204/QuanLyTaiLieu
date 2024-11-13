/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyTaiLieu.Controllers;

import QuanLyTaiLieu.Models.QuenMatKhauModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuenMatKhauController extends KetNoiCSDL {
public static String resetEmail = "";

    // Kiểm tra email hợp lệ
    public boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@gmail\\.com$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email.trim());
        return matcher.matches();
    }
    
    public boolean GuiMa(QuenMatKhauModel model) {
         String email = model.getEmail().trim();
    resetEmail = email;  // Store email
    return !email.isEmpty() && isValidEmail(email);
    }

    public boolean KiemTraEmailDaDangKy(String email) {
    String sql = "SELECT COUNT(*) FROM tblNguoiDung WHERE Email = ?";
    try (PreparedStatement ps = this.conn.prepareStatement(sql)) {
        ps.setString(1, email);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            return rs.getInt(1) > 0;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
public boolean CapNhatMatKhau(String email, String matKhauMoi) {
    // Check if email is empty or invalid
    if (email == null || email.trim().isEmpty()) {
        System.out.println("Email is null or empty!");
        return false;
    }

    try {
        String sql = "UPDATE tblNguoiDung SET MatKhau = ? WHERE Email = ?";
        
        // Prepare the SQL statement
        try (PreparedStatement ps = this.conn.prepareStatement(sql)) {
            ps.setString(1, matKhauMoi); // Set new password
            ps.setString(2, email);      // Set the email
            
            // Execute the update
            int result = ps.executeUpdate();
            
            // Return true if rows are updated
            if (result > 0) {
                System.out.println("Password updated successfully.");
                return true;
            } else {
                System.out.println("No matching email found.");
                return false;
            }
        } catch (Exception ex) {
            // Log SQL exception error
            System.out.println("SQL Error: " + ex.getMessage());
            ex.printStackTrace();
        }
    } catch (Exception ex) {
        // Log general exception error
        System.out.println("General Error: " + ex.getMessage());
        ex.printStackTrace();
    }

    return false;
}

}