package nguyentientho.design_pattern.singleton_.singer;

public class _15_DoubleCheckLockingSingleton {
    private static volatile _15_DoubleCheckLockingSingleton instance;

    private _15_DoubleCheckLockingSingleton() {}

    public static _15_DoubleCheckLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (_15_DoubleCheckLockingSingleton.class) {
                if (instance == null) {
                    instance = new _15_DoubleCheckLockingSingleton();
                }
            }
        }
        return instance;
    }
}
