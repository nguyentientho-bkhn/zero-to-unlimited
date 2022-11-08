package nguyentientho.java_8;

import java.util.Optional;
import java.util.function.Function;

public class OptionalExplanation {
    public static void main(String[] args) {
        Optional<String> nullObj = null;
        Optional<String> empty = Optional.empty();
        Optional<String> stringOptional = Optional.of("This is optional");
        Optional<String> stringOptionalOfNulable = Optional.ofNullable("This is optional of nullable");
        boolean present = empty.isPresent();
        System.out.println(present);
        System.out.println(stringOptional);
        System.out.println(stringOptionalOfNulable);

        // nếu optional là null of empty thì đoạn code bên trong fPresent() sẽ không được thực thi.
        Optional.ofNullable(null).ifPresent(s -> System.out.println("không được thực thi"));
        Optional.empty().ifPresent(s -> System.out.println("không được thực thi"));

        System.out.println("================================== 222 =================================================");
        // orElse() method cho phép chúng ra khởi tạo một giá trị mặc định wrapped object khi nó null.
        System.out.println(Optional.ofNullable(null).orElse("Đối tượng thay thế khi object null"));
        System.out.println(Optional.ofNullable("notnull").orElse(OptionalExplanation.getMyDefault()));
        // orElseGet() method hoạt động tương tự orElse() method khi optional null nhưng khi optional notnull thì khác
        System.out.println(Optional.ofNullable("notnullGet").orElseGet(OptionalExplanation::getMyDefault));
    }

    // Nếu dùng orElseGet() method khi optional notnull thì sẽ không thực hiện lời gọi đến getMyDefault() method
    public static String getMyDefault() {
        System.out.println("gọi phương thức getMyDefault()");
        return "Default Value";
    }

    public static String getMyDefault2() {
        System.out.println("Getting Default Value 2");
        Function<OptionalExplanation, String> getMyDefault3 = OptionalExplanation::getMyDefault3;
        System.out.println(getMyDefault3);
        return "Default Value 2";
    }

    public String getMyDefault3() {
        System.out.println("Getting Default Value 3");
        return "Default Value 3";
    }


}
