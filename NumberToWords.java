import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần đọc (tối đa 3 chữ số): ");
        int number = scanner.nextInt();
        scanner.close();

        if (number < 0 || number > 999) {
            System.out.println("out of ability");
        } else {
            System.out.println(convertNumberToWords(number));
        }
    }

    public static String convertNumberToWords(int number) {
        String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] teens = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        if (number == 0) {
            return "zero";
        }

        if (number < 10) {
            return units[number];
        }

        if (number < 20) {
            if (number % 10 == 0) {
                return tens[number / 10];
            } else {
                return teens[number - 10];
            }
        }

        if (number < 100) {
            return tens[number / 10] + " " + units[number % 10];
        }

        // For three-digit numbers
        int hundreds = number / 100;
        int remainder = number % 100;

        if (remainder == 0) {
            return units[hundreds] + " hundred";
        } else {
            return units[hundreds] + " hundred and " + convertNumberToWords(remainder);
        }
    }
}
