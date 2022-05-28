package nguyentientho.core.thread_pool_;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SubmitCallableFixedThreadPool {
    public static void main(String[] args) {
        // tạo 1 list chứa các đối tượng future hứng kết quả trả về từ thread
        List<Future<String>> futureList = new ArrayList<>();
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 1; i <= 10; i++) {
            MyCallable myCallable = new MyCallable("Callable " + i);

            Future<String> future = executorService.submit(myCallable);

            futureList.add(future);
        }
        for (Future<String> future : futureList) {
            try {
                System.out.println(future.get() + " kết thúc ");
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
        executorService.shutdown();
    }
}
