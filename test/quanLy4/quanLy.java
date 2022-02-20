package quanLy4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class quanLy {

    ArrayList<NguoiYeuXXX> list = new ArrayList<>();
    Scanner _sc = new Scanner(System.in);

    // nhập thông tin của người yêu cũ
    public void nhapTT() {
        int i = 1;
        while (true) {
            System.out.println("++ Nhập thông tin của người yêu cũ ==");
            System.out.printf("Người yêu cũ thứ %d ", i);
            System.out.print("\nTên : ");
            String name = _sc.nextLine();
            System.out.print("Tuổi : ");
            int tuoi = Integer.parseInt(_sc.nextLine());
            System.out.print("Số đo vòng 3 : ");
            double vong3 = Double.parseDouble(_sc.nextLine());

            list.add(new NguoiYeuXXX(name, tuoi, vong3));
            i++;

            System.out.print("Nhập tiếp hay không ? (Y/N): ....");
            String _tiepKo = _sc.nextLine();
            if (_tiepKo.equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    // Xuất thông tin của người yêu cũ
    public void xuatTT() {
        int i = 1;
        for (NguoiYeuXXX a : list) {
            System.out.printf("Người yêu cũ thứ %d\n", i);
            a.xuatTT();
            i++;
        }
    }

    // Tìm người yêu cũ theo tên
    public void timTen() {
        System.out.print("Mời nhập tên cần tìm : ");
        String name = _sc.nextLine();
        for (NguoiYeuXXX b : list) {
            if (name.equalsIgnoreCase(b.getName())) {
                System.out.println("++  Thông tin NYC  ++");
                b.xuatTT();
            }
        }
    }

    // Tìm người yêu cũ theo khoảng số đo
    public void timSoDo() {
        System.out.println("Mời nhập khoảng số đo ");
        System.out.print("Từ : ");
        double min = _sc.nextDouble();
        System.out.print("Đến : ");
        double max = _sc.nextDouble();

        for (NguoiYeuXXX c : list) {
            if (min <= c.getVong3() && c.getVong3() <= max) {
                c.xuatTT();
            }
        }
    }

    // Tìm người yêu cũ có từ trong tên
    public void timChua() {
        System.out.print("Nhập từ cần tìm : ");
        String name = _sc.nextLine();

        for (NguoiYeuXXX d : list) {
            if (d.getName().contains(name)) {
                System.out.println("Thông tin NYC");
                d.xuatTT();
            }
        }
    }

    // Sắp xếp người yêu cũ theo số đo
    public void xapXep() {
        Collections.sort(list, (a, b) -> (int) (a.getVong3() - b.getVong3()));
    }

    //Sửa vòng 3 người yêu cũ theo tuổi
    public void suaVong3() {
        System.out.print("Mời nhập tuổi : ");
        int tuoi = _sc.nextInt();
        int i = 0;
        for (NguoiYeuXXX e : list) {
            if (tuoi == e.getTuoi()) {
                System.out.print("Mời nhập số đo vòng 3 mới : ");
                double vong3 = _sc.nextDouble();
                list.set(i, new NguoiYeuXXX(e.getName(), tuoi, vong3));
                System.out.println("Cập nhập thành công");
                i++;
            }
        }
    }

    // tên của người yêu cuối cùng đầu tiên
    public void xuatTen() {
        System.out.println("Tên NYC đầu tiên :" + list.get(0).getName());
        System.out.println("Tên NYC cuối cùng : " + list.get(list.size() - 1).getName());
    }
}
