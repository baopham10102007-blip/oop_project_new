package model;

import java.time.LocalDate;

public class KhuyenMai {
    private String maKM;
    private String tenChuongTrinh;
    private double phanTramGiam;
    private LocalDate ngayBatDau;
    private LocalDate ngayKetThuc;

    public KhuyenMai(String maKM, String tenChuongTrinh, double phanTramGiam, LocalDate ngayBatDau, LocalDate ngayKetThuc) {
        this.maKM = maKM;
        this.tenChuongTrinh = tenChuongTrinh;
        this.phanTramGiam = phanTramGiam;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getMaKM() { return maKM; }
    public String getTenChuongTrinh() { return tenChuongTrinh; }
    public double getPhanTramGiam() { return phanTramGiam; }
    public LocalDate getNgayBatDau() { return ngayBatDau; }
    public LocalDate getNgayKetThuc() { return ngayKetThuc; }
}