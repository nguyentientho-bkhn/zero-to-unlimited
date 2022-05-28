package nguyentientho.core.single_thread_;

public class SubRunable implements Runnable {

    String name;

    @Override
    public void run() {
        int count = 0;
        while (count <= 0) {
            name = Thread.currentThread().getName();
            System.out.println(name);
            count++;
        }
    }

    public static void main(String[] args) {
        SubRunable subRunable = new SubRunable();
        Thread threadRunable = new Thread(subRunable);
        System.out.println("thread runable có alive hay ko = " + threadRunable.isAlive());

        threadRunable.start();
        System.out.println("số thread = " + Thread.activeCount());
        System.out.println("thread runable có alive hay ko = " + threadRunable.isAlive());
    }
}
