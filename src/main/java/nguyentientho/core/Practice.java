package nguyentientho.core;

public class Practice {
    public static void main(String[] args) {
        System.out.println("result = " + bitStrings(10));
        System.out.println("result = " + bitStrings(11));
    }

    static int bitStrings(long number) {
        int result = 1;
        for (int i = 0; i < number; i++) {
           result *= 2;
        }
        return result;
    }
}
