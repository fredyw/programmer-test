package programmertest;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem3 {
    public static List<BigInteger> fibonacciList(int n) {
        List<BigInteger> result = new ArrayList<>();
        Map<Integer, BigInteger> memo = new HashMap<>();
        for (int i = 0; i < n; i++) {
            result.add(fibonacci(i, memo));
        }
        return result;
    }
    
    public static BigInteger fibonacci(int n, Map<Integer, BigInteger> memo) {
        if (n == 0) {
            return new BigInteger("0");
        }
        if (n == 1) {
            return new BigInteger("1");
        }
        BigInteger a = new BigInteger("0");
        if (memo.containsKey(n - 1)) {
            a = memo.get(n - 1);
        } else {
            a = fibonacci(n - 1, memo);
            memo.put(n - 1, a);
        }
        
        BigInteger b = new BigInteger("0");
        if (memo.containsKey(n - 2)) {
            b = memo.get(n - 2);
        } else {
            b = fibonacci(n - 2, memo);
            memo.put(n - 2, b);
        }
        BigInteger f = a.add(b);
        return f;
    }
    
    public static void main(String[] args) {
        System.out.println(fibonacciList(100));
    }
}
