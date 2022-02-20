package quanLy2;

import java.util.Scanner;

public class Menu {

    // Hàm menu
    public void menu() {
        Scanner _sc = new Scanner(System.in);
        quanLy DS = new quanLy();

        while (true) {
            System.out.printf("\n+=== Menu ===+\n");
            System.out.println("1. Nhập danh sách giáo viên ");
            System.out.println("2. Xuất danh sách giáo viên ");
            System.out.println("3. Tìm kiếm giáo viên ");
            System.out.println("4. Tìm giáo viên theo tên");
            System.out.println("5. Sắp xếp giáo viên theo lương");
            System.out.println("6. Thoát ");
            System.out.println("+==============+");

            System.out.print("Mời nhập sự lựa chọn : ");
            int _luachon = Integer.parseInt(_sc.nextLine());

            switch (_luachon) {
                case 1:
                    DS.NhapDS();
                    break;
                case 2:
                    DS.XuatDS();
                    break;
                case 3:
                    DS.TimKiem();
                    break;
                case 4:
                    DS.timGV();
                    break;
                case 5:
                    DS.sapXep();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Nhập từ 1 đến 6 thui");
                    break;
            }
        }
    }

    // Hàm main
    public static void main(String[] args) {
        Menu mn = new Menu();
        mn.menu();
    }
}
