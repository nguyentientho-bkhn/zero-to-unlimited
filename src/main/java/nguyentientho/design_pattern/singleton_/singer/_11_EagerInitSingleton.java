package nguyentientho.design_pattern.singleton_.singer;

public class _11_EagerInitSingleton {
    private static final _11_EagerInitSingleton INSTANCE = new _11_EagerInitSingleton();

    private _11_EagerInitSingleton() {}

    public static _11_EagerInitSingleton getInstance() {
        return INSTANCE;
    }

//    private static final EagerInitSingleton1 EAGER_INIT_SINGLETON_1 = new EagerInitSingleton1();
//    private static _11_EagerInitSingleton EAGER_INIT_SINGLETON_1;
//
//    private _11_EagerInitSingleton() {};
//
//    static {
//        try {
//            EAGER_INIT_SINGLETON_1 = new _11_EagerInitSingleton();
//            System.out.println("chạy cùng main");
//        } catch (Exception e) {
//            throw new RuntimeException("Lỗi xảy ra khi khởi tạo đối tượng singleton");
//        }
//    }
//
//    public static _11_EagerInitSingleton getInstance() {
//        return EAGER_INIT_SINGLETON_1;
//    }
//
//    public String getString() {
//        return ("sử dụng reflection");
//    }
}
