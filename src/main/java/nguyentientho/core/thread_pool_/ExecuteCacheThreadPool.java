package nguyentientho.core.thread_pool_;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteCacheThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 1; i <= 10; i++) {
            MyRunnable myRunnable = new MyRunnable("" + i);
            executorService.execute(myRunnable);
        }
        executorService.shutdown();
    }
}
