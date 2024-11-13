/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyTaiLieu.Models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class NguoiDung {
    private String TenTaiKhoan;
    private String MatKhau;
    private String HoVaTen;
    private String SoDienThoai;
    private String Email;
    private String VaiTro;
    
   
     // Lấy và gán giá trị tương ứng với bảng trong cơ sở dữ liệu
    public NguoiDung(ResultSet rs) throws SQLException{
      // Đặt tên cột khớp với bảng trong DB
      this.TenTaiKhoan = rs.getString("TenTaiKhoan");
      this.MatKhau = rs.getString("MatKhau");
      this.HoVaTen = rs.getString("HoVaTen");
      this.SoDienThoai = rs.getString("SoDienThoai");
      this.Email = rs.getString("Email");
      this.VaiTro = rs.getString("VaiTro");
    }

    public NguoiDung() {
    }

    public NguoiDung(String TenTaiKhoan, String MatKhau, String HoVaTen, String SoDienThoai, String Email, String VaiTro) {
        this.TenTaiKhoan = TenTaiKhoan;
        this.MatKhau = MatKhau;
        this.HoVaTen = HoVaTen;
        this.SoDienThoai = SoDienThoai;
        this.Email = Email;
        this.VaiTro = VaiTro;
    }

    public String getTenTaiKhoan() {
        return TenTaiKhoan;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public String getHoVaTen() {
        return HoVaTen;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public String getEmail() {
        return Email;
    }

    public String getVaiTro() {
        return VaiTro;
    }

    public void setTenTaiKhoan(String TenTaiKhoan) {
        this.TenTaiKhoan = TenTaiKhoan;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public void setHoVaTen(String HoVaTen) {
        this.HoVaTen = HoVaTen;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setVaiTro(String VaiTro) {
        this.VaiTro = VaiTro;
    }
    
}
