package nguyentientho.core.thread_pool_.callable_future;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallableThreadExecutorsExam {
    public static void main(String[] args) {
        // tạo 1 list để chứa các đối tượng future từ thread trả về
        List<Future<Integer>> callableList = new ArrayList<>();
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        // Thread pool chỉ nhận các đối tượng Runnable và Callable, th này ta tạo 1 Callable kiểu Integer
        Callable<Integer> callable;
        // Thread sau khi xử lý xong trả ra kết quả sẽ được chứa vào các đối tượng future
        Future<Integer> future;
        for (int i = 0; i <= 10; i++) {
            callable = new CallableWorker(i);
            future = executorService.submit(callable);
            callableList.add(future);
        }
//        executorService.shutdown();
//        while (!executorService.isTerminated()) {
//        }
        int sum = 0;
        for (Future<Integer> integerFuture : callableList) {
            try {
                int result = integerFuture.get(3, TimeUnit.SECONDS);
                sum = sum + result;
                System.out.println("result = " + result);
                if (integerFuture.isDone()) System.out.println("Is Completed");
                else System.out.println("Is Cancelled");
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                System.out.println(e.getMessage());
                Thread.currentThread().interrupt();
            }
        }
        executorService.shutdown();
        while (!executorService.isTerminated()) {
        }
        System.out.println("finished all thread: \n Sum all = " + sum);
    }
}
