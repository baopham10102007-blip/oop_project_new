package model;

public class NhanVien extends Nguoi {
    private String chucVu;
    private String taiKhoan;
    private String matKhau;

    public NhanVien(String maNV, String hoTen, String soDienThoai, String chucVu, String taiKhoan, String matKhau) {
        super(maNV, hoTen, soDienThoai);
        this.chucVu = chucVu;
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
    }

    public String getChucVu() { return chucVu; }
    public String getTaiKhoan() { return taiKhoan; }
    public String getMatKhau() { return matKhau; }

    @Override
    public String toString() {
        return String.format("NhanVien[Ma=%s, Ten=%s, ChucVu=%s]", ma, hoTen, chucVu);
    }
}