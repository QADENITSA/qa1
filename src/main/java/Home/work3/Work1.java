package Home.work3;

import java.util.Scanner;

public class Work1 {
    public static void main(String[] args) {

            int b, d, p;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the first number:");
            b = scanner.nextInt();
            System.out.println("Enter the second number:");
           d = scanner.nextInt();
            System.out.println("Enter the third number:");
            p = scanner.nextInt();
            if(b > d && d > p)
            {
                System.out.println("Largest number is:"+b);
            }
            else if(d > p)
            {
                System.out.println("Largest number is:"+d);
            }
            else
            {
                System.out.println("Largest number is:"+p);
            }

        }
    }




