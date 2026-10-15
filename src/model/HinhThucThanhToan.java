package model;

public class HinhThucThanhToan {
    private String maHTTT;
    private String tenHTTT;
    private String moTa;

    public HinhThucThanhToan(String maHTTT, String tenHTTT, String moTa) {
        this.maHTTT = maHTTT;
        this.tenHTTT = tenHTTT;
        this.moTa = moTa;
    }

    public String getMaHTTT() { return maHTTT; }
    public String getTenHTTT() { return tenHTTT; }
}