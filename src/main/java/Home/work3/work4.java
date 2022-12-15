package Home.work3;

import java.util.Scanner;

public class work4 {
    public static void main(String[] args) {
        int day;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select a day of the week:");
        day = scanner.nextInt();
        if (day == 1){
            System.out.println("The day of the week is Monday");
        } else if (day == 2){
            System.out.println("The day of the week is Tuesday");
        } else if (day == 3){
            System.out.println("The day of the week is Wednesday");
        } else if (day == 4){
            System.out.println("The day of the week is Thursday");
        } else if (day == 5){
            System.out.println("The day of the week is Friday");
        } else if (day == 6){
            System.out.println("The day of the week is Saturday");
        } else if (day == 7){
            System.out.println("The day of the week is Sunday");
        } else {
            System.out.println("Incorrect day from week");
        }
    }
}


