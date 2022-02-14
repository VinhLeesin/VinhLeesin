
import java.util.Scanner;

public class tuan4 {
    // size

    static int size;

    public static void thongtin() {
        Scanner _sc = new Scanner(System.in);

        System.out.print("Số người yêu cũ là : ");
        size = Integer.parseInt(_sc.nextLine());
    }

    // nhập tên
    public static void nhapTT1(String a[]) {
        Scanner _sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.printf("Tên của người yêu cũ thứ %d là : ", (i + 1));
            a[i] = _sc.nextLine();
        }
    }

    // nhập tuổi
    public static void nhapTT2(int b[]) {
        Scanner _sc = new Scanner(System.in);

        for (int i = 0; i < b.length; i++) {
            System.out.printf("tuổi của người yêu cũ thứ %d là : ", (i + 1));
            b[i] = Integer.parseInt(_sc.nextLine());
        }
    }

    // Nhập vòng 3
    public static void nhapTT3(double c[]) {
        Scanner _sc = new Scanner(System.in);

        for (int i = 0; i < c.length; i++) {
            System.out.printf("số đo vòng 1 của NYC thứ %d là : ", (i + 1));
            c[i] = Double.parseDouble(_sc.nextLine());
        }
    }

    // tuổi TB
    public static void tuoiTB(int b[]) {
        int sum = 0;
        for (int i = 0; i < b.length; i++) {
            sum += b[i];
        }
        System.out.println("Tuổi trung bình của NYC là : " + sum / b.length);
    }

    // vòng 1 trung bình
    public static void vong1(double c[]) {
        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            sum += c[i];
        }
        System.out.println("Vòng 1 trung bình của NYC là : " + sum / c.length);
    }

    // tên của bồ có tuổi chia hết cho 2
    public static void xuatTT1(String a[], int b[]) {
        System.out.print("Tên của bồ có tuổi chia hết cho 2 là : ");
        for (int i = 0; i < b.length; i++) {
            if (b[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }
    }

    // tuổi của bồ có vòng 1 lớn nhất 
    public static void xuatTT2(int b[], double c[]) {
        System.out.printf("Tuổi của bồ có vòng 1 lớn nhất là :");
        int viTri = 0;
        double max = c[0];
        for (int i = 1; i < c.length; i++) {
            if (max < c[i]) {
                viTri = i;
            }
        }
        System.out.println(b[viTri]);
    }

    //vòng 1 của người có tên dài nhất
    public static void xuatTT3(double c[], String a[]) {
        int viTri = 0;
        int maxlenString = 0;
        for (int i = 1; i < a.length; i++) {
            if (maxlenString < a[i].length()) {
                viTri = i;
            }
        }
        System.out.println("Vòng 1 của người có tên dài nhất là " + c[viTri]);
    }

    // hàm main
    public static void main(String[] args) {
        thongtin();
        String a[] = new String[size];
        int b[] = new int[size];
        double c[] = new double[size];
        nhapTT1(a);
        nhapTT2(b);
        nhapTT3(c);
        tuoiTB(b);
        vong1(c);
        xuatTT1(a, b);
        xuatTT2(b, c);
        xuatTT3(c, a);
    }
}
