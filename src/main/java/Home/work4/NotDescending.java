package Home.work4;

import java.util.Scanner;

public class NotDescending {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int numN = scanner.nextInt();

        int[] numbers;
        numbers = new int[numN];
        for (int i = 0; i < numN; i++) {
            numbers[i] = i;
        }
        for (int i = 0; i < numN; i++) {
            if (numbers[i] % 3 != 0) {
                System.out.println("Numbers not descending 3--" + numbers[i]);
            } else if (numbers[i] % 7 != 0) {
                System.out.println("Numbers not descending 7--" + numbers[i]);
            }
        }
    }
}

