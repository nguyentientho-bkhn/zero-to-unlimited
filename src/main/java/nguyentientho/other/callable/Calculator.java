package nguyentientho.other.callable;

import java.util.concurrent.Callable;

/**
 * @author tho.nguyentien
 */
public class Calculator implements Callable<Integer> {
    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Integer call() throws Exception {
        return a + b;
    }
}
