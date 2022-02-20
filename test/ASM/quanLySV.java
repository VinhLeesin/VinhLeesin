package ASM;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class quanLySV {

    ArrayList<sinhVien> list = new ArrayList<>();
    Scanner _sc = new Scanner(System.in);

    // nhập thông tin sinh viên
    public void nhapTT() {

        int i = 1;
        System.out.println("==== Nhập thông tin sinh viên ====");
        do {
            System.out.printf("++ Học sinh thứ %d ++", i);
            System.out.print("\nTên sinh viên là : ");
            String name = _sc.nextLine();
            if (name == null || name.equals("")) {
                System.out.println("Nhập thành công");
                break;
            }
            System.out.print("Điểm trung bình là : ");
            double diemTB = Double.parseDouble(_sc.nextLine());
            list.add(new sinhVien(name, diemTB));
            i++;
        } while (true);
    }

    // Xuất thông tin sinh viên
    public void xuatTT() {
        int i = 1;
        for (sinhVien a : list) {
            System.out.printf("Sinh viên thứ %d\n", i);
            a.xuatTT();
            i++;
        }
    }

    // Xuất danh sách sinh viên theo khoảng điểm 
    public void xuatTDiem() {
        System.out.println("Mời nhập khoảng điểm ");

        System.out.print("Từ : ");
        double min = _sc.nextDouble();
        System.out.print("Đến : ");
        double max = _sc.nextDouble();

        for (sinhVien b : list) {
            if (min <= b.getDiemTB() && b.getDiemTB() <= max) {
                System.out.println("Thông tin sinh vien");
                b.xuatTT();
            }
        }
    }

    // Tìm sinh viên theo họ tên
    public void timHS() {
        System.out.print("Mòi nhập tên cần tìm : ");
        String name = _sc.nextLine();
        for (sinhVien c : list) {
            if (name.equalsIgnoreCase(c.getName())) {
                System.out.println("Thông tin HS");
                c.xuatTT();
            }
        }
    }

    // Tìm và sửa điểm sinh viên theo họ tên
    public void timSua() {
        System.out.print("Mời nhập tên cần tìm : ");
        String name = _sc.nextLine();
        int i = 0;
        for (sinhVien d : list) {
            if (name.equalsIgnoreCase(d.getName())) {
                System.out.print("Mời nhập điểm mới : ");
                double diemTB = _sc.nextDouble();
                list.set(i, new sinhVien(name, diemTB));
                System.out.println("Cập nhập thành công");
            }
            i++;
        }
    }

    // Tìm và xóa theo họ tên
    public void timXoa() {
        System.out.print("Mời nhập tên cần xóa : ");
        String name = _sc.nextLine();
        for (sinhVien e : list) {
            if (name.equals(e.getName())) {
                list.remove(e);
                System.out.println("Xóa thành công");
                break;
            }
        }
    }

    // tìm tất cả sinh viên có chữ  trong tên
    public void timTen() {
        System.out.print("Mời nhập chữ cần tìm : ");
        String name = _sc.nextLine();
        for (sinhVien f : list) {
            if (f.getName().contains(name)) {
                System.out.println("Thông tin HS");
                f.xuatTT();
            }
        }
    }

    // Sắp xếp sinh viên theo điểm trung bình
    public void sapXep() {
        Collections.sort(list, (a, b) -> (int) (a.getDiemTB() - b.getDiemTB()));
        xuatTT();
    }
}
