//home
package Home.work;


import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {

        System.out.println("Your name is: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Your hobby is: ");
        String hobby = scanner.nextLine();;

        System.out.println("Your age is:");
int  age = scanner.nextInt();
       System.out.println("Your name is : " + name + "  " + "Your hobby is : " + hobby + "  " + " You age is :" + age + "  ");
}
}
