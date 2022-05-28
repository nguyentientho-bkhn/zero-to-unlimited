package nguyentientho.core.thread_pool_;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SubmitRunnableFixedThreadPool {
    public static void main(String[] args) {
        List<Future<?>> futureList = new ArrayList<>();
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 1; i <= 10 ; i++) {
            MyRunnable myRunnable = new MyRunnable("" + i);
            Future<?> future = executorService.submit(myRunnable);

            futureList.add(future);
        }

        for (Future<?> future : futureList) {
            try {
                System.out.println(future.get());
            } catch (InterruptedException | ExecutionException e) {
                System.out.println(e.getMessage());
                Thread.currentThread().interrupt();
            }
        }
        executorService.shutdown();
    }

}
