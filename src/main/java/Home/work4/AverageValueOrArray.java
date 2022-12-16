package Home.work4;

import java.util.ArrayList;

public class AverageValueOrArray {
    public static void main(String[] args) {
        ArrayList<Integer> massy = new ArrayList<>();
        float sum = 0;
        float average = 0;

        for (int i = 0; i < 20; i++) {
            massy.add(i * 5);
        }
        System.out.println(massy);
        for (int z = 0; z < 20; z++) {
            sum += massy.get(z);
            average = sum / massy.size();
        }
        System.out.println("Average Score is : " + average);
    }
}