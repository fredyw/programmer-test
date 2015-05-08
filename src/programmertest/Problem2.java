package programmertest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem2 {
    public static List<String> combine(List<String> list1, List<String> list2) {
        List<String> newList = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            newList.add(list1.get(i));
            newList.add(list2.get(i));
        }
        return newList;
    }
    
    public static void main(String[] args) {
        System.out.println(combine(
            Arrays.asList("a", "b", "c"),
            Arrays.asList("1", "2", "3")));
    }
}
