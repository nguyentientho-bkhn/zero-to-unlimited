package nguyentientho.core.string_;

public class TrimStringUtil {
    public static void main(String[] args) {
        actionTrimString("   Đây là 1 đoạn chữ  ");
    }

    public static void actionTrimString(String value) {
        if(value == null) return;
        int len = value.length();
        int start = 0;
        while(start < len) {
            char c = value.charAt(start);
            if(Character.isWhitespace(c) || Character.isSpaceChar(c)) {
                start++;
                break;
            }
        }

        while(len > start) {
            char c = value.charAt(len-1);
            if(Character.isWhitespace(c) || Character.isSpaceChar(c)) {
                len--;
                break;
            }
        }

//        return ((start > 0) || (len < value.length())) ? value.substring(start, len) : value;
        String resultTrimmedString = value.substring(start, len);
        System.out.println(resultTrimmedString);
    }
}
