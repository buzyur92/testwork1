import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;

        a = readValidNumber(scanner, "первое");
        b = readValidNumber(scanner, "второе");

        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));

        if (b != 0) {
            System.out.println("a / b = " + (a / b));
        } else {
            System.out.println("a / b = невозможно (деление на ноль)");
        }

        scanner.close();
    }

    private static int readValidNumber(Scanner scanner, String numberName) {
        while (true) {
            System.out.print("Введите " + numberName + " целое число (макс. 10 цифр): ");
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Ошибка: введите число!");
                continue;
            }

            boolean isNegative = input.startsWith("-");
            int maxLength = isNegative ? 11 : 10;

            if (input.length() > maxLength) {
                System.out.println("Ошибка: число слишком длинное (макс. " + maxLength + " символов)!");
                continue;
            }

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите корректное целое число!");
            }
        }
    }
}
