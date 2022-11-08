package nguyentientho.other.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @author tho.nguyentien
 */
public class CallableMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        List<Future<Integer>> futures = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Calculator c = new Calculator(i, i + 1);
            futures.add(executor.submit(c));
        }
        for (Future<Integer> future : futures) {
            System.out.println(future.get(3, TimeUnit.SECONDS));
        }
        executor.shutdown();
    }
}
