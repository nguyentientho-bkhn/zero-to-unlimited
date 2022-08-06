package nguyentientho.design_pattern.singleton_.singer;

public class _11_EagerInitSingleton {
    private static final _11_EagerInitSingleton INSTANCE = new _11_EagerInitSingleton();

    private _11_EagerInitSingleton() {}

    public static _11_EagerInitSingleton getInstance() {
        return INSTANCE;
    }

}
