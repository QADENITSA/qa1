//home
package Home.work;
import java.util.Scanner;

public class Hobby {
    public static void main(String[] args) {

        System.out.println("name and hobby");
        System.out.println("Please enter your name:");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("My name is " + name);

        System.out.println("Please enter your Hobby:");
        String hobby = scanner.nextLine();
        System.out.println("My hobby " + hobby);

    }

}
