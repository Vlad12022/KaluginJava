import java.util.Scanner;

public class StringComparator {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {

            System.out.println("Введите строку a: ");
            String a = scan.nextLine();

            System.out.println("Введите строку b: ");
            String b = scan.nextLine();

            if (a.equals(b)) {
                System.out.println("Строки идентичны");
            } else {
                System.out.println("Строки неидентичны!");
            }
        }
    }
}

