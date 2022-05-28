package nguyentientho.core.try_with_resource_;

public class UseCustomResourceCloseTWR {
    public static void main(String[] args) {
        try (CustomResourceAutoClosable cac = new CustomResourceAutoClosable()) {
            cac.yourApplication();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
