package nguyentientho.core.enum_;

/**
 * Enum có thể có field, method, constructor không khác gì 1 class
 */
public class EnumInClass {
    public enum WeekDay {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

//    public static void main(String[] args) {
//        // gọi enum khi nằm trong 1 class
//        WeekDay wDay = WeekDay.MONDAY;
//        System.out.println(wDay);
//
//        // gọi enum khi từ bên ngoài class
//        EnumWithoutClass d = EnumWithoutClass.THU_HAI;
//        System.out.println(d);
//
//        // có thể lặp toàn bộ các phần tử của enum bằng method values()
//        for (WeekDay wd : WeekDay.values()) {
//            System.out.println(wd);
//        }
//        for (EnumWithoutClass wd : EnumWithoutClass.values()) {
//            System.out.println(wd);
//        }
//    }

}
