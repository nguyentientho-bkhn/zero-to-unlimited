package nguyentientho.core.thread_pool_;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledFixDelayThreadPool {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);
        for (int i = 0; i <= 10; i++) {
            MyRunnable myRunnable = new MyRunnable("" + i);
            scheduledExecutorService.scheduleWithFixedDelay(myRunnable, 1, 3, TimeUnit.SECONDS);
        }
        try {
            scheduledExecutorService.awaitTermination(10, TimeUnit.SECONDS);
            scheduledExecutorService.shutdown();
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
        while (!scheduledExecutorService.isTerminated())
            System.out.println("waitting executing... threads-");

        System.out.println(" ===== Finished all threads ====== ");
    }

}
