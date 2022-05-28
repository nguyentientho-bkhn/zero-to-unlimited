package nguyentientho.core.thread_pool_.callable_future;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableWorker implements Callable<Integer> {
    private int num;
    private Random random;

    public CallableWorker(int num) {
        this.num = num;
        this.random = new Random();
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(random.nextInt(10) * 1000);
        int result = num * num;
        System.out.println("Complete taskCallable-" + num);
        return result;
    }
}
