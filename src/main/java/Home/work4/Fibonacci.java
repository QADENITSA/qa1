package Home.work4;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 8;
        int n1 = 0;
        int n2 = 1;
        int n3 ;
        for (int i = 0; i < n; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
        }
    }
}
