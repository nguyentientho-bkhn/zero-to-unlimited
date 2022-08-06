package nguyentientho.design_pattern.singleton_.demo_synchronized;

public class SyncInitSingleton {
    private static SyncInitSingleton SYNC_INSTANCE;
    private String name;

    private SyncInitSingleton(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static synchronized SyncInitSingleton getInstance(String name) {
        for (int i = 0; i < 5; i++) {
            SYNC_INSTANCE = new SyncInitSingleton(name);
            System.out.println(SYNC_INSTANCE.getName() + " running create " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return SYNC_INSTANCE;
    }
}
