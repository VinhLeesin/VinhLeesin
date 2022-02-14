

import java.util.Scanner;

public class buoi3 {
    public static void main(String[] args) {
        Scanner _sc = new Scanner(System.in);
        
        System.out.println("Mời nhập vòng 1 : ");
        double _vong1 = Double.parseDouble(_sc.nextLine());
        System.out.println("Mời nhập vòng 2 : ");
        double _vong2 = Double.parseDouble(_sc.nextLine());
        System.out.println("Mời nhập vòng 3 : ");
        double _vong3 = Double.parseDouble(_sc.nextLine());
        
        // toán tử 3 ngôi
        
        double max = ( _vong1 >= _vong3 ) ? _vong1 : _vong3 ;
        String max2 = ( max >= _vong2 ) ? "eo oke" : "eo ngon" ;
        System.out.println(max2);
    }
}