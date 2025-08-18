import java.util.Arrays;
import java.util.List;

// Question: Find the maximum number from a list of integers.
public class FindMax {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        int max = numbers.stream()
                .mapToInt(n -> n.intValue())
                .max()
                .orElseThrow();
        System.out.println("max = " + max);

        int max2 = numbers.stream()
                .sorted((a,b) -> b-a)
                .findFirst()
                .orElseThrow();
        System.out.println("max2 = " + max2);
    }
}
