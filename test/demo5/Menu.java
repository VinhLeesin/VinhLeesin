
package demo4;

public class Menu {
    public static void main(String[] args) {
    
    XeMay xm = new XeMay("Version", 2020 , 11111);
//    xm.name = "Version" ;
//    xm.nhapTT();
//    xm.xuatTT();
        System.out.println(xm.toString());
        
        XeMay m = new XeMay( 2015, 200000);
        m.xuatTT();
        
        m.setGia(10000);
        m.setName("honda");
        m.setYear(2022);
        m.xuatTT();
        
    }
}