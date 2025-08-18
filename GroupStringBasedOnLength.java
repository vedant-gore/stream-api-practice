import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Question: Group a list of strings based on their length.
public class GroupStringBasedOnLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "API", "Code", "Fun");
        Map<Integer, List<String>> group = words.stream()
                .collect(Collectors.groupingBy(String::length, // how to group
                                                HashMap::new,  // where to store the group
                                                Collectors.toList())); //  how to collect elements in each group
        System.out.println("group = " + group);

        Map<Integer, List<String>> grouped = words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println("grouped = " + grouped);

        Map<Integer, List<String>> grouped2 = words.stream()
                .collect(Collectors.groupingBy(
                        String::length,
                        Collectors.mapping(String::toUpperCase, Collectors.toList())
                ));
        System.out.println("grouped2 = " + grouped2);







    }
}
