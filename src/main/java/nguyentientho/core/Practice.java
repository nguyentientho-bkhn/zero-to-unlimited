package nguyentientho.core;

public class Practice {
    public static void main(String[] args) {
        System.out.println("result = " + bitStrings(6));
    }

    static int bitStrings(long n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
           result *= 2;
        }
        return result;
    }
}
