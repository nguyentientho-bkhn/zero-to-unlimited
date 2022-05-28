package nguyentientho.design_pattern.singleton_.singer;

public class _14_ThreadSafeSingleton {
    private static volatile _14_ThreadSafeSingleton instance;

    private _14_ThreadSafeSingleton() {}

    public static synchronized _14_ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new _14_ThreadSafeSingleton();
        }
        return instance;
    }
}
