package nguyentientho.core;

/**
 * @author tho.nguyentien
 */
public class OuterClass {
    private int data = 30;

    private class NestedClass {
        void msg() {
            System.out.println("data is = " + data);
        }
    }
}
