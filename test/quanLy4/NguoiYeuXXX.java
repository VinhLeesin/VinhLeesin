package quanLy4;

public class NguoiYeuXXX {

    private String name;
    private int tuoi;
    private double vong3;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getVong3() {
        return vong3;
    }

    public void setVong3(double vong3) {
        this.vong3 = vong3;
    }

    public NguoiYeuXXX(String name, int tuoi, double vong3) {
        this.name = name;
        this.tuoi = tuoi;
        this.vong3 = vong3;
    }

    public void xuatTT() {
        System.out.println("Tên : " + this.getName());
        System.out.println("Tuổi : " + this.getTuoi());
        System.out.println("Số đo vòng 3 : " + this.getVong3());
    }
}
