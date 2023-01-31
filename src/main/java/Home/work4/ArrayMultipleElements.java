package Home.work4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMultipleElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int volArray = scanner.nextInt();

        int[] arr;
        arr = new int[volArray];

        for (int i = 0; i < volArray; i++) {
            arr[i] = i * 5;
        }
        System.out.println(Arrays.toString(arr));
    }
}

