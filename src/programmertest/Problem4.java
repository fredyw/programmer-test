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
            int minLength = Math.min(a.length(), b.length());
            for (int i = 0; i < minLength; i++) {
                int x = Integer.parseInt("" + a.charAt(i));
                int y = Integer.parseInt("" + b.charAt(i));
                if (x < y) {
                    return 1;
                } else if (x > y) {
                    return -1;
                }
            }
            return 0;
        });
        StringBuilder sb = new StringBuilder();
        for (String s : strings) {
            sb.append(s);
        }
        return Integer.parseInt(sb.toString());
    }
    
    public static void main(String[] args) {
        System.out.println(largest(Arrays.asList(50, 2, 1, 9)));
    }
}
