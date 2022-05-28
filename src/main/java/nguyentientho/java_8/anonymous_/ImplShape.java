package nguyentientho.java_8.anonymous_;

public class ImplShape {
    public static void main(String[] args) {
        createAnomymousShape();
    }


    public static void createAnomymousShape() {
        Shape shape = new Shape() {
            protected float radius;

            @Override
            public void addRadius(float radius) {
                this.radius = radius;
            }

            @Override
            public float tChuvi() {
                return 2 * PI * radius;
            }

            @Override
            public float tDienTich() {
                return PI * radius * radius;
            }

            @Override
            public void showResult() {
                System.out.printf("ten: %s, cv: %f, dt: %f", "anonymous shape", tChuvi(), tDienTich());
            }
        };
        shape.addRadius(10);
        shape.showResult();
    }
}
