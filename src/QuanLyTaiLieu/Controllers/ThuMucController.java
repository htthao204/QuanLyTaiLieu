/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyTaiLieu.Controllers;

import QuanLyTaiLieu.Models.ThuMucModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ThuMucController extends KetNoiCSDL{

    public ArrayList<ThuMucModel> getAll() throws SQLException{
        ArrayList<ThuMucModel> lst = new ArrayList<ThuMucModel>();
        String query = "Select * from tblThuMuc";
        
        // Taoj truy van
        PreparedStatement prst = conn.prepareStatement(query);
        ResultSet rs  = prst.executeQuery();
        while(rs.next()){
            ThuMucModel tm  = new ThuMucModel(rs);
            lst.add(tm);
        }
        return lst;
        
    }
    // Thêm vào thư mục:
    // Tải thư mục lên add vào table
   public boolean ThemThuMuc(String TenThuMuc, String ChuSoHuu, java.sql.Date NgayTao, String KichCo, String LoaiThuMuc, String DuongDan) throws SQLException{
    String query = "Insert into tblThuMuc(TenThuMuc, ChuSoHuu, NgayTao, KichCo, LoaiThuMuc, DuongDan) values (?,?,?,?,?,?)";
    PreparedStatement prst = conn.prepareStatement(query);

    prst.setString(1, TenThuMuc);
    prst.setString(2, ChuSoHuu);
    prst.setDate(3, NgayTao);  // Sử dụng java.sql.Date thay vì java.util.Date
    prst.setString(4, KichCo);
    prst.setString(5, LoaiThuMuc);
    prst.setString(6, DuongDan);
    int d = prst.executeUpdate();
    prst.close();
   // conn.close();
    return d > 0;
}
   // Người dùng
   // Phương thức để lấy thông tin tên tài khoản của người dùng từ bảng tblNguoiDung
public String getTenTaiKhoan() throws SQLException {
    String tenTaiKhoan = "";
    String query = "SELECT TenTaiKhoan FROM tblNguoiDung WHERE VaiTro = 'admin'"; // Hoặc điều kiện khác tùy vào yêu cầu

    PreparedStatement prst = conn.prepareStatement(query);
    ResultSet rs = prst.executeQuery();
    if (rs.next()) {
        tenTaiKhoan = rs.getString("TenTaiKhoan");
    }
    prst.close();
    return tenTaiKhoan;
    
}
// xem ds các file trong thư mục
public ThuMucModel getThuMucById(int maThuMuc) throws SQLException {
    String query = "SELECT * FROM tblThuMuc WHERE MaThuMuc = ?";
    PreparedStatement prst = conn.prepareStatement(query);
    prst.setInt(1, maThuMuc);
    ResultSet rs = prst.executeQuery();
    
    if (rs.next()) {
        return new ThuMucModel(rs);
    }
    return null;
}
// Xem thư mục các danh sách file
// Phương thức để lấy đường dẫn thư mục từ cơ sở dữ liệu
public String getDuongDanThuMuc(int maThuMuc) throws SQLException {
    String duongDan = "";
    String query = "SELECT DuongDan FROM tblThuMuc WHERE MaThuMuc = ?";
    PreparedStatement prst = conn.prepareStatement(query);
    prst.setInt(1, maThuMuc);
    ResultSet rs = prst.executeQuery();
    if (rs.next()) {
        duongDan = rs.getString("DuongDan");
    }
    prst.close();
    return duongDan;
}
 public boolean XoaThuMuc(String MaThuMuc) throws SQLException{
     String query = "delete from tblThuMuc where MaThuMuc = ?";
     PreparedStatement prst = conn.prepareStatement(query);
     prst.setString(1, MaThuMuc);
     int d = prst.executeUpdate();
     prst.close();
     return d > 0;
 }
 
 // Tải xuống
public boolean taiXuongThuMuc(int row) {
    try
    {
         ArrayList<ThuMucModel> lst = getAll();

    if (lst != null && !lst.isEmpty()) {
        if (row >= 0 && row < lst.size()) {
            ThuMucModel thuMuc = lst.get(row);
            // Kiểm tra lại DuongDan trước khi tải xuống
            if (thuMuc != null && thuMuc.DuongDan != null) {
                return thuMuc.taiXuongFolder(row);
            } else {
                System.out.println("Đường dẫn thư mục không hợp lệ.");
            }
        } else {
            System.out.println("Chỉ số không hợp lệ.");
        }
    } else {
        System.out.println("Danh sách thư mục rỗng.");
    }
    }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    return false;
}

}
