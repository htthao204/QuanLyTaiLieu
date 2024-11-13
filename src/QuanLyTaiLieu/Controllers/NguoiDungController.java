package QuanLyTaiLieu.Controllers;

import QuanLyTaiLieu.Models.NguoiDung;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Vector;


public class NguoiDungController extends KetNoiCSDL{

    public static String tenTaiKhoanDangNhap; 
    public Vector<String> LayDSNguoiDung()
    {
        Vector<String> dsTenTK=new Vector<String>();
        try
        {
            String sql="SELECT TENTAIKHOAN FROM tblNguoiDung";
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next())
            {
                String ten=rs.getString("TenTaiKhoan");
                dsTenTK.add(ten);
            }
        } catch (Exception ex) {
            System.out.println("Lỗi: " + ex.getMessage());
        }
        return dsTenTK;
    }
    public NguoiDung dangnhap(String username, String password) {
        NguoiDung nd = null;
        try {
            String sql = "SELECT * FROM tblNguoiDung WHERE TenTaiKhoan = ? AND MatKhau = ?";
            PreparedStatement pre = conn.prepareStatement(sql);
            System.out.println(pre);
            pre.setString(1, username);
            pre.setString(2, password);
            ResultSet rs = pre.executeQuery();
            
            if (rs.next()) {
                nd = new NguoiDung();
                nd.setTenTaiKhoan(rs.getString("TenTaiKhoan")); // TenTaiKhoan là primary key
                nd.setMatKhau(rs.getString("MatKhau"));
                nd.setHoVaTen(rs.getString("HoVaTen"));
                nd.setSoDienThoai(rs.getString("SoDienThoai"));
                nd.setEmail(rs.getString("Email"));
                nd.setVaiTro(rs.getString("VaiTro"));
                
                // Lưu tên tài khoản đăng nhập
                tenTaiKhoanDangNhap = username;
            }
        } catch (Exception ex) {
            System.out.println("Lỗi: " + ex.getMessage());
        }
        return nd;
    }
    
    public String getTenTaiKhoanDangNhap() {
        return tenTaiKhoanDangNhap;
    }
    
    
   
    // Xử lý  Data Base, thực thi truy vấn
    public ArrayList<NguoiDung> getAll() throws SQLException{
        ArrayList<NguoiDung> list = new ArrayList<NguoiDung>();
        String query = "Select * from tblNguoiDung";
        // Tao truy van
         PreparedStatement prst = conn.prepareStatement(query);
         // Thực thi truy vấn 
         ResultSet rs = prst.executeQuery(); // ResultSet giong nhu Bang chua DB
         while(rs.next()){ // rs.nexr di chuyển đến dòng kế tiếp, ; lặp đến khi không còn 
             NguoiDung obj = new NguoiDung(rs); 
             list.add(obj);
         }
        return list;
        
    }
    
    
public boolean ThemNguoiDung(String TenTaiKhoan, String MatKhau, String HoVaTen, String SoDienThoai, String Email, String VaiTro) throws SQLException {
    String query = "INSERT INTO tblNguoiDung (TenTaiKhoan, MatKhau, HoVaTen, SoDienThoai, Email, VaiTro) VALUES (?, ?, ?, ?, ?, ?)";
    
    // Mã hóa mật khẩu trước khi lưu
    String hashedPassword = hashPassword(MatKhau);
    
    // Thực thi truy vấn
    try (PreparedStatement prst = conn.prepareStatement(query)) {
        prst.setString(1, TenTaiKhoan);
        prst.setString(2, hashedPassword); // Mật khẩu đã mã hóa
        prst.setString(3, HoVaTen);
        prst.setString(4, SoDienThoai);
        prst.setString(5, Email);
        prst.setString(6, VaiTro);

        // Kiểm tra kết quả truy vấn
        int rowsAffected = prst.executeUpdate();
        
        // Trả về true nếu thêm thành công, ngược lại trả về false
        return rowsAffected > 0;
    }
}

// Phương thức mã hóa mật khẩu bằng SHA-256
private String hashPassword(String password) {
    try {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(password.getBytes());
        return Base64.getEncoder().encodeToString(hash); // Chuyển mã băm sang chuỗi Base64
    } catch (NoSuchAlgorithmException e) {
        throw new RuntimeException("Không tìm thấy thuật toán mã hóa", e);
    }
} 
    public boolean SuaNguoiDung( String TenTaiKhoan, String MatKhau, String HoVaTen, String SoDienThoai, String Email ,String VaiTro) throws SQLException{
         String query = "update tblNguoiDung set MatKhau = ? , HoVaTen = ? , SoDienThoai = ? ,Email = ? ,VaiTro = ?  where TenTaiKhoan = ? ";
   
     PreparedStatement prst = conn.prepareStatement(query);
     
        prst.setString(1, MatKhau);
        prst.setString(2, HoVaTen);
        prst.setString(3, SoDienThoai);
        prst.setString(4, Email);
        prst.setString(5, VaiTro);
        prst.setString(6, TenTaiKhoan);
        
         int d = prst.executeUpdate();
         prst.close();
     
        return d > 0;
    
    }
    public boolean XoaNguoiDung(String TenTaiKhoan) throws SQLException{
        String query = "delete tblNguoiDung where TenTaiKhoan = ?";
        // Tao thuc thi prepare
        PreparedStatement prst = conn.prepareStatement(query);
        // truyen bieu mau
        prst.setString(1, TenTaiKhoan);
        // Chay
        int d = prst.executeUpdate();
        prst.close();
        return d > 0;
    }
    
    /* 
    1. Thư mục: 
    UI:
    - Mã thư mục
    - Tên thư mục
    - Mô tả
    - Ngày tạo
    -  Danh sách tài liệu -- Lấy từ table Tài liệu 
    Chức năng:
    - Thêm
    - Sửa
    - Xóa
    - Tìm kiếm
    */
    
    
      // Hàm tìm kiếm người dùng theo từ khóa
     // Hàm tìm kiếm người dùng theo từ khóa
    public List<NguoiDung> TimKiemNguoiDung(String keyword) throws SQLException {
        List<NguoiDung> dsNguoiDung = new ArrayList<>();
        
        String sql = "SELECT * FROM tblNguoiDung WHERE LOWER(TenTaiKhoan) LIKE ? OR LOWER(HoVaTen) LIKE ?";
        
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, "%" + keyword + "%");
            ps.setString(2, "%" + keyword + "%");
            
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    // Sử dụng constructor NguoiDung(ResultSet rs) để tạo đối tượng từ ResultSet
                    dsNguoiDung.add(new NguoiDung(rs));
                }
            }
        }
        
        return dsNguoiDung;
    }
    
}
