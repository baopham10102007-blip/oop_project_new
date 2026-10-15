package model;

public class ChiTietHoaDon {
    private SanPham sanPham;
    private int soLuong;
    private double dongGia;

    public ChiTietHoaDon(SanPham sanPham, int soLuong, double dongGia) {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.dongGia = dongGia;
    }

    public SanPham getSanPham() { return sanPham; }
    public int getSoLuong() { return soLuong; }
    public double getDongGia() { return dongGia; }
    public double getThanhTien() { return soLuong * dongGia; }

    @Override
    public String toString() {
        return String.format("   + %s x%d = %,.0f VNĐ", sanPham.getTenSP(), soLuong, getThanhTien());
    }
}