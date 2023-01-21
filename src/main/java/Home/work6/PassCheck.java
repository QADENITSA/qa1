package Home.work6;

import java.util.Scanner;

public class PassCheck {
    public static void main(String[] args) {

        System.out.println("Enter password :");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        int n = Validation(password);
        if (n == 1) {
            System.out.println("It is a valid password");
        } else {
            System.out.println("It is not a valid password");
        }
    }

    private static int Validation(String password) {
        if (password.matches(".*[a-zA-Z].*") && password.matches(".*\\d.*")
                && password.matches(".*[@#$].*") && (password.length() >= 8) && (password.length() <= 20)) {
            return 1;
        } else {
            return -1;
        }
    }
}
