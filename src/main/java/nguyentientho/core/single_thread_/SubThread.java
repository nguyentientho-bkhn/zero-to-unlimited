package nguyentientho.core.single_thread_;

public class SubThread extends Thread {
    String name;

    @Override
    public void run() {
        int counter = 0;
        while (counter <= 0) {
            int numberCurrentThread = Thread.activeCount();
            System.out.println("Show số luồng hiện tại = " + numberCurrentThread);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
                Thread.currentThread().interrupt();
            }
            counter++;
            name = Thread.currentThread().getName();
            System.out.println("Tên của luồng hiện tại là = " + name);

            if (name.equals("Thread-Zero")) {
                System.out.println("Luffy");
            } else System.out.println("Sanji");
        }
    }

    public static void main(String[] args) {
        System.out.println("Thread is deamon? = " + Thread.currentThread().isDaemon());

        SubThread subThread = new SubThread();
        subThread.setName("Thread-Zero");
        System.out.println("Ktra Thread hiện tại có alive không = " + Thread.currentThread().isAlive());
        System.out.println("Ktra Thread-Zero mới tạo có alive không = " + subThread.isAlive());
        subThread.start();
        System.out.println("Ktra Thread hiện tại có alive không = " + Thread.currentThread().isAlive());
        System.out.println("Ktra Thread-Zero mới tạo có alive không = " + subThread.isAlive());
        System.out.println("========================================================================================");
    }
}
