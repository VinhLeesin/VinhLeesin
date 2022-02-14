
import java.util.Scanner;

public class buoi6 {

    public String name;
    public double canNang;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(">> Full name  : ");
        this.name = scanner.nextLine();

        System.out.print(">> Cân nặng : ");
        this.canNang = scanner.nextDouble();

    }

    public void output() {
        System.out.println(this.name);
        System.out.println(this.canNang);
    }

    public static void main(String[] args) {
        buoi6 emp = new buoi6();
        emp.input();
        emp.output();
    }
}
