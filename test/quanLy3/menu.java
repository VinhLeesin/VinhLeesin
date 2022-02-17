package quanLy3;

import java.util.Scanner;

public class menu {

    // Hàm menu
    public void menu() {
        Scanner _sc = new Scanner(System.in);
        quanLy QL = new quanLy();

        while (true) {
            System.out.printf("\n+=== Menu ===+\n");
            System.out.println("1. Nhập danh sách học sinh ");
            System.out.println("2. Xuất danh sách học sinh ");
            System.out.println("3. Tìm kiếm học sinh theo khoảng điểm");
            System.out.println("4. Tìm kiếm học sinh theo mã học sinh");
            System.out.println("5. Thêm học sinh ");
            System.out.println("6. Thoát chương trình ");
            System.out.println("+==============+");

            System.out.print("Mời nhập sự lựa chọn : ");
            int _luachon = Integer.parseInt(_sc.nextLine());

            switch (_luachon) {
                case 1:
                    QL.nhapTT();
                    break;
                case 2:
                    QL.xuatTT();
                    break;
                case 3:
                    QL.xuatDiem();
                    break;
                case 4:
                    QL.timMHS();
                    break;
                case 5:
                    QL.themHS();
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
        menu mn = new menu();
        mn.menu();
    }
}
