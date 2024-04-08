import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {

        double exchangeRate = 0.000043;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền VND cần chuyển đổi: ");
        long amountInVND = scanner.nextLong();

        double amountInUSD = amountInVND * exchangeRate;

        System.out.println(amountInVND + " VND is equal to " + amountInUSD + " USD");
    }
}
