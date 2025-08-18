import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

// Question: Sort a list of integers in descending order.
public class SortList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 1, 4, 2);
        List<Integer> sorted = numbers.stream()
                .sorted((a,b) -> b-a)
                .toList();
        System.out.println("sorted = " + sorted);

        List<Integer> sorted2 = numbers.stream()
                .sorted((a,b) -> Integer.compare(b,a))
                .toList();
        System.out.println("sorted2 = " + sorted2);

        List<Integer> sorted3 = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("sorted3 = " + sorted3);
    }
}
