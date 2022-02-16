package quanLy2;

import java.util.Scanner;

public class NhanVien {

    Scanner _sc = new Scanner(System.in);

    private String maNV;
    private String hoVaTen;
    private double luong;

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public NhanVien(String maNV, String hoVaTen, double luong) {
        this.maNV = maNV;
        this.hoVaTen = hoVaTen;
        this.luong = luong;
    }

    // Xuất thông tin
    public void xuatTT() {
        System.out.println("Mã NV : " + this.getMaNV());
        System.out.println("Tên NV : " + this.getHoVaTen());
        System.out.println("Tiền lương : " + this.getLuong());
    }
}
