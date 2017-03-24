package syntax;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda {

    public static Integer evenDoubleSum(Integer[] arr) {
        List<Integer> ints = Arrays.asList(arr);
        return 
        ints
            .stream()
            .filter( i -> { return i % 2 == 0;}) 
            .map(i -> i * 2)
            .reduce(0, (a, b) -> a + b);
    }

    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3,4};
        System.out.println(evenDoubleSum(arr1));
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println(filtered);
    }
}