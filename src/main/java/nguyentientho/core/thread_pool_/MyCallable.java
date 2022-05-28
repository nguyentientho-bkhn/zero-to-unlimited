package nguyentientho.core.thread_pool_;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    private String name;

    public MyCallable(String name) {
        this.name = name;
    }

    @Override
    public String call() {
        System.out.println(name + " executing ... ");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
            Thread.currentThread().interrupt();
        }
        return name;
    }
}
