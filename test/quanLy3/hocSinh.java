
package quanLy3;

public class hocSinh {
    private String maHS ;
    private String name ;
    private double diem ;

    public String getMaHS() {
        return maHS;
    }

    public void setMaHS(String maHS) {
        this.maHS = maHS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public hocSinh(String maHS, String name, double diem) {
        this.maHS = maHS;
        this.name = name;
        this.diem = diem;
    }
    
    public void xuatTT(){
        System.out.println("\nMã học sinh : " + this.getMaHS());
        System.out.println("Tên học sinh : " + this.getName());
        System.out.println("Điểm : " + this.getDiem());    
    }
}