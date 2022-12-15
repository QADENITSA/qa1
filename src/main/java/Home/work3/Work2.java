package Home.work3;
import java.util.Scanner;

public class Work2 {

        public static void main(String[] args) {
            int number;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a number:");
            number = scanner.nextInt();
            if (number % 2 == 0) {
                System.out.println("Entered number is even");
            } else {
                System.out.println("Entered number is odd");
            }
        }
    }

