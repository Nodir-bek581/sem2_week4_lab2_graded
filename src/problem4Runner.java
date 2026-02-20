

public class problem4Runner {
    public static void main(String[] args) {
        StopWatch watch = new StopWatch();

        int number = 20;
        int iterations = 1000000;

        watch.start();

        long recursiveResult = 0;
        for (int i = 0; i < iterations; i++) {
            recursiveResult = MathTool.factorialRecursive(number);
        }

        watch.stop();
        long recursiveTime = watch.getElapsedTime();
        System.out.println("Recursive factorial of " + number + " = " + recursiveResult);
        System.out.println("Recursive time: " + recursiveTime + " ms\n");

        watch.start();

        long iterativeResult = 0;
        for (int i = 0; i < iterations; i++) {
            iterativeResult = MathTool.factorialIterative(number);
        }

        watch.stop();
        long iterativeTime = watch.getElapsedTime();
        System.out.println("Iterative factorial of " + number + " = " + iterativeResult);
        System.out.println("Iterative time: " + iterativeTime + " ms\n");

        System.out.println("Recursive time: " + recursiveTime + " ms");
        System.out.println("Iterative time: " + iterativeTime + " ms");
    }
}