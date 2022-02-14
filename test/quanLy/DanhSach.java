package quanLy;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSach {

    ArrayList<NhanVien> list = new ArrayList<>();
    Scanner _sc = new Scanner(System.in);
    int size;

    // Nhập danh sách nhân viên 
    public void NhapDS() {
        System.out.print("Số lượng nhân viên là : ");
        size = Integer.parseInt(_sc.nextLine());
        for (int i = 0; i < size; i++) {
            System.out.printf("===== Nhân viên thứ %d  ======\n", i + 1);
            NhanVien nv = new NhanVien();
            nv.nhapTT();
            list.add(nv);
        }
    }

    // Xuất danh sách nhân viên
    public void XuatDS() {
        int i = 1;

        for (NhanVien s : list) {
            System.out.println("=== Nhân viên thứ " + i + " === ");
            s.xuatTT();
            i++;
        }
    }

    // Tìm nhân viên
    public void TimKiem() {
        System.out.println("=== Nhập khoảng lương ===");

        System.out.print("Từ : ");
        double min = _sc.nextDouble();
        System.out.print("Đến : ");
        double max = _sc.nextDouble();
        
        for (NhanVien a : list) {
            if (min < a.luong && a.luong < max) {
                a.xuatTT();
            }
        }
    }
}
