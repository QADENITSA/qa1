package Home.work4;
import java.util.Scanner;

public class Fibonacci {
    static int calculateSum(int n) {
        if (n <= 0)
            return 0;

        int fib[] = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;

        int sum = fib[0] + fib[1];

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            sum += fib[i];
        }

        return sum;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int n = scanner.nextInt();
        System.out.println("Sum of Fibonacci" +
                " numbers is : " + calculateSum(n));
        scanner.close();
    }
}