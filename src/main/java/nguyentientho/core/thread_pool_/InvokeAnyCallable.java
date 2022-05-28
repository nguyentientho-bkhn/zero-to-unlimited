package nguyentientho.core.thread_pool_;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InvokeAnyCallable {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Callable<String>> callableList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            final int _i = i;
            callableList.add( new Callable<String>() {
                @Override
                public String call() throws Exception {
                    Thread.sleep(3000);
                    return "callable " + _i;
                }
            });
        }

        try {
            // invokeAny sẽ đưa 1 list các callable vào ThreadPool nhưng chỉ cần 1 callable chạy xong thì sẽ đóng
            // tất cả các thread còn lại trong ThreadPool
            String result = executorService.invokeAny(callableList);
            System.out.println("result " + result);
        } catch (InterruptedException | ExecutionException e) {
            System.out.println();
            Thread.currentThread().interrupt();
        }
        executorService.shutdown();
    }
}
