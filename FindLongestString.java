import java.util.Arrays;
import java.util.List;

// Question: Find the longest string in a list.
public class FindLongestString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "API", "Development");
        String longest = words.stream()
                .reduce("", (str1, str2) -> str1.length() > str2.length() ? str1:str2)
                .trim();
        System.out.println("longest = " + longest);
    }
}
