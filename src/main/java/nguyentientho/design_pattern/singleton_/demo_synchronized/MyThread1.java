package nguyentientho.design_pattern.singleton_.demo_synchronized;

public class MyThread1 extends Thread {
    public MyThread1() {
    }

    @Override
    public void run() {
        SyncInitSingleton.getInstance("Thread 1");
    }
}
