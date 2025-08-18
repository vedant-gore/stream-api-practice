import java.util.*;
import java.util.stream.Stream;

// Question: Given a list of integers, filter the even numbers.
public class FilterEvenNumbers {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Stream<Integer> numStream = numbers.stream();
        List<Integer> even = numStream.filter(n -> n%2 == 0)
                .toList();
        System.out.println("even = " + even);
    }
}