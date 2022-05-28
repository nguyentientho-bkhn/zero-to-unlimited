package nguyentientho.core.thread_pool_;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class InvokeAllCallable {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Callable<String>> callableList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            final int _i = i;
            callableList.add(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    Thread.sleep(2000);
                    return "callable-" + _i;
                }
            });
        }

        try {
            List<Future<String>> futureList = executorService.invokeAll(callableList);
            for (Future<String> future : futureList) {
                System.out.println("result = " + future.get());
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
        executorService.shutdown();
    }
}
