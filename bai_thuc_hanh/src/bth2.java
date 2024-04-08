
import java.util.Scanner;

public class bth2 {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner sc = new Scanner(System.in);

        System.out.println(" Nhập chiều rộng ");
        width = sc.nextFloat();

        System.out.println(" Nhập chiều dài ");
        height = sc.nextFloat();

        float result = width * height;
        System.out.println("Result is: " + result);
    }
}
