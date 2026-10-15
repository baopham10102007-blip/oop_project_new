package model;

import enums.KichCo;
import enums.MauSac;

public class SanPham {
    private String maSP;
    private LoaiSanPham loaiSanPham;
    private String tenSP;
    private KichCo kichCo;
    private MauSac mauSac;
    private double giaBan;
    private int soLuongTon;

    public SanPham(String maSP, LoaiSanPham loaiSanPham, String tenSP, KichCo kichCo, MauSac mauSac, double giaBan, int soLuongTon) {
        this.maSP = maSP;
        this.loaiSanPham = loaiSanPham;
        this.tenSP = tenSP;
        this.kichCo = kichCo;
        this.mauSac = mauSac;
        this.giaBan = giaBan;
        this.soLuongTon = soLuongTon;
    }

    public String getMaSP() { return maSP; }
    public LoaiSanPham getLoaiSanPham() { return loaiSanPham; }
    public String getTenSP() { return tenSP; }
    public KichCo getKichCo() { return kichCo; }
    public MauSac getMauSac() { return mauSac; }
    public double getGiaBan() { return giaBan; }
    public int getSoLuongTon() { return soLuongTon; }

    @Override
    public String toString() {
        return String.format("SanPham[Ma=%s, Ten=%s, Size=%s, Mau=%s, Gia=%,.0f, Ton=%d]",
                maSP, tenSP, kichCo, mauSac, giaBan, soLuongTon);
    }
}