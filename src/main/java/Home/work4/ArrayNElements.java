package Home.work4;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayNElements {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int numN = scanner.nextInt();
        for (int i = 0; i <= numN; i++) {
            numbers.add(i);
        }
        //System.out.println(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));

        }
    }
}
