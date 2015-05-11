package programmertest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Problem4 {
    public static int largest(List<Integer> numbers) {
        List<String> strings = numbers.stream().map(e -> e.toString())
            .collect(Collectors.toList());
        Collections.sort(strings, (a, b) -> {
            return Integer.valueOf(b + a).compareTo(Integer.valueOf(a + b));
        });
        StringBuilder sb = new StringBuilder();
        for (String s : strings) {
            sb.append(s);
        }
        return Integer.parseInt(sb.toString());
    }
    
    public static void main(String[] args) {
        System.out.println(largest(Arrays.asList(50, 2, 1, 9)));
        System.out.println(largest(Arrays.asList(5, 50, 56)));
        System.out.println(largest(Arrays.asList(420, 42, 423)));
    }
}
