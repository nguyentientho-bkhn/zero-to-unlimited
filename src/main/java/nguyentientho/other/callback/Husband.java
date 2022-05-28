package nguyentientho.other.callback;

public class Husband {

    private void hireSpy(Spy spy) {
        spy.callToHusband();
    }

    private void goWorking() {}

    public static void main(String[] args) {
        Husband husband = new Husband();
        SherlockHomes slh = new SherlockHomes();
        husband.hireSpy(slh);
        husband.goWorking();
    }
}
