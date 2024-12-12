import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {

            System.out.print("Введите число a: ");
            Integer a = scan.nextInt();
            System.out.print("Введите число b: ");
            Integer b = scan.nextInt();

            int result = a.compareTo(b);

            if (result > 0) {
                System.out.println("a > b");
            } else if (result < 0) {
                System.out.println("a < b");
            } else {
                System.out.println("a = b");
            }

            System.out.printf("Сложение: %d + %d = %d \n", a, b, a + b);
            System.out.printf("Вычитание: %d - %d = %d \n", a, b, (a - b));
            System.out.printf("Умножение: %d * %d = %d \n", a, b, (a * b));
            if (b != 0) {
                System.out.printf("Деление: %d / %d = %f \n", a, b, (a / (float) b));
            } else {
                System.out.println("Деление на 0 не возможно");
            }
        } catch (InputMismatchException _) {
            System.out.println("Ошибка ввода: нужно ввести число!!!");
        }
    }
}
