package nguyentientho.core.thread_pool_;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteFixedThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 1; i < 11; i++) {
            MyRunnable myRunnable = new MyRunnable("" + i);
            // Đưa các task(runnable) vào Thread pool theo cách bất đồng bộ để xử lý tại vì thread pool chỉ nhận kiểu runnable và callable
            executorService.execute(myRunnable);
        }
        executorService.shutdown();
    }
}
