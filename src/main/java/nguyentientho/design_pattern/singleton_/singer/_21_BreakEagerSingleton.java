package nguyentientho.design_pattern.singleton_.singer;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Tương tự EagerSingleton, BillPughSingleton cũng bị break cqua reflection
 */
public class _21_BreakEagerSingleton {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException {
        _11_EagerInitSingleton instanceNew1 = _11_EagerInitSingleton.getInstance();
        _11_EagerInitSingleton instanceNew2 = null;
//
//        Constructor<?>[] constructors = _11_EagerInitSingleton.class.getDeclaredConstructors();
//        for (Constructor<?> constructor : constructors) {
//            constructor.setAccessible(true);
//            instanceNew2 = (_11_EagerInitSingleton) constructor.newInstance();
//        }
//        System.out.println(instanceNew1.hashCode());
//        System.out.println(instanceNew2.hashCode());

        Constructor<?>[] constructors = _11_EagerInitSingleton.class.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            constructor.setAccessible(true);
            instanceNew2 = (_11_EagerInitSingleton) constructor.newInstance();
        }

        System.out.println(instanceNew1.hashCode());
        System.out.println(instanceNew2.hashCode());

    }
}
