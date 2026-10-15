package model;

import enums.TrangThaiHoaDon;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    private String maHD;
    private KhachHang khachHang;
    private NhanVien nhanVien;
    private KhuyenMai khuyenMai;
    private HinhThucThanhToan hinhThucThanhToan;
    private LocalDateTime ngayLap;
    private double tienGiam;
    private TrangThaiHoaDon trangThai;
    private List<ChiTietHoaDon> danhSachChiTiet = new ArrayList<>();

    public HoaDon(String maHD, KhachHang khachHang, NhanVien nhanVien, KhuyenMai khuyenMai, HinhThucThanhToan hinhThucThanhToan, LocalDateTime ngayLap, double tienGiam, TrangThaiHoaDon trangThai) {
        this.maHD = maHD;
        this.khachHang = khachHang;
        this.nhanVien = nhanVien;
        this.khuyenMai = khuyenMai;
        this.hinhThucThanhToan = hinhThucThanhToan;
        this.ngayLap = ngayLap;
        this.tienGiam = tienGiam;
        this.trangThai = trangThai;
    }

    public void addChiTiet(ChiTietHoaDon ct) {
        this.danhSachChiTiet.add(ct);
    }

    public String getMaHD() { return maHD; }
    public KhachHang getKhachHang() { return khachHang; }
    public NhanVien getNhanVien() { return nhanVien; }
    public KhuyenMai getKhuyenMai() { return khuyenMai; }
    public HinhThucThanhToan getHinhThucThanhToan() { return hinhThucThanhToan; }
    public LocalDateTime getNgayLap() { return ngayLap; }
    public double getTienGiam() { return tienGiam; }
    public TrangThaiHoaDon getTrangThai() { return trangThai; }
    public List<ChiTietHoaDon> getDanhSachChiTiet() { return danhSachChiTiet; }

    public double getTongTien() {
        return danhSachChiTiet.stream().mapToDouble(ChiTietHoaDon::getThanhTien).sum();
    }

    public double getThanhTien() {
        return getTongTien() - tienGiam;
    }

    @Override
    public String toString() {
        return String.format("HoaDon[Ma=%s, KH=%s, NV=%s, Tong=%,.0f, Giam=%,.0f, ThanhTien=%,.0f, TT=%s]",
                maHD, (khachHang != null ? khachHang.getHoTen() : "Khách lẻ"),
                nhanVien.getHoTen(), getTongTien(), tienGiam, getThanhTien(), trangThai);
    }
}