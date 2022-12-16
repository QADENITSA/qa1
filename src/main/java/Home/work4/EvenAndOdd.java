package Home.work4;

import java.util.ArrayList;

public class EvenAndOdd {
    public static void main(String[] args) {
        ArrayList<Integer> massy = new ArrayList<>();
        float sumEvan = 0;
        float sumOdd = 0;

        for (int i = 0; i < 20; i++) {
            massy.add(i);
        }
        System.out.println(massy);
        for (int z = 0; z < 20; z++) {
            if (massy.get(z) % 2 == 0) {
                sumEvan += massy.get(z);
            } else {
                sumOdd += massy.get(z);
            }
        }
        System.out.println("Sum of Evan is:"+ sumEvan);
        System.out.println("Sum of Odd is:"+ sumOdd);
    }
}
