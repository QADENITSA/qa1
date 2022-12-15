package Home.work3;

import java.util.Scanner;

public class Work3 {
    public static void main(String[] args) {
        System.out.println("insert side a: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("insert side b: ");
        int b = scanner.nextInt();
        System.out.println("perimeter = " + (a + b + a +b));
        System.out.println("area = "  + (a*b));
    }
}
