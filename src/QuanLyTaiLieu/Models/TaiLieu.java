/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyTaiLieu.Models;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class TaiLieu {
    private int maTL;                // Mã tài liệu (tự tăng)
    private String tenTL;            // Tên tài liệu
    private String chuSoHuu;         // Chủ sở hữu
    private Date ngayTao;            // Ngày tạo tài liệu
    private int kichCo;              // Kích cỡ tài liệu (tính bằng KB)
    private String loai;         
    private String duongdan;    // Loại tài liệu (ví dụ: PDF, DOCX, JPG)
    private boolean daXoa;        

    public TaiLieu() {
    }

    public TaiLieu(int maTL, String tenTL, String chuSoHuu, Date ngayTao, int kichCo, String loai, boolean daXoa) {
        this.maTL = maTL;
        this.tenTL = tenTL;
        this.chuSoHuu = chuSoHuu;
        this.ngayTao = ngayTao;
        this.kichCo = kichCo;
        this.loai = loai;
        this.daXoa = daXoa;
    }

    public int getMaTL() {
        return maTL;
    }

    public void setMaTL(int maTL) {
        this.maTL = maTL;
    }

    public String getTenTL() {
        return tenTL;
    }

    public void setTenTL(String tenTL) {
        this.tenTL = tenTL;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public int getKichCo() {
        return kichCo;
    }

    public void setKichCo(int kichCo) {
        this.kichCo = kichCo;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public boolean isDaXoa() {
        return daXoa;
    }

    public void setDaXoa(boolean daXoa) {
        this.daXoa = daXoa;
    }

    @Override
    public String toString() {
        return "TaiLieu{" + "maTL=" + maTL + ", tenTL=" + tenTL + ", chuSoHuu=" + chuSoHuu + ", ngayTao=" + ngayTao + ", kichCo=" + kichCo + ", loai=" + loai + ", daXoa=" + daXoa + '}';
    }

    public String getDuongdan() {
        return duongdan;
    }

    public void setDuongdan(String duongdan) {
        this.duongdan = duongdan;
    }

    
}
