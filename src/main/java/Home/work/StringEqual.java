package Home.work;

import java.util.Scanner;

public class StringEqual {
    public static void main(String[] args) {
        System.out.println("Enter first word: ");

        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine();

        System.out.println("Enter second word: ");
        String word2 = scanner.nextLine();

        if (word1.equals(word2)) {
            System.out.println("The words match!!!");
        } else {
            System.out.println("The words didn't match!!!");
        }
    }
}
