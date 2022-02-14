package bonus;

public class XuatTT {

    public static void main(String[] args) {
        Virus vr1 = new Virus("corona", "vang", 1111);
        System.out.println("===== Virus 1 =====");
        vr1.xuatTT();

        Virus vr2 = new Virus("Bại liệt", "Xanh", 2000);
        System.out.println("===== Virus 2 =====");
        System.out.println(vr2.toString());

        Virus vr3 = new Virus();
        vr3.setKichThuoc(1000);
        vr3.setName("cúm");
        vr3.setMauSac("hồng");
        System.out.println("===== Virus 3 =====");
        vr3.xuatTT();

        Virus vr4 = new Virus();
        vr4.nhapTT();
        System.out.println("===== Virus 4 =====");
        vr4.xuatTT();
    }
}
