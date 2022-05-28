package nguyentientho.core.blocking_queue_;

import java.util.concurrent.ArrayBlockingQueue;

public class DemoArrayBlockingQueue {
    public static void main(String[] args) {
        arrayBlockingQueueImpl();
    }

    public static void arrayBlockingQueueImpl() {
        ArrayBlockingQueue<String> animal = new ArrayBlockingQueue<String>(3);
        try {
            animal.put("Dog");
            animal.put("Cat");
            animal.put("Horse");
            animal.put("more Lion");
            System.out.println("ArrayBlockingQueue = " + animal);
        } catch (Exception e) {
            e.getMessage();
        }

    }
}
