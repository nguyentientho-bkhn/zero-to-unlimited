package nguyentientho.core.arrays_;

public class TwoDimensionArrays {

    public static void main(String[] args) {
        Integer[][] arraysCouple = {{35, 65}, {45, 32}, {12, 15}, {17, 20}, {16, 28}};
        forDimentionArrays(arraysCouple);
    }

    private static void forDimentionArrays(Integer[][] inputArr) {
        for (int row = 0; row < inputArr.length; row++) {
            System.out.printf("hàng thứ %d: %n", (row+1));
            for (int col = 0; col < inputArr[row].length; col++) {
                System.out.printf("\t cột thứ %d=%d",(col+1),inputArr[row][col]);
                System.out.println();
            }
            System.out.printf("%n");
        }
    }
}
