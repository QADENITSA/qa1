package Home.work6;

import java.util.Scanner;

public class AvrSumMethods {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers1:");
        int numbers1 = scanner.nextInt();

        System.out.println("Enter numbers2:");
        int numbers2 = scanner.nextInt();

        avr(numbers1, numbers2);

        scanner.close();
    }

    public static void avr(int num1, int num2) {
        System.out.println("Average score: " + ((num1 + num2)/ 2));
        sum(num1, num2);
    }

    public static void sum(int num1, int num2) {
        System.out.println("Sum of numbers: " + (num1 + num2));
    }
}
