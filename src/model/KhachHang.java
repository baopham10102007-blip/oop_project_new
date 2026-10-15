package model;

import java.time.LocalDate;

public class KhachHang extends Nguoi {
    private LoaiKhachHang loaiKhachHang;
    private String diaChi;
    private LocalDate ngaySinh;
    private int diemTichLuy;

    public KhachHang(String maKH, String hoTen, String soDienThoai, LoaiKhachHang loaiKhachHang, String diaChi, LocalDate ngaySinh, int diemTichLuy) {
        super(maKH, hoTen, soDienThoai);
        this.loaiKhachHang = loaiKhachHang;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.diemTichLuy = diemTichLuy;
    }

    public LoaiKhachHang getLoaiKhachHang() { return loaiKhachHang; }
    public String getDiaChi() { return diaChi; }
    public LocalDate getNgaySinh() { return ngaySinh; }
    public int getDiemTichLuy() { return diemTichLuy; }

    @Override
    public String toString() {
        return String.format("KhachHang[Ma=%s, Ten=%s, SĐT=%s, Diem=%d]", ma, hoTen, soDienThoai, diemTichLuy);
    }
}