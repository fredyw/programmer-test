package programmertest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem5 {
    private static int sum(String str) {
        List<Integer> numbers = Arrays.asList(str.split("\\+|-")).stream()
            .map(e -> Integer.valueOf(e))
            .collect(Collectors.toList());
        int idx = 0;
        int n = numbers.get(idx);
        String sign = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '-') {
                sign = "-";
            } else if (str.charAt(i) == '+') {
                sign = "+";
            } else {
                if (sign.equals("-")) {
                    n -= numbers.get(++idx);
                } else if (sign.equals("+")) {
                    n += numbers.get(++idx);
                }
                sign = "";
            }
        }
        return n;
    }
    
    private static void possibilities(List<Integer> numbers, int idx, String accu, int expected) {
        if (idx == numbers.size()) {
            int s = sum(accu);
            if (s == expected) {
                System.out.println(accu);
            }
            return;
        }
        int n = numbers.get(idx);
        possibilities(numbers, idx + 1, accu + n, expected);
        possibilities(numbers, idx + 1, accu + "-" + n, expected);
        possibilities(numbers, idx + 1, accu + "+" + n, expected);
    }
    
    public static void possibilities(List<Integer> numbers, int expected) {
        possibilities(numbers, 1, "" + numbers.get(0), expected);
    }
    
    public static void main(String[] args) {
        possibilities(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9), 100);
    }
}
