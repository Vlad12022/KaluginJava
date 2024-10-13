package kalugin.java;

import java.util.Scanner;
import java.util.stream.Stream;

public class Task {

    public static final String NAME = "John";
    public static final String HELLO = "Hello";
    public static final String DELIMITER = ",";
    public static final String NO_NAME = "There is no such name";

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number, array, name: ");

        while (scan.hasNext()) {

            if (scan.hasNextInt()) {
                int input = scan.nextInt();
                if (input > 7) {
                    System.out.println(HELLO);
                }
            } else if (scan.hasNextLine()) {
                String input = scan.nextLine();
                if (!input.isEmpty()) {
                    if (input.equals(NAME)) {
                        System.out.println(HELLO + DELIMITER + NAME);
                    } else {
                        String[] stringArray = input.split(DELIMITER);
                        if (stringArray.length > 0) {
                            System.out.println("The numbers that are multiples of 3: ");
                            Stream.of(stringArray)
                                    .map(Long::valueOf)
                                    .filter(e -> e % 3 == 0)
                                    .forEach(System.out::println);
                        } else {
                            System.out.println(NO_NAME);
                        }
                    }
                }
            }
        }
    }
}