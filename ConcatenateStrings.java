import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Question: Concatenate all strings in a list into a single string.
public class ConcatenateStrings {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Stream", "API", "is", "powerful");
        String concat = words.stream()
                .collect(Collectors.joining(" "));
        System.out.println("concat = " + concat);

        String concat2 = words.stream()
                .reduce((s1, s2) -> s1 + " " + s2)
                .orElse("");
        System.out.println("concat2 = " + concat2);

        String concat3 = words.stream()
                .reduce("", (s1, s2) -> s1 + " " + s2)
                .trim();
        System.out.println("concat3 = " + concat3);
    }
}
