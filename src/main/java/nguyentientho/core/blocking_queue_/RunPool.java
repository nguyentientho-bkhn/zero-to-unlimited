package nguyentientho.core.blocking_queue_;

public class RunPool implements Runnable {

    int id;

    @Override
    public void run() {
        System.out.println("Đang xử lý tiến trình " + id);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
            Thread.currentThread().interrupt();
        }

        System.out.println("Đã xử lý tiến trình " + id);
    }

    public RunPool(int id) {
        this.id = id;
    }
}
