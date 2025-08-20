import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Question: Given a list of lists, flatten it into a single list.
public class FlattenListOfLists {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9)
        );

        List<Integer> flattened = listOfLists.stream()
                .flatMap((List<Integer> list) -> list.stream())
                .toList();
        System.out.println("flattened = " + flattened);

    }
}
