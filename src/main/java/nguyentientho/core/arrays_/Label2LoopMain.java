package nguyentientho.core.arrays_;

import java.util.Arrays;

public class Label2LoopMain {
    public static void main(String[] args) {
        int[][] intArr = {{1, -2, 3}, {0, 3}, {1, 2, 5}, {9, 2, 5}};
        loopWithLabel(intArr);
    }

    private static void loopWithLabel(int[][] inputArr) {
        mang2Chieu:
        for (int i = 0; i < inputArr.length; i++) {
            boolean allPositive = true;
            for (int j = 0; j < inputArr[i].length; j++) {
                if (inputArr[i][j] < 0) {
                    allPositive = false;
                    continue mang2Chieu;
                }
            }
            if (allPositive) {
                System.out.println("Processing " + Arrays.toString(inputArr[i]));
            }
        }
    }
}
