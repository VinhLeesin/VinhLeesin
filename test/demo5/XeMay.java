package demo4;

import java.util.Scanner;

public class XeMay {

    Scanner _sc = new Scanner(System.in);
    public String name;
    public int year;
    public double gia;
    
    
    public void nhapTT() {
        System.out.print("Nhập năm sản xuất : ");
        this.year = _sc.nextInt();
        System.out.print("Nhập giá xe : ");
        this.gia = _sc.nextDouble();
    }

    public String xepLoai(int year) {
        if (this.year > 2018) {
            return "Mới";

        } else {
            return "Cũ";
        }
    }

    public XeMay(String name, int year, double gia) {
        this.name = name;
        this.year = year;
        this.gia = gia;
    }

    public XeMay(int year, double gia) {
        this.year = year;
        this.gia = gia;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getGia() {
        return gia;
    }

    @Override
    public String toString() {
        return "XeMay{" + "name=" + name + ", year=" + year + ", gia=" + gia + '}';
    }

    public void xuatTT() {
        System.out.println("Tên xe : " + this.name);
        System.out.println("Năm sản xuất : " + this.year);
        System.out.println("Giá xe : " + this.gia);
        System.out.println("Phiên bản : " + xepLoai(year));
    }
}
