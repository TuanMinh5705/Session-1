
import java.util.Scanner;

public class bth6 {
    public static void main(String[] args) {
        System.out.println("Nhập tháng: ");
        int month = new Scanner(System.in).nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng này có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng này có 30 ngày");
                break;
            case 2:
                System.out.println("Tháng này có 28 ngày hoặc 29 ngày");
        }
    }
}
