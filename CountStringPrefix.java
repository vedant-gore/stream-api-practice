import java.util.Arrays;
import java.util.List;

// Question: Count strings starting with a specific prefix, e.g., “A”.
public class CountStringPrefix {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Annie", "Alex", "Charlie");
        long count = names.stream()
                .filter(name -> name.startsWith("A"))
                .count();
        System.out.println("count = " + count);
    }
}
