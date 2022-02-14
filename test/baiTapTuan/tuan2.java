import java.util.Scanner;

public class tuan2 {
    
    static String _ten ;
    static int _tuoi ;
    static double _vong1, _vong3 , _canNang, _chieuCao ;
    
    // hàm thông tin bài 1
    public static void thongtin1() {
        Scanner _sc = new Scanner(System.in);
        
        System.out.print("Số đo vòng 1 của NYC là : ");
        _vong1 = Integer.parseInt(_sc.nextLine());
        System.err.print("Số đo vòng 3 của NYC là : ");
        _vong3 = Double.parseDouble(_sc.nextLine());
    }
    // tính hiệu 
    public static double hieu(double a , double b) {
        return a - b ;
    }
    // tính tích
    public static double tich(double a , double b) {
        return a * b ;
    }
    // tính tổng
    public static double tong1(double a , double b) {
        return a + b ;
    }
    // tính tổng bình phương
    public static double tongBP(double a , double b) {
        return a * b ;
    }
    // hàm xuất chuỗi
    public static void chuoi(double a) {
        if(a >= 90){
            System.out.println("Đạt chuẩn");
        }        
    }
    // xuất thông tin bài 1
    public static void xuatTT1(double a , double b) {
        System.out.println("+++++ Xuất thông tin +++++");
        System.out.println("Số đo vòng 1 của NYC là : " + _vong1 );
        System.out.println("Số đo vòng 3 của NYC là : " + _vong3 );
        System.out.println("Hiệu : " + hieu(_vong1, _vong3));
        System.out.println("Tích : " + tich(_vong1, _vong3));
        System.out.println("Tổng : " + tong1(_vong1, _vong3));
        System.out.println("Tổng bình phương : " + tongBP(tong1(_vong1, _vong3), tong1(_vong1, _vong3)));
        chuoi(_vong1);
    }
    // bài 1
    public static void bai1() {
        thongtin1();
        xuatTT1(_vong1 , _vong3);
    }
    // thông tin bai 2
    public static void thongtin2() {
        Scanner _sc = new Scanner(System.in) ;
        
        System.out.print("Tên của NYC là : ");
        _ten = _sc.nextLine();
        System.out.print("Tuổi của NYC là : ");
        _tuoi = Integer.parseInt(_sc.nextLine());
        System.out.print("Chiều cao của NYC là : ");
        _chieuCao = Double.parseDouble(_sc.nextLine());
        System.out.print("Cân nặng của NYC là : ");
        _canNang = Double.parseDouble(_sc.nextLine());
    }
    // tính tổng 2
    public static double tong2() {
        return _canNang + _chieuCao ;
    }
    // tuổi thọ
    public static double tuoiTho(double a , double b){
        return a + b ;
    }
    // Xuất thông tin bài 2
    public static void xuatTT2(String a , int b , double c , double d ) {
        System.out.println("+===== Xuất thông tin =====+");
        
        System.out.println("Tên của NYC là " + _ten);
        System.out.println("Tuổi của NYC là : " + _tuoi);
        System.out.println("Chiều cao của NYC là : " + _chieuCao);
        System.out.println("Cân nặng của NYC là : " + _canNang);
        System.out.println("Tổng : " + tong2());
        System.out.println("Tuổi thọ : " + tuoiTho(_tuoi , _canNang)) ;
    }
    // Bài 2
    public static void bai2(){
        thongtin2();
        xuatTT2(_ten, _tuoi, _canNang, _chieuCao);
    }
    // hàm menu
    public static void menu() {
        Scanner _sc = new Scanner(System.in);
        
        System.out.println("+=== Menu ===+");
        System.out.println("1. Bài 1 ");
        System.out.println("2. bài 2 ");
        System.out.println("3. Thoát ");
        System.out.println("+==============+");
        
        System.out.print("Mời nhập sự lựa chọn : ");
        int _luachon = Integer.parseInt(_sc.nextLine());
        
        switch (_luachon){
            case 1 : bai1();
            break;
            case 2 : bai2();
            break;
            case 3 : System.exit(0);
            default : 
                System.out.println("Nhập từ 1 đén 3 thui") ;
                break;
        }
     }
    
    // Hàm main
    public static void main(String[] args) {
        while(true){
            menu();
        }
    }
}