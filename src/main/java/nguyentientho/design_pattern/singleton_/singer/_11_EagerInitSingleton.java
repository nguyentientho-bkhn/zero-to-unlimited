package nguyentientho.design_pattern.singleton_.singer;

public class _11_EagerInitSingleton {
    private static final _11_EagerInitSingleton INSTANCE = new _11_EagerInitSingleton();

//    private _11_EagerInitSingleton() {}

    public static _11_EagerInitSingleton getInstance() {
        return INSTANCE;
    }
//
//    private _11_EagerInitSingleton() {};
//
//    static {
//        try {
//            EAGER_INIT_SINGLETON_1 = new _11_EagerInitSingleton();
//            System.out.println("running same time main method");
//        } catch (Exception e) {
//            throw new RuntimeException("Error starting create singleton object");
//        }
//    }
//
//    public static _11_EagerInitSingleton getInstance() {
//        return EAGER_INIT_SINGLETON_1;
//    }
//
//    public String getString() {
//        return ("use reflection");
//    }

    private static final _11_EagerInitSingleton INSTANCE2 = new _11_EagerInitSingleton();

    public _11_EagerInitSingleton() {
    }
    
    public static _11_EagerInitSingleton getInstance2() {
        return INSTANCE2;
    }
}
