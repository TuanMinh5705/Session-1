
import java.util.Scanner;

public class bth5 {
    public static void main(String[] args) {
        double h, w, bmi;
        System.out.println("Nhập chiều cao của bạn(Cm): ");
        h = new Scanner(System.in).nextDouble();
        System.out.println("Nhập cân nặng của bạn(Kg): ");
        w = new Scanner(System.in).nextDouble();
        bmi = w / Math.pow(h,2);

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Gầy");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Bình Thường ");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Thừa Cân");
        else
            System.out.printf("%-20.2f%s", bmi, "Béo Phì");
    }
}
