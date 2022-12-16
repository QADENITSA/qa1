package Home.work4;

import java.util.ArrayList;

public class NotDescending {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add(i);
        }
        for (int i = 0; i < 100; i++) {
            if (numbers.get(i) % 3 != 0) {
                System.out.println("Numbers not descending 3--" + numbers.get(i));
            }else if (numbers.get(i) % 7 != 0){
                System.out.println("Numbers not descending 7--" + numbers.get(i));
            }
        }
    }
}

