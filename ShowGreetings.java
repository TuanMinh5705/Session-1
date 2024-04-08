import java.util.Scanner;

public class ShowGreetings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên của bạn: ");
        String ten = scanner.nextLine();

        String loiChao = "Xin chào, " + ten + "!";
        System.out.println(loiChao);

        scanner.close();
    }
}
