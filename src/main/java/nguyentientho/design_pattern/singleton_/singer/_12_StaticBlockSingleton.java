package nguyentientho.design_pattern.singleton_.singer;

public class _12_StaticBlockSingleton {
    private static final _12_StaticBlockSingleton INSTANCE;

    private _12_StaticBlockSingleton() {}

    static {
        try {
            INSTANCE = new _12_StaticBlockSingleton();
            System.out.println("run static block || INSTANCE = " + INSTANCE);
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static _12_StaticBlockSingleton getInstance () {
        return INSTANCE;
    }

    public static void main(String[] args) {
        System.out.println("run main method");
    }
}
