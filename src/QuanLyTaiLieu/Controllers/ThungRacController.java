/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyTaiLieu.Controllers;

import QuanLyTaiLieu.Models.TaiLieu;
import QuanLyTaiLieu.Models.ThungRac;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.util.ArrayList;
public class ThungRacController extends KetNoiCSDL{
    public ArrayList<ThungRac> HienThiThungRac() {
     ArrayList<ThungRac> dsrac = new ArrayList<>();
    try {
        String sql = "SELECT * FROM THUNGRAC";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            ThungRac rac = new ThungRac();
            rac.setMaTR(rs.getInt("MaTR")); // Lấy giá trị MaTR từ cơ sở dữ liệu
            rac.setTenTL(rs.getString("TenTL")); // Tên tài liệu
            rac.setChuSoHuu(rs.getString("ChuSoHuu")); // Chủ sở hữu tài liệu
            rac.setKichCo(rs.getInt("KichCo")); // Kích cỡ tài liệu (KB)
            rac.setLoai(rs.getString("Loai")); // Loại tài liệu
            rac.setNgayXoa(rs.getDate("NgayXoa")); // Ngày xóa tài liệu
            dsrac.add(rac);
        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex.getMessage());
        ex.printStackTrace();
    }
    return dsrac;
}
    public ArrayList<ThungRac> TimKiemRac(String key)
    {
        ArrayList<ThungRac> dsRac=new ArrayList<ThungRac>();
        try
        {
            String sql="select * from ThungRac where MaTr LIKE ? or TenTL LIKE ? ";
            PreparedStatement prst = conn.prepareStatement(sql);
            prst.setString(1,"%"+key+"%");
            prst.setString(2,"%"+key+"%");
            ResultSet rs=prst.executeQuery();
            while(rs.next())
            {
                ThungRac rac=new ThungRac();
                rac.setMaTR(rs.getInt("MaTR"));
                rac.setMaTL(rs.getInt("MaTL"));
                rac.setTenTL(rs.getString("TenTL"));
                rac.setChuSoHuu(rs.getString("ChuSoHuu"));
                rac.setKichCo(rs.getInt("KichCo"));
                rac.setLoai(rs.getString("Loai"));
                dsRac.add(rac);
                
            }
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return dsRac;
    }
   public int KhoiPhucRac(ThungRac r) {
    int result = -1;
    try {
        // Lấy MaTL từ bảng THUNGRAC bằng MaTR
        String getMaTLQuery = "SELECT MaTL FROM THUNGRAC WHERE MaTR = ?";
        PreparedStatement getMaTLStmt = conn.prepareStatement(getMaTLQuery);
        getMaTLStmt.setInt(1, r.getMaTR());
        ResultSet rs = getMaTLStmt.executeQuery();

        // Nếu tìm thấy MaTL thì tiến hành khôi phục
        if (rs.next()) {
            int maTL = rs.getInt("MaTL");

            // Cập nhật trạng thái DaXoa trong bảng TAILIEU
            String sql = "UPDATE TAILIEU SET DaXoa = ? WHERE MaTL = ?";
            PreparedStatement prst = conn.prepareStatement(sql);
            prst.setBoolean(1, false);
            prst.setInt(2, maTL);
            result = prst.executeUpdate();

            if (result > 0) {
                // Xóa tài liệu khỏi bảng THUNGRAC nếu khôi phục thành công
                String sql1 = "DELETE FROM THUNGRAC WHERE MaTR = ?";
                PreparedStatement prst1 = conn.prepareStatement(sql1);
                prst1.setInt(1, r.getMaTR());
                prst1.executeUpdate();
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return result;
}

    public int XoaThungRac(ThungRac r)
    {
        try
        {
            String sql="DELETE FROM THUNGRAC WHERE MaTR=?";
            PreparedStatement prst=conn.prepareStatement(sql);
            prst.setInt(1, r.getMaTR());
            return prst.executeUpdate();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            ex.printStackTrace();
        }
        return -1;
    }
    public int ThemThungRac(ThungRac r) {
    try {
        String sql = "INSERT INTO THUNGRAC (MaTL, TenTL, ChuSoHuu, KichCo, Loai, NgayXoa) VALUES (?, ?, ?, ?, ?,?)";
        PreparedStatement prst = conn.prepareStatement(sql);
        prst.setInt(1,r.getMaTL());
        prst.setString(2, r.getTenTL());
        prst.setString(3, r.getChuSoHuu());  // Chủ sở hữu
        prst.setInt(4, r.getKichCo());       // Kích cỡ tài liệu
        prst.setString(5, r.getLoai());      // Loại tài liệu
        prst.setDate(6, new java.sql.Date(r.getNgayXoa().getTime())); // Ngày xóa

        return prst.executeUpdate();
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex.getMessage());
        ex.printStackTrace();
    }
    return -1;
}

    
}
