package nguyentientho.core.enum_;

public enum EnumWithoutClass {
    THU_HAI("MONDAY"), THU_BA("TUESDAY"), THU_TU("WEDNESDAY"),
    THU_NAM("THURSDAY"), THU_SAU("FRIDAY"), THU_BAY("SATURDAY"), CHU_NHAT("SUNDAY");

    @SuppressWarnings("unused")
	private static String day;

    EnumWithoutClass(String monday) {
    	
    }

    public static String checkNull(String input) {
        switch (input) {
            case "MONDAY":
                System.out.println("thá»© 2");
                return "ok";
            case "TUESDAY":
                System.out.println("thá»© 3");
                return "ok";
        }
        return nullAble();
    }

    private static String nullAble() {
        return "UNKNOWN";
    }

    public static void main(String[] args) {
        checkNull(null);
    }
}
