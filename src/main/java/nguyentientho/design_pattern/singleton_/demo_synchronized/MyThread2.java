package nguyentientho.design_pattern.singleton_.demo_synchronized;

public class MyThread2 extends Thread{
    public MyThread2() {
    }

    @Override
    public void run() {
        SyncInitSingleton3.getInstance3("Thread 2");
    }
}
