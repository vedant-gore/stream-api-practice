import java.util.Map;
import java.util.stream.Collectors;

// Question: Count the frequency of each character in a string.
public class CountFrequencyOfChars {
    public static void main(String[] args) {
        String input = "success";
        Map<Character, Long> freq = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println("freq = " + freq);
    }
}
