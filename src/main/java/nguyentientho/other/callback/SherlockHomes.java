package nguyentientho.other.callback;

public class SherlockHomes implements Spy {
    @Override
    public void callToHusband() {
        Event event = new Event();
        if (event.goInHotel) {
            System.out.println("Hey Sir, My Wife go to hotel");
        }
    }
}
