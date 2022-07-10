package nguyentientho.design_pattern.singleton_.demo_synchronized;

public class SyncInitSingleton3 {
    private static volatile SyncInitSingleton3 SINGLETON_3;
    private String name;

    private SyncInitSingleton3(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public synchronized static SyncInitSingleton3 getInstance3(String name) {
//        if (SINGLETON_3 == null) {
            for (int i = 0; i < 5; i++) {
                SINGLETON_3 = new SyncInitSingleton3(name);
                System.out.println(SINGLETON_3.getName() + " running lần " + i);
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
//        }
        return SINGLETON_3;
    }
}
