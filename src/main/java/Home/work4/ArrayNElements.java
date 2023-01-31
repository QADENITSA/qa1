package Home.work4;

import java.util.Scanner;

public class ArrayNElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int numN = scanner.nextInt();

        int[] numbers;
        numbers = new int[numN];

        for (int i = 0; i < numN; i++) {
            numbers[i] = i;
        }
        //System.out.println(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }
        scanner.close();
    }
}
