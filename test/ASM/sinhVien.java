
package ASM;

public class sinhVien {
    private String name ;
    private double diemTB ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public sinhVien(String name, double diemTB) {
        this.name = name;
        this.diemTB = diemTB;
    }
    
    public void xuatTT(){
        System.out.println("Tên sinh viên : " + this.getName());
        System.out.println("Điểm trung bình : " + this.getDiemTB());
    }
}