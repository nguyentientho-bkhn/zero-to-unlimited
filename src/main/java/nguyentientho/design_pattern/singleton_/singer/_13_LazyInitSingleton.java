package nguyentientho.design_pattern.singleton_.singer;

public class _13_LazyInitSingleton {
    private static _13_LazyInitSingleton SINGLETON_2;

    private _13_LazyInitSingleton() {}

    public static _13_LazyInitSingleton getSingleton2() {
        if (SINGLETON_2 == null) {
            SINGLETON_2 = new _13_LazyInitSingleton();
        }
        return SINGLETON_2;
    }
}
