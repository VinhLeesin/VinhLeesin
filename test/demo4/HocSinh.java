package demo4;

import java.util.Scanner;

public class HocSinh {

    Scanner _sc = new Scanner(System.in);
    public String name;
    public double diem;

    public void nhapTT() {
        System.out.print("Nhập tên học sinh : ");
        this.name = _sc.nextLine();
        System.out.print("Nhập điểm : ");
        this.diem = _sc.nextDouble();
    }
    
    public String xepLoai(double diem){
        if(this.diem > 8){
            return "Giỏi" ;
        }
        else if(this.diem >6.5){
            return "Khá" ;
        }
        else{
            return "Trung Bình";
        }
    }
    
    public void xuatTT() {
        System.out.println("Mã NV : " + this.name);
        System.out.println("Tên NV : " + this.diem);
        System.out.println("Học lực : " + xepLoai(diem));
    }
}
