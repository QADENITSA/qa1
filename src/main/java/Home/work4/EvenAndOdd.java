package Home.work4;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int numN = scanner.nextInt();

        int[] arr;
        arr = new int[numN];
        float sumEvan = 0;
        float sumOdd = 0;

        for (int i = 0; i < numN; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));
        for (int z = 0; z < numN; z++) {
            if (arr[z] % 2 == 0) {
                sumEvan += arr[z];
            } else {
                sumOdd += arr[z];
            }
        }
        System.out.println("Sum of Evan is:" + sumEvan);
        System.out.println("Sum of Odd is:" + sumOdd);
    }
}
