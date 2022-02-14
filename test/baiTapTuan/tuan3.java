
import java.util.Scanner;
import java.util.Arrays ;
public class tuan3 {
    // Dữ liệu
    static int size ;
    
    // size
    public static void thongtin()  {
        Scanner _sc = new Scanner(System.in);
        
        System.out.print("Số phần tử trong mảng là : ") ;
        size = Integer.parseInt(_sc.nextLine()) ;
    }
    
    // nhập thông tin size
    public static void nhapTT1(double a[]) { // nhập giá trị
        Scanner _sc = new Scanner(System.in);
        
        for (int i = 0 ; i < a.length ; i++){
            System.out.printf("Giá trị của phần tử thứ %d là : ", (i+1));
            a[i] = Double.parseDouble(_sc.nextLine()) ;
        }
    }
    public static void nhapTT2(String b[]) { // nhập string
        Scanner _sc = new Scanner(System.in);
        
        for (int i = 0 ; i < b.length ; i++){
            System.out.printf("Tên của phần tử thứ %d là : ", (i+1));
            b[i] = _sc.nextLine();
        }
    }
            
    // xuất thông tin size
    public static void xuatTT1(double a[]) {
        System.out.println("==== Xuất thông tin ===");
        for (int i= 0 ; i < a.length ; i++){
            System.out.printf("Giá trị của phần tử thứ %d là :  %.2f\n", (i+1) ,a[i] );
            
        }
    }
    // Xuất thông tin bài 16
    public static void xuatTT2( String b[] , double a[]) {
        System.out.println("===== In thông tin gia đình ===");
        for(int i = 0 ; i < a.length ; i++){
            System.out.printf("Thành viên thứ %d tên là : %s và %.2f tuổi \n", i+1 ,b[i] , a[i]);
        }
        
        System.out.println("Thông tin của người cao tuổi nhất là : ");
        double maxTuoi = a[0] ;
        int viTri = 0 ;
        for(int i = 1 ; i < a.length; i++) {
            if(maxTuoi < a[i]){
                maxTuoi = a[i] ;
                viTri = i ;
            }
        }
        System.out.println("Tên : " + b[viTri]);
        System.out.println("Tuổi : " + a[viTri]);
        
    }
    
    // Cân nặng
    public static void canNang(double a[]) {
        System.out.print("Cân nặng lớn hơn 50 là : ");
        for (int i = 0; i < a.length ; i++) {
            if(a[i] >= 50){
                System.out.printf( " %.2f ", a[i] );
            }
        }
        System.out.printf("\nCân nặng chia hết cho 2 là : ");
        for (int i = 0; i < a.length ; i++) {
            if(a[i] %2 == 0){
                System.out.printf(" %.2f " , a[i]);
            }
        }
    }
    
    // sắp xếp
    public static void sapxep(double a[] ) {
        double temp ;
        for (int i = 0 ; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[j] ;
                    a[j] = a[i] ;
                    a[i] = temp ;
                }
            }
        }
    }
    // tìm max
    public static double max(double a[]){
        double max = a[0] ;
        for (int i = 1 ; i < a.length ; i++){
            if(a[i] > max){
                max = a[i] ;
            }
        }
        return max ;
    }
    // tìm min 
    public static double min(double a[]){
        double min = a[0] ;
        for (int i = 1 ; i < a.length ; i++){
            if(a[i] < min){
                min = a[i] ;
            }
        }
        return min ;
    }
    
    // In mảng
    public static void inmang(double a[]) {
        System.out.print("Mảng vừa nhập là: ");
        for(int i = 0; i < a.length; i++){
            System.out.print( a[i] + " " );
        }
    }
    
    // In ra phần tử chia hết cho 3 và 5
    public static void xuatTT3(double a[]) {
        System.out.printf("\nPhần tử chia hết cho 3 và 5 là : ");
        for (int i = 0; i < a.length; i++) {
            if(a[i] %3 == 0 && a[i] %5 == 0 ){
                System.out.print( a[i] + " ") ;
            }
        }
    }
    // Bài 13
    public static void bai13() {
        for(int i = 1 ; i < 10 ; i++){
            for(int j = 1 ; j < 10 ; j++){
                System.out.printf("%d x %d = %d\n", i , j , i*j );
            }
            System.out.println("=============");
        }
    }
    
    // Bài  14
    public static void bai14() {
        int sum = 0 ;
        int dem = 0 ;
        System.out.print("Trung bình cộng là : ");
        for(int i = 27 ; i < 999 ; i++){
            if(i %5 == 0){
                sum += i ;
                dem++ ;
            }
        }
        System.out.println((double)sum/dem);
    }
    
    // Bài 15
    public static void bai15() {
        thongtin();
        double a[]  = new double[size] ;
        nhapTT1( a );
        xuatTT1( a );
        canNang( a );
        System.out.printf("\nCân nặng lớn nhất là : %.2f" , Arrays.stream(a).max().getAsDouble());
    
    }
    
    // Bài 16
    public static void bai16() {
        thongtin();
        double a[]  = new double[size] ;
        String b[] = new String[size] ;
        nhapTT2( b );  
        nhapTT1( a );
        xuatTT2( b , a ); 
    }
    
    // bài 17
    public static void bai17() {
        thongtin() ;
        double a[]  = new double[size] ;
        nhapTT1(a) ;
        inmang(a);
        Arrays.sort(a);
        System.out.println("Sau khi sắp xếp là : " + Arrays.toString(a));
        
//        sapxep(a);
//        System.out.printf("\nMảng sau khi sắp xếp là : ");
//        for (int i= 0 ; i < a.length ; i++){
//            System.out.print( a[i] + " " );
//        }
        xuatTT3(a);
        System.out.println("\nGiá trị nhỏ nhất của mảng là : " + a[a.length-1]);
        System.out.println("Giá trị lớn nhất của mảng là : " + a[0]);
    }

    //menu
    public static void menu() {
        Scanner _sc = new Scanner(System.in);
        
        System.out.printf("\n+=== Menu ===+\n");
        System.out.println("1. Bài 13 ");
        System.out.println("2. Bài 14 ");
        System.out.println("3. Bài 15 ");
        System.out.println("4. Bài 16 ");
        System.out.println("5. Bài 17 ");
        System.out.println("6. Thoát ");
        System.out.println("+==============+");
        
        System.out.print("Mời nhập sự lựa chọn : ");
        int _luachon = Integer.parseInt(_sc.nextLine());
        
        switch (_luachon){
            case 1 : bai13() ;
            break ;  
            case 2 : bai14() ;
            break ;
            case 3 : bai15() ;
            break ;
            case 4 : bai16() ;
            break ;
            case 5 : bai17() ;
            break ;
            case 6 : System.exit(0);
            default : 
                System.out.println("Nhập từ 1 đến 6 thui") ;
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