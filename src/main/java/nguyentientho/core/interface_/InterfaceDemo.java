package nguyentientho.core.interface_;

public interface InterfaceDemo {
    /** [1] khi 1 lớp được đánh dấu là triển khai 1 giao diện nó or lớp con của nó phải thực thi tất cả các phương
     * thức của interface mà nó triển khai, nếu không định nghĩa chi tiết hết thì nó phải trở thành lớp abstract.
     * [2] các trường trong interface đều phải vừa là static & final, các method thì đều phải là method trìu tượng
     * và trong interface mọi thứ đều được hiểu ngầm định cũng như đều phải public phạm vi truy cập.
     * [3] giao diện chỉ có thể triển khai nhiều giao diện chứ không thể kế thừa abstrac class.
     */

    static final int bienSoTinh = 36;

    void start();

    void accelerate(int speed);

    void brake();

    void stop();
}
