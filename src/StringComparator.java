import java.util.Scanner;

public class StringComparator {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {

            System.out.println("Enter the line a: ");
            String a = scan.nextLine();

            System.out.println("Enter the line b: ");
            String b = scan.nextLine();

            if (a.equals(b)) {
                System.out.println("The lines are identical");
            } else {
                System.out.println("The strings are not identical!");
            }
        }
    }
}

