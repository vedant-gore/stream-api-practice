import java.util.Arrays;
import java.util.List;

// Question: Calculate the sum of all numbers in a list.
public class Sum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .mapToInt(n -> n.intValue())
                .sum();
        System.out.println("sum = " + sum);
    }
}
