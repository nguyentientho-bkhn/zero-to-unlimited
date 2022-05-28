package nguyentientho.design_pattern.object_pool;

public class TaxiAppMain {
    public static final int NUM_OF_CLIENT = 10;

    public static void main(String[] args) {
        TaxiPool taxiPool = new TaxiPool();
        for (int i = 1; i <= NUM_OF_CLIENT; i++) {
            Runnable client = new ClientThread(taxiPool);
            Thread thread = new Thread(client);
            thread.start();
        }
    }
}
