package model;

public class LoaiSanPham {
    private String maLoai;
    private String tenLoai;
    private String moTa;

    public LoaiSanPham(String maLoai, String tenLoai, String moTa) {
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
        this.moTa = moTa;
    }

    public String getMaLoai() { return maLoai; }
    public String getTenLoai() { return tenLoai; }
    public String getMoTa() { return moTa; }
}