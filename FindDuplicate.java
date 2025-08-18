import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// Question: Identify duplicate elements in a list.
public class FindDuplicate {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 1);
        Set<Integer> unique = new HashSet<>();
        Set<Integer> dupes = numbers.stream()
                .filter(n -> !unique.add(n))
                .collect(Collectors.toSet());
        System.out.println("dupes = " + dupes);

    }
}
