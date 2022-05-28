package nguyentientho.core.pass_by_value;

/**
 * Tại sao nói trong JAVA chỉ có truyền tham trị?
 */
public class CreateData {
    int x = 50;

    /**
     * Khi 1 giá trị được truyền vào 1 hàm làm đối số:
     * - Nó sẽ được tạo 1 bản sao ixCopy = value có giá trị bằng với đối số truyền vào
     * - Biến ixCopy này được lưu trong STACK và sẽ bị xóa khi hàm kết thúc
     */
    public static void changeData(int ix, int iy) {
        int ixchange = ix + 100;
        // vậy nếu muốn truyền 1 đối tượng làm tham số mà ko thay đổi giá trị trong đối tượng đó thì tạo 1 object mới
        int iyChange = iy;
        iyChange = iyChange + 200;
        System.out.println("biến thay đổi chỉ trong method = " + ixchange + "--" + iyChange);
    }

    public static void main (String[] args) {
        /**
         * Khi 1 object được tạo nó sẽ được lưu trong HEAP và biến tham chiếu của nó createData sẽ được lưu trong STACK
         * và biến createData này sẽ chứa địa chỉ ô nhớ của đối tượng được lưu trong HEAP
         * Vì vậy khi 1 hàm được gọi truyền giá trị vào chính là truyền địa chỉ ô nhớ của đối tượng trong HEAP
         */
        CreateData createData = new CreateData();
        System.out.println("Đối tượng TRƯỚC khi gọi hàm changeData " + createData.x + "-" + createData);
        changeData(createData.x, createData.x);
        System.out.println("Đối tượng SAU khi gọi hàm changeData " + createData.x + "-" + createData);
    }
}
