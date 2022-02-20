package quanLy2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class quanLy {

    ArrayList<giaoVien> list = new ArrayList<>();
    Scanner _sc = new Scanner(System.in);
    int size;

    // Nhập danh sách giáo viên 
    public void NhapDS() {
        System.out.println("Nhập danh sách nhân viên");
        while (true) {
            System.out.print("\nNhập mã nhân viên : ");
            String maNV = _sc.nextLine();
            System.out.print("Nhập tên nhân viên : ");
            String hoVaTen = _sc.nextLine();
            System.out.print("Nhập số tiền lương : ");
            double luong = Double.parseDouble(_sc.nextLine());

            list.add(new giaoVien(maNV, hoVaTen, luong));

            System.out.print("Nhập tiếp hay không ? (Y/N): ....");
            String _tiepKo = _sc.nextLine();
            if (_tiepKo.equalsIgnoreCase("N")) {
                break;
            }
        }
    }
    // Xuất danh sách giáo viên

    public void XuatDS() {
        int i = 1;

        for (giaoVien s : list) {
            System.out.println("=== Giáo viên thứ " + i + " === ");
            s.xuatTT();
            i++;
        }
    }

    // Tìm giáo viên
    public void TimKiem() {
        System.out.println("=== Nhập khoảng lương ===");

        System.out.print("Từ : ");
        double min = _sc.nextDouble();
        System.out.print("Đến : ");
        double max = _sc.nextDouble();

        System.out.println("== Thông tin giáo viên ==");
        for (giaoVien a : list) {
            if (min < a.getLuong() && a.getLuong() < max) {
                a.xuatTT();
            }
        }
    }

    // Tìm giáo viên theo tên
    public void timGV() {
        System.out.print("Mời nhập tên cần tìm : ");
        String name = _sc.nextLine();
        for (giaoVien c : list) {
            if (name.equals(c.getName())) {
                System.out.println("Thông tin giáo viên");
                c.xuatTT();
            } else {
                System.out.println("Không có giáo viên nào");
                break;
            }
        }
    }

    // Sắp xếp giáo viên theo lương
    public void sapXep() {
        Collections.sort(list, (a,b) -> (int) (b.getLuong() - a.getLuong()));
        XuatDS();
    }
}
