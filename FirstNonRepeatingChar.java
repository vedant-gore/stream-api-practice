import java.util.Optional;

// Question: Find the first non-repeated character in a string.
public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String inp = "swiss";
        char output = inp.chars()
                .mapToObj(c -> (char)c)
                .filter(c -> inp.indexOf(c) == inp.lastIndexOf(c))
                .findFirst()
                .orElse('\0');

        char output2 = (char) inp.chars()
                .filter(c -> inp.indexOf(c) == inp.lastIndexOf(c))
                .findFirst()
                .orElse('\0');
    }
}
