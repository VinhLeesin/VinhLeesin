package Tuan4;

import java.util.Scanner;

public class HinhChuNhat {

    Scanner _sc = new Scanner(System.in);
    public double chieuDai;
    public double chieuRong;

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public double chuVi(double chieuDai, double chieuRong) {
        return (chieuDai + chieuRong) * 2;
    }

    public double dienTich(double chieuDai, double chieuRong) {
        return (chieuDai * chieuRong);
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" + "chieuDai=" + chieuDai + ", chieuRong="
                + chieuRong + ", chuVi=" + chuVi(chieuDai, chieuRong) + ", dienTich=" + dienTich(chieuDai, chieuRong) + '}';
    }

    public void nhapTT() {
        System.out.print("Nhập chiều dài : ");
        this.chieuDai = _sc.nextDouble();
        System.out.print("Nhập chiều rộng : ");
        this.chieuRong = _sc.nextDouble();
    }

    public void xuatTT() {
        System.out.println("Chiều dài : " + this.chieuDai);
        System.out.println("Chiều rộng : " + this.chieuRong);
        System.out.println("Chu vi : " + chuVi(chieuDai, chieuRong));
        System.out.println("Diện tích : " + dienTich(chieuDai, chieuRong));
    }

}
