
import java.util.Scanner;

public class bth3 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;

        System.out.println("Phương trình: ax + b = c");
        System.out.println("Nhập A:");
        a = new Scanner(System.in).nextDouble();
        System.out.println("Nhập B:");
        b = new Scanner(System.in).nextDouble();
        System.out.println(("Nhập C:"));
        c = new Scanner(System.in).nextDouble();
        System.out.println("Giải phương trình ra là: " + a + "x + " + b + " = " + c);

        if (a != 0) {
            double answer = (c - b) / a;
            System.out.print("x: " + answer);
        } else {
            if (b == c) {
                System.out.print("Vô số nghiệm");
            } else {
                System.out.print("Vô nghiệm");
            }
        }
    }
}
