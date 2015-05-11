package programmertest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem1 {
    public static int sumWithForLoop(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
    
    public static int sumWithWhileLoop(List<Integer> numbers) {
        int sum = 0;
        int i = 0;
        while (i < numbers.size()) {
            sum += numbers.get(i);
            i++;
        }
        return sum;
    }
    
    public static int sumWithRecursion(List<Integer> numbers) {
        return sumWithRecursion(numbers, 0, 0);
    }
    
    private static int sumWithRecursion(List<Integer> numbers, int idx, int accu) {
        if (numbers.size() == 0) {
            return accu;
        }
        List<Integer> newList = new ArrayList<>();
        for (int i = 1; i < numbers.size(); i++) {
            newList.add(numbers.get(i));
        }
        return sumWithRecursion(
            newList,
            idx + 1,
            accu + numbers.get(0));
    }
    
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 8);
        System.out.println(sumWithForLoop(numbers));
        System.out.println(sumWithWhileLoop(numbers));
        System.out.println(sumWithRecursion(numbers));
    }
}
