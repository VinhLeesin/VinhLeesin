

import java.util.Scanner;

public class buoi2 {
    public static void main(String[] args) {
        Scanner _sc = new Scanner(System.in);
        double _TBC ;
        System.out.println("nhập số đo vòng 1 Nyc : ");
            double _vong1NYC = Double.parseDouble(_sc.nextLine());
        System.out.println("Nhập số đo vòng 2 Nyc : ");
            double _vong2NYC = Double.parseDouble(_sc.nextLine());
        System.out.println("Nhấp số đo vòng 3 Nyc : ");
            double _vong3NYC = Double.parseDouble(_sc.nextLine());
        _TBC = (_vong1NYC + _vong2NYC + _vong3NYC)/3 ;
        
        _TBC = (int)_TBC ;
        System.out.println("" + _TBC);
    }
}
