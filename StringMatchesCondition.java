import javax.lang.model.SourceVersion;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

// Question: Check if any string in a list contains “API”.
public class StringMatchesCondition {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java", "Stream API", "Lambda");
        boolean check = strings.stream()
                .anyMatch(str -> str.contains("API"));
        System.out.println("check = " + check);

        AtomicReference<String> capture = new AtomicReference<>();
        String result = strings.stream()
                .filter(str -> str.contains("API"))
                .peek(str -> capture.set(str))
                .findFirst()
                .orElse(null);
        System.out.println("result = " + result);

        String result2 = strings.stream()
                .filter(str -> str.contains("API"))
                .findFirst()
                .orElse(null);
        System.out.println("result2 = " + result2);
    }
}
