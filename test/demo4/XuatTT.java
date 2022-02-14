package demo4;

import java.util.ArrayList;
import java.util.Scanner;

public class XuatTT {

    ArrayList<HocSinh> list = new ArrayList<>();
    Scanner _sc = new Scanner(System.in);
    static int size;

    // Nhập thông tin học sinh
    public void NhapTT(int size) {
        System.out.print("Số lượng học sinh là : ");
        size = Integer.parseInt(_sc.nextLine());
        for (int i = 0; i < size; i++) {
            System.out.printf("===== Học sinh thứ %d  ======\n", i + 1);
            HocSinh nv = new HocSinh();
            nv.nhapTT();
            list.add(nv);
        }
    }

    // Xuất thông tin học sinh
    public void XuatTT() {
        int i = 1;

        for (HocSinh s : list) {
            System.out.println("=== Học sinh thứ " + i + " === ");
            s.xuatTT();
            i++;
        }
    }

    public static void main(String[] args) {
        XuatTT m = new XuatTT();
        m.NhapTT(size);
        m.XuatTT();
    }
}
