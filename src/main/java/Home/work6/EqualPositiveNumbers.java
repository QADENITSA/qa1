package Home.work6;

import java.util.Scanner;

public class EqualPositiveNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers1:");
        int numbers1 = scanner.nextInt();

        System.out.println("Enter numbers2:");
        int numbers2 = scanner.nextInt();

        System.out.println("Enter numbers3:");
        int numbers3 = scanner.nextInt();

        checkNum(numbers1, numbers2, numbers3);

        scanner.close();
    }

    public static void checkNum(int num1, int num2, int num3) {

        if (num1 > 0) {
            System.out.println("Num1 is a positive");
        } else {
            System.out.println("Num1 is not a positive");
        }

        if (num2 > 0) {
            System.out.println("Num2 is a positive");
        } else {
            System.out.println("Num2 is not a positive");
        }

        if (num3 > 0) {
            System.out.println("Num2 is a positive");
        } else {
            System.out.println("Num2 is not a positive");
        }
        if (num1 == num2 && num2 == num3) {
            System.out.println("Numbers is a equal");
        } else {
            System.out.println("Numbers is not a equal");
        }
    }
}
