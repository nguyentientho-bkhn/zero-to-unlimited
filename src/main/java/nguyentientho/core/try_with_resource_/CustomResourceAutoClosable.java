package nguyentientho.core.try_with_resource_;

public class CustomResourceAutoClosable implements AutoCloseable {

    public void yourApplication() {
        System.out.println("Running... application method");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Auto Closable Complete");
    }
}
