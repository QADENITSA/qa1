package Home.work4;

import java.util.ArrayList;

public class ArrayMultipleElements {
    public static void main(String[] args) {
        ArrayList<Integer> massy = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            massy.add(i*5);
        }
        System.out.println(massy);
    }
}
