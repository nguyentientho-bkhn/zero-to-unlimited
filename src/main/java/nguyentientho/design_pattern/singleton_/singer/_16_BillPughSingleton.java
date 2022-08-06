package nguyentientho.design_pattern.singleton_.singer;

public class _16_BillPughSingleton {

    private _16_BillPughSingleton() {}

    private static class SingletonHelper {
        private static final _16_BillPughSingleton INSTANCE = new _16_BillPughSingleton();
    }

    public static _16_BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public static void main(String[] args) {
        _16_BillPughSingleton instance = SingletonHelper.INSTANCE;
    }
}
