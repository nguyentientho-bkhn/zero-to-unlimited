package nguyentientho.core.arrays_;

import java.util.Arrays;

public class Label2LoopMain {
    public static void main(String[] args) {
        int[][] intArr = {{1, -2, 3}, {0, 3}, {1, 2, 5}, {9, 2, 5}};
        loopWithLabel(intArr);
    }

    private static void loopWithLabel(int[][] inputArr) {
        for (int[] ints : inputArr) {
            boolean allPositive = true;
            for (int anInt : ints) {
                if (anInt < 0) {
                    allPositive = false;
                    break;
                }
            }
            if (allPositive) {
                System.out.println("Processing " + Arrays.toString(ints));
            }
        }
    }
}
