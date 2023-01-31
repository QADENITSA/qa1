package Home.work4;

import java.util.Arrays;
import java.util.Scanner;

public class AverageValueOrArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int numN = scanner.nextInt();

        int[] arr;
        arr = new int[numN];
        float sum = 0;
        float average = 0;

        for (int i = 0; i < numN; i++) {
            arr[i] = i * 5;
        }
        System.out.println(Arrays.toString(arr));
        for (int z = 0; z < numN; z++) {
            sum += arr[z];
            average = sum / arr.length;
        }
        System.out.println("Average Score is : " + average);
    }
}