package nguyentientho.core.multi_thread_;

import nguyentientho.core.blocking_queue_.RunPool;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoMultiThread {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        System.out.println("Ngày hiện tại = " + date);
        String formartDate = simpleDateFormat.format(date);
        System.out.println("format ngày hiện tại === " + formartDate);

        try {
            Date parseDate = simpleDateFormat.parse(formartDate);
            System.out.println("parse ngày hiện tại từ String -> Date = " + parseDate);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void multiThread() {
        ArrayBlockingQueue<String> item = new ArrayBlockingQueue<String>(3);
        item.offer("phone");
        item.offer("v.rohto");
        item.offer("lifebuoy");
        System.out.println("ArrayBlockingQueue= " + item);

        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            threadPool.submit(new RunPool(i));
        }
    }

}
