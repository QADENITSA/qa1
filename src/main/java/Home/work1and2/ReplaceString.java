package Home.work1and2;

import java.util.Scanner;

public class ReplaceString {
    public static void main(String args[]) {
        String str = "My name is Plamen";
        System.out.println(str);

        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        String replaceString = str.replace("Plamen", name);
        System.out.println(replaceString);
    }
}

