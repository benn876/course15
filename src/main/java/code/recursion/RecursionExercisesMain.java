package code.recursion;

import java.util.HashMap;
import java.util.Map;

public class RecursionExercisesMain {
    public static Map<Long, Long> cache = new HashMap<>();

    public static void main(String[] args) {
        //print all numbers from n to 0 using recursivity
        //  printRecursivityNumbers(10);

        //sum of all numbers from n to 1
        //System.out.println(sumRecursivityNumbers(10));

        // sirul lui fibonacci 1, 1, 2, 3, 5, 8, 13, 21, 34,...
        // fib(6) -> fib(5) + fib(4)
        // fib(5) -> fib(4) + fib(3)
        // fib(4) -> fib(3) + fib(2)
        // fib(3) -> fib(2) + fib(1)
        // fib(2) -> fib(1) + fib(0)
        // afisezi al n numar din sir
        System.out.println(fibonacci(200));
    }

    private static long fibonacci(long n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        long firstResult = fibonacci(n - 1);
        long secondResult = fibonacci(n - 2);
        long result = firstResult + secondResult;
        cache.put(n, result);
        return result;
    }

    private static int sumRecursivityNumbers(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecursivityNumbers(n - 1);
        //n + sumRecursivityNumbers(n-1)
        // n + (n -1 ) + sumRecursivityNumbers(n-2)
        // n + (n -1 )+ (n-2) + sumRecursivityNumbers(n-3)
        //...
        //n + (n-1) + (n-2) +....+ sumRecursivityNumbers(1)
        //n + (n-1) + (n-2) +....+ 2 + 1
    }

    private static void printRecursivityNumbers(int n) {
        //exit condition step
        if (n == -1) {
            return;
        }
        //the processing part
        System.out.println(n);

        //re-enter step
        printRecursivityNumbers(n - 1);
    }
}
