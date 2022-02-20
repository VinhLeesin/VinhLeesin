package ASM;

import java.util.Scanner;

public class menu {

    public void menu() {
        Scanner _sc = new Scanner(System.in);
        quanLySV QL = new quanLySV();
        while (true) {
            System.out.println("++++++  MENU  +++++");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Xuất danh sách sinh viên ");
            System.out.println("3. Xuất danh sách sinh viên theo khoảng điểm");
            System.out.println("4. Tìm sinh viên theo họ tên");
            System.out.println("5. Tìm và sửa điểm SV theo họ tên");
            System.out.println("6. Tìm và xóa theo họ tên");
            System.out.println("7. Tìm tất cả SV có chữ trong tên");
            System.out.println("8. Sắp xếp SV theo Điểm");
            System.out.println("9. Kết thúc");
            System.out.print("Mời nhập sự lựa chọn : ");
            int luachon = Integer.parseInt(_sc.nextLine());

            switch (luachon) {
                case 1:
                    QL.nhapTT();
                    break;
                case 2:
                    QL.xuatTT();
                    break;
                case 3:
                    QL.xuatTDiem();
                    break;
                case 4:
                    QL.timHS();
                    break;
                case 5:
                    QL.timSua();
                    break;
                case 6:
                    QL.timXoa();
                    break;
                case 7:
                    QL.timTen();
                    break;
                case 8:
                    QL.sapXep();
                    break;
                case 9:
                    System.exit(0);
                default:
                    System.out.print("Nhập từ 1 đến 9 thui");
                    break;

            }
        }
    }

    public static void main(String[] args) {
        menu mn = new menu();
        mn.menu();
    }
}
