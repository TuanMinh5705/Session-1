import java.util.Scanner;

public class bth4 {
    public static void main(String[] args) {
        System.out.println(" Hãy nhập năm hiện tại:");
        double year = new Scanner(System.in).nextDouble();
        if (((year % 4 == 0) && (year % 100 != 0)) || ((year % 100 == 0) && (year % 400 == 0))) {
            System.out.println("Năm " + year + " Là năm nhuận ");
        } else {
            System.out.println("Năm " + year + " Không phải là năm nhuận ");
        }
    }
}