package bonus;

import java.util.Scanner;

public class Virus {

    Scanner _sc = new Scanner(System.in);
    public String name;
    public String mauSac;
    public double kichThuoc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public double getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(double kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    @Override
    public String toString() {
        return "Virus{" + "name=" + name + ", mauSac=" + mauSac + ", kichThuoc=" + kichThuoc + '}';
    }



    public Virus(String name, String mauSac, double kichThuoc) {
        this.name = name;
        this.mauSac = mauSac;
        this.kichThuoc = kichThuoc;
    }

    public Virus() {
        
    }
    
    public void nhapTT() {
        System.out.print("Nhập tên Virus : ");
        this.name = _sc.nextLine();
        System.out.print("Nhập màu sắc : ");
        this.mauSac = _sc.nextLine();
        System.out.println("Nhập Kích thước : ");
        this.kichThuoc = _sc.nextDouble();
    }

    public void xuatTT() {
        System.out.println("Tên Virus : " + this.name);
        System.out.println("Màu sắc : " + this.mauSac);
        System.out.println("Kích thước : " + this.kichThuoc);

    }
}
