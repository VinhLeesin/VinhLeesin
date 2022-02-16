package quanLy2;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSach {

    ArrayList<NhanVien> list = new ArrayList<>();
    Scanner _sc = new Scanner(System.in);
    int size;

    // Nhập danh sách nhân viên 
    public void NhapDS() {
        System.out.println("Nhập danh sách nhân viên");
        int i = 1;
        do {
            System.out.printf("=== Nhân viên %d ===", i);
            System.out.print("\nNhập mã nhân viên : ");
            String maNV = _sc.nextLine();
            if (maNV == null || maNV.equals("")) {
                System.out.println("+++ Nhập thành công +++");
                break;
            }
            System.out.print("Nhập tên nhân viên : ");
            String hoVaTen = _sc.nextLine();
            System.out.print("Nhập số tiền lương : ");
            double luong = Double.parseDouble(_sc.nextLine());
            i++;
            list.add(new NhanVien(maNV, hoVaTen, luong));
        } while (true);

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

        System.out.println("== Thông tin nhân viên ==");
        for (NhanVien a : list) {
            if (min < a.getLuong() && a.getLuong() < max) {

            }
        }
    }
}
