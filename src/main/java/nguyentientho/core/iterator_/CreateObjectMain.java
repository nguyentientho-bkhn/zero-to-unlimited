package nguyentientho.core.iterator_;

import java.lang.reflect.InvocationTargetException;

public class CreateObjectMain {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
            IllegalAccessException, NoSuchMethodException, InvocationTargetException, CloneNotSupportedException {

        // cach 2
        TamGiacVuong vuong2 = (TamGiacVuong) Class.forName("core.iterator_.TamGiacVuong").newInstance();
        System.out.println("cach 2 = " + vuong2.toString());

        // cach 3
        TamGiacVuong vuong3 = TamGiacVuong.class.newInstance();
        System.out.println("cach 3 = " + vuong3.toString());

        // cach 4
        TamGiacVuong vuong4 = TamGiacVuong.class.getConstructor().newInstance();
        System.out.println("cach 4 = " + vuong4.toString());

        // cach 5
        TamGiacVuong vuong5 = (TamGiacVuong) vuong2.clone();
        System.out.println("cach 5 =" + vuong5.toString());
    }
}
