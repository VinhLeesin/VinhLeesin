package quanLy4;

import java.util.Scanner;

public class menu {

    public void menu() {
        Scanner _sc = new Scanner(System.in);
        quanLy QL = new quanLy();
        while (true) {
            System.out.println("++++++  MENU  +++++");
            System.out.println("1. Nhập danh sách người yêu cũ ");
            System.out.println("2. Xuất danh sách người yêu cũ ");
            System.out.println("3. Tìm người yêu cũ theo họ tên ");
            System.out.println("4. Tìm người yêu cũ theo khoảng số đo ");
            System.out.println("5. Tìm người yêu cũ có chữ trong tên");
            System.out.println("6. Sắp xếp người yêu cũ theo số đo");
            System.out.println("7. Sửa vòng 3 người yêu cũ theo tuổi ");
            System.out.println("8. In tên của người yêu cũ đầu tiên và cuối cùng");
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
                    QL.timTen();
                    break;
                case 4:
                    QL.timSoDo();
                    break;
                case 5:
                    QL.timChua();
                    break;
                case 6:
                    QL.xapXep();
                    break;
                case 7:
                    QL.suaVong3();
                    break;
                case 8:
                    QL.xuatTen();
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
