import java.util.Arrays;
import java.util.List;

// Question: Convert all strings in a list to uppercase.
public class ConvertToUpperCase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("java", "stream", "api");
        List<String> uc = names.stream()
                .map(name -> name.toUpperCase())
                .toList();
        System.out.println("uc = " + uc);

        List<String> uc2 = names.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println("uc2 = " + uc2);
    }
}
