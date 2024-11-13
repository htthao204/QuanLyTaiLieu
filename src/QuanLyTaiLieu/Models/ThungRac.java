/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyTaiLieu.Models;

import java.util.Date;

public class ThungRac {
     private int MaTR; // Mã tài liệu trong thùng rác
    private int MaTL; // Mã tài liệu tham chiếu đến bảng TaiLieu
    private String TenTL; // Tên tài liệu
    private String ChuSoHuu; // Chủ sở hữu tài liệu
    private int KichCo; // Kích cỡ tài liệu (KB)
    private String Loai; // Loại tài liệu (PDF, DOCX, JPG, v.v.)
    private Date NgayXoa; // Ngày xóa tài liệu

    public ThungRac() {
    }

    public ThungRac(int MaTR, int MaTL, String TenTL, String ChuSoHuu, int KichCo, String Loai, Date NgayXoa) {
        this.MaTR = MaTR;
        this.MaTL = MaTL;
        this.TenTL = TenTL;
        this.ChuSoHuu = ChuSoHuu;
        this.KichCo = KichCo;
        this.Loai = Loai;
        this.NgayXoa = NgayXoa;
    }

    public int getMaTR() {
        return MaTR;
    }

    public void setMaTR(int MaTR) {
        this.MaTR = MaTR;
    }

    public int getMaTL() {
        return MaTL;
    }

    public void setMaTL(int MaTL) {
        this.MaTL = MaTL;
    }

    public String getTenTL() {
        return TenTL;
    }

    public void setTenTL(String TenTL) {
        this.TenTL = TenTL;
    }

    public String getChuSoHuu() {
        return ChuSoHuu;
    }

    public void setChuSoHuu(String ChuSoHuu) {
        this.ChuSoHuu = ChuSoHuu;
    }

    public int getKichCo() {
        return KichCo;
    }

    public void setKichCo(int KichCo) {
        this.KichCo = KichCo;
    }

    public String getLoai() {
        return Loai;
    }

    public void setLoai(String Loai) {
        this.Loai = Loai;
    }

    public Date getNgayXoa() {
        return NgayXoa;
    }

    public void setNgayXoa(Date NgayXoa) {
        this.NgayXoa = NgayXoa;
    }

    @Override
    public String toString() {
        return "ThungRac{" + "MaTR=" + MaTR + ", MaTL=" + MaTL + ", TenTL=" + TenTL + ", ChuSoHuu=" + ChuSoHuu + ", KichCo=" + KichCo + ", Loai=" + Loai + ", NgayXoa=" + NgayXoa + '}';
    }
    
   

}
