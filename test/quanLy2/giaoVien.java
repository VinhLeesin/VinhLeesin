package quanLy2;

import java.util.Scanner;

public class giaoVien {

    Scanner _sc = new Scanner(System.in);

    private String maGV;
    private String name;
    private double luong;

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public giaoVien(String maGV, String name, double luong) {
        this.maGV = maGV;
        this.name = name;
        this.luong = luong;
    }

    // Xuất thông tin
    public void xuatTT() {
        System.out.println("Mã giáo viên : " + this.getMaGV());
        System.out.println("Tên giáo viên : " + this.getName());
        System.out.println("Tiền lương : " + this.getLuong());
    }
}
