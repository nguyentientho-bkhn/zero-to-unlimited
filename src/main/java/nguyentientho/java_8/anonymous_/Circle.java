package nguyentientho.java_8.anonymous_;

// Nếu không viết anonymous class thì phải triển khai chi tiết đối tượng ntn
public class Circle implements Shape{
    private final String ten;
    private float radius;

    public Circle(int radius) {
        this.ten = "circle";
        this.radius = radius;
    }

    @Override
    public void addRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public float tChuvi() {
        return 2*PI*radius;
    }

    @Override
    public float tDienTich() {
        return PI*radius*radius;
    }

    @Override
    public void showResult() {
        System.out.printf("ten: %s, chuvi: %f, dientich: %f", ten, tChuvi(), tDienTich());
    }

    // Sau đó mới sử dụng đối tượng Circle để tgọi các phương thức tính toán
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        circle.showResult();
    }
}
