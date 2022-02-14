import java.util.Scanner;

public class tuan1 {
    public static void bai1() {
        Scanner _sc = new Scanner(System.in);
        System.out.print("Tên game : ");
            String _ten = _sc.nextLine();
        System.out.print("Nhập tên tướng : ");
            String _tuong = _sc.nextLine();
        System.out.print("Nhập skin tướng : ");
            String _skin = _sc.nextLine();
        System.out.print("Nhập điểm thông thạo : ");
            int _thongThao = _sc.nextInt();
        System.out.println("Tên game : " + _ten );
        System.out.println("Tên tướng : " + _tuong);
        System.out.println("Tên skin : " + _skin);
        System.out.println("Điểm thông thạo : " + _thongThao);
    }
    
    public static void bai2() {
        Scanner _sc = new Scanner(System.in);
        System.out.print("Tuổi của bạn là : ");
            int _tuoiBan = _sc.nextInt();
        System.out.print("Tuổi của người yêu bạn là : ");
            int _tuoiNY = _sc.nextInt();
            
            int _tuoiTho = _tuoiBan + _tuoiNY;
        System.out.println("Tuổi thọ của bạn là : " + _tuoiTho);
    }
    
    public static void bai3() {
        Scanner _sc = new Scanner(System.in);  
        
        System.out.print("Nhập tên người yêu cũ : ");
            String _tenNYC = _sc.nextLine();
        System.out.print("Nhập số đo vòng 3 : ");
            double _vong3Nyc = _sc.nextDouble();
            _sc.nextLine();
        System.out.print("Nhập dáng : ");
            String _dang = _sc.nextLine();
        System.out.print("Nhập chiều cao : ");
            double _chieuCao = _sc.nextDouble();
            
        System.out.println("Tên người yêu cũ : " + _tenNYC); 
        System.out.println("Số đo vòng 3 : " + _vong3Nyc ) ;
        System.out.println("Dáng người yêu cũ : " + _dang );
        System.out.println("Chiều cao người yêu cũ : " + _chieuCao);
    }
    
    public static void bai4() {
        Scanner _sc = new Scanner(System.in);
       
            double _TBC1 ;
        System.out.print("nhập số đo vòng 1 Nyc : ");
            double _vong1NYC = Double.parseDouble(_sc.nextLine());
        System.out.print("Nhập số đo vòng 2 Nyc : ");
            double _vong2NYC = Double.parseDouble(_sc.nextLine());
        System.out.print("Nhấp số đo vòng 3 Nyc : ");
            double _vong3NYC = Double.parseDouble(_sc.nextLine());
        
            _TBC1 = (_vong1NYC + _vong2NYC + _vong3NYC )/3;
            _TBC1 = (int)_TBC1 ;
        System.out.println("số đo vòng 1 la : " + _vong1NYC );
        System.out.println("Số đo vòng 2 là : " + _vong2NYC );
        System.out.println("Số đo vòng 3 la : " + _vong3NYC );
        System.out.println("Số đo trung bình là : " + _TBC1 );
    }
    
    public static void bai6() {
        Scanner _sc = new Scanner(System.in);
        
        System.out.println("+== Nhập thông tin sức khỏe ==+ ");
        System.out.print("Nhập tên của bạn : ");
            String _ten1 = _sc.nextLine();
        System.out.print("Nhập tình trạng : ");
            String _tinhTrang = _sc.nextLine();
        System.out.print("Nhập nhiệt độ : ");
            double _nhietDo = _sc.nextDouble();
        System.out.println("+== Xuât thông tin ==+");
        System.out.println("Tên cửa bạn là : " + _ten1 );
        System.out.println("Tình trạng của bạn là : " + _tinhTrang );
        System.out.println("Nhiệt độ của bạn là : " + _nhietDo );
        System.out.print("Kết luận : ");
        if(_nhietDo >= 38 ){
            System.out.println("Khám nhanh covid giờ");
        }
        else{
            System.out.println("Khỏe như trâu");
        }
    }
    
    public static void bai7() {
        Scanner _sc = new Scanner(System.in);
        
            double _TBC2 ;
        System.out.print("nhập số đo vòng 1 Nyc : ");
            double _vong1NYc = Double.parseDouble(_sc.nextLine());
        System.out.print("Nhập số đo vòng 2 Nyc : ");
            double _vong2NYc = Double.parseDouble(_sc.nextLine());
        System.out.print("Nhấp số đo vòng 3 Nyc : ");
            double _vong3NYc = Double.parseDouble(_sc.nextLine());
            
            _TBC2 = (_vong1NYc + _vong2NYc*2 + _vong3NYc*3 )/6 ;
            _TBC2 = (int)_TBC2;
        System.out.println("TBC số đo 3 vòng là " + _TBC2 );
    }
    
    public static void bai8() {
        Scanner _sc = new Scanner(System.in);
        
        System.out.print("Mời nhập số lượng tóc : ");
            int _toc = _sc.nextInt() ;
            String _toc1 = "Còn cái nịt" ;
            String _toc2 = "Đang mọc tóc" ;
            String _toc3 ;
            _toc3 = ( _toc <= 100 ) ? _toc1 : _toc2 ;
        System.out.println(_toc3);
   
       
    }
    
    public static void menu() {
        Scanner _sc = new Scanner(System.in);
        
        System.out.println("+===== MENU =====+");
        System.out.println("1. Bài 1 ");
        System.out.println("2. Bài 2 ");
        System.out.println("3. Bài 3 ");
        System.out.println("4. Bài 4 ");
        System.out.println("5. Bài 6 ");
        System.out.println("6. Bài 7 ");
        System.out.println("7. Bài 8 ");
        System.out.println("8. Thoát ");
        System.out.println("===================");                             
        
        System.out.print("Mời nhập sự lựa chọn : ");
            int _luaChon = Integer.parseInt(_sc.nextLine());
            
        switch (_luaChon){
            case 1 : bai1();
                break ;
            case 2 : bai2();
                break ;
            case 3 : bai3();
                break ;
            case 4 : bai4();
                break ;
            case 5 : bai6();
                break ;
            case 6 : bai7();
                break ;
            case 7 : bai8();
                break ;
            case 8 : System.exit(0);
            default :
               System.out.println("Chọn từ 1 đén 8 thui");
                break;
        }
    }
    
    public static void main(String[] args){
        while (true) {
             menu() ;
        }    
    }
}