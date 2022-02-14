package quanLy;

import java.util.Scanner;

public class NhanVien {

    Scanner _sc = new Scanner(System.in);
    
    public String maNV;
    public String hoVaTen;
    public double luong;
    
    // Nhập thông tin
    public void nhapTT() {
        System.out.print("Nhập mã nhân viên : ");
        this.maNV = _sc.nextLine();
        System.out.print("Nhập tên nhân viên : ");
        this.hoVaTen = _sc.nextLine();
        System.out.print("Nhập số tiền lương : ");
        this.luong = _sc.nextDouble();
    }
    
    // Xuất thông tin
    public void xuatTT() {
        System.out.println("Mã NV : " + this.maNV);
        System.out.println("Tên NV : " + this.hoVaTen);
        System.out.println("Tiền lương : " + this.luong);
    }
}
