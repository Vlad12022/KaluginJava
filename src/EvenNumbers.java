import java.util.Arrays;
import java.util.stream.Collectors;

public class EvenNumbers {
    public static void main(String[] args) {

        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(Arrays.stream(arr)
                .filter(e -> e % 2 == 0)
                .map(String::valueOf)
                .collect(Collectors.joining(",")));
    }
}
