package quanLy3;

import java.util.ArrayList;
import java.util.Scanner;

public class quanLy {

    ArrayList<hocSinh> list = new ArrayList<>();
    Scanner _sc = new Scanner(System.in);

    // Nhập thông tin
    public void nhapTT() {
        int i = 1;
        System.out.println("=== Nhập danh sách học sinh ===");
        do {
            System.out.printf("=== Học sinh thứ %d ===", i);
            System.out.print("\nNhập mã học sinh : ");
            String maHS = _sc.nextLine();
            if (maHS == null || maHS.equals("")) {
                break;
            }
            System.out.print("Nhập tên học sinh : ");
            String name = _sc.nextLine();
            System.out.print("Nhập điểm : ");
            Double diem = Double.parseDouble(_sc.nextLine());
            i++;
            hocSinh hs = new hocSinh(maHS, name, diem);
            list.add(hs);
        } while (true);
    }

    // Xuất thông tin
    public void xuatTT() {
        int i = 1;
        System.out.println("==== Xuất danh sách học sinh ====");
        for (hocSinh a : list) {
            System.out.printf("== Học sinh thứ %d ==", i);
            a.xuatTT();
            i++;
        }
    }

    // Xuất học sinh theo khoảng điểm
    public void xuatDiem() {
        System.out.println("== Nhập khoảng điểm ===");
        System.out.print("Từ : ");
        double min = _sc.nextDouble();
        System.out.print("Đến :");
        double max = _sc.nextDouble();

        System.out.println("+++ Thông tin học sinh +++");
        for (hocSinh s : list) {
            if (min < s.getDiem() && s.getDiem() < max) {
                s.xuatTT();
            }
        }
    }

    // Tìm thông tin theo mã học sinh
    public void timMHS() {
        System.out.print("Nhập mã học sinh : ");
        String maHS = _sc.nextLine();
        for(hocSinh s : list){
            if(maHS.equalsIgnoreCase(s.getMaHS())){
            s.xuatTT();
            }
        }
    }
    
    // Thêm học sinh 
    public void themHS(){
        nhapTT();
       
        }
            
}
