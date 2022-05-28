package nguyentientho.core.exception_;

public class MyDefineExceptions {
    public static void main(String[] args) {
        divideByZero();
        nullPointerException();
        systemExitException();
    }

    protected static void divideByZero() {
        int zero = 0;
        try {
            int average = 10 / zero;
            System.out.println("Average = " + average);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    protected static void nullPointerException() {
        String str = null;
        try {
            System.out.println("NULL Object = " + str.length());
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
    }

    protected static void systemExitException() {
        try {
            int[] intArray = new int[5];
            intArray[5] = 4;
            System.out.println("intArray[5]=" + intArray[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.exit(0);
        } finally {
            System.out.println("finally luôn được in ra cho dù exception có được bắt hay không");
        }
        System.out.println("finally");
    }


}
