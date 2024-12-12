import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {

            System.out.print("������� ����� a: ");
            Integer a = scan.nextInt();
            System.out.print("������� ����� b: ");
            Integer b = scan.nextInt();

            int result = a.compareTo(b);

            if (result > 0) {
                System.out.println("a > b");
            } else if (result < 0) {
                System.out.println("a < b");
            } else {
                System.out.println("a = b");
            }

            System.out.printf("��������: %d + %d = %d \n", a, b, a + b);
            System.out.printf("���������: %d - %d = %d \n", a, b, (a - b));
            System.out.printf("���������: %d * %d = %d \n", a, b, (a * b));
            if (b != 0) {
                System.out.printf("�������: %d / %d = %f \n", a, b, (a / (float) b));
            } else {
                System.out.println("������� �� 0 �� ��������");
            }
        } catch (InputMismatchException _) {
            System.out.println("������ �����: ����� ������ �����!!!");
        }
    }
}
