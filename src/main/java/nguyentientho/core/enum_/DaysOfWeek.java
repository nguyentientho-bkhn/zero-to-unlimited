package nguyentientho.core.enum_;

public enum DaysOfWeek {
    THU_HAI("MONDAY"), THU_BA("TUESDAY"), THU_TU("WEDNESDAY"),
    THU_NAM("THURSDAY"), THU_SAU("FRIDAY"), THU_BAY("SATURDAY"), CHU_NHAT("SUNDAY");

    private String day;

    DaysOfWeek(String str) {
        this.day = str;
    }
}
