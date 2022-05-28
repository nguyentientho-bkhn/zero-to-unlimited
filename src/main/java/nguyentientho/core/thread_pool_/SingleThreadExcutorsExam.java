package nguyentientho.core.thread_pool_;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExcutorsExam {
    public static void main(String[] args) {
        // executor service là 1 đối tượng để quản lý Thread pool và blocking queue
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        for (int i = 1; i <= 10; i++) {
            Runnable workerThread = new MyRunnable("" + i);
            executorService.execute(workerThread);
//            executorService.execute(new WorkerThread("" + i));
        }
        executorService.shutdown();
    }
}
