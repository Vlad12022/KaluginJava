import java.util.Scanner;

public class StringComparator {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {

            System.out.println("������� ������ a: ");
            String a = scan.nextLine();

            System.out.println("������� ������ b: ");
            String b = scan.nextLine();

            if (a.equals(b)) {
                System.out.println("������ ���������");
            } else {
                System.out.println("������ �����������!");
            }
        }
    }
}

