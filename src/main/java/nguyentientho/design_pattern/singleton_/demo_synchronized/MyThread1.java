package nguyentientho.design_pattern.singleton_.demo_synchronized;

class MyThread1 extends Thread {
    public MyThread1() {
    }

    @Override
    public void run() {
        SyncInitSingleton3.getInstance3("Thread 1");
    }
}
