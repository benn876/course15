package code.recursion;

public class InfinitLoopMain {
    public static long counter = 10;

    public static void main(String[] args) {
        doSomething();
    }

    private static void doSomething() {
        if (counter == 100) {
            return;
        }
        if (counter % 9 == 0) {
            return;
        }
        System.out.println(++counter);
        doSomething();
    }
}
