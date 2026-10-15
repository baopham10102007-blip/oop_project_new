package model;

public class LoaiKhachHang {
    private String maLoaiKH;
    private String tenLoaiKH;
    private double phanTramChietKhau;
    private String moTa;

    public LoaiKhachHang(String maLoaiKH, String tenLoaiKH, double phanTramChietKhau, String moTa) {
        this.maLoaiKH = maLoaiKH;
        this.tenLoaiKH = tenLoaiKH;
        this.phanTramChietKhau = phanTramChietKhau;
        this.moTa = moTa;
    }

    public String getMaLoaiKH() { return maLoaiKH; }
    public String getTenLoaiKH() { return tenLoaiKH; }
    public double getPhanTramChietKhau() { return phanTramChietKhau; }
    public String getMoTa() { return moTa; }
}