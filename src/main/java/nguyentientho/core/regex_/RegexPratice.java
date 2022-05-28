package nguyentientho.core.regex_;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPratice {

    private static final String SLASH = "|";

    public static void main(String[] args) {
//        checkWordAndNumber();
        checkDate();
    }

    public static void checkWordAndNumber() {
        String[] words = new String[]{"", "1602", "1998", "NMD98", "1998d", "nmdse"};

        for (String word : words) {
            System.out.println("String " + word + " có chứa ký tự chữ cái " + word.matches(".*[a-zA-Z].*"));
        }
    }

    public static void checkDate() {
        final String REGEX_1 = "\\d{2}[-/_]\\d{2}[-/_]\\d{4}";
        String strInput = "Regex 15-05-2020, Nguyen Minh Duc 16/02/1998. Deadline 18_02_2020";
        // Biên dịch 1 Regex hay 1 chuỗi sang 1 đối tượng parttern
        Pattern patternDate = Pattern.compile(REGEX_1);
        // Sử dụng đối tượng parttern để so sánh với chuỗi đã cho strInput
        Matcher matcherDate = patternDate.matcher(strInput);
        // hoặc có thể trả về boolean kiểm tra chuỗi có khớp với Regex hay ko từ 1 matcherDate
        // nhưng method này yêu cầu regex phải khớp vs toàn bộ str chứ ko phải chỉ cần khớp với chuỗi con
        boolean b1 = matcherDate.matches();
        System.out.println("So sánh toàn bộ chuỗi phải khớp hoàn toàn với Regex = " + b1);

        System.out.println("Ngày tháng năm trong chuỗi input " + strInput + " là: ");
        while (matcherDate.find()) {
            System.out.println("start = " + matcherDate.start() + " and end = " + matcherDate.end());
            System.out.println(strInput.substring(matcherDate.start(), matcherDate.end()));
        }
        System.out.println("========================================================");

        final String REGEX_2 = "^\\d{2}[-/_]\\d{2}[-/_]\\d{4}$";
        String strInput2 = "15/05/2020";
        String strInput3 = "16/02/mdse";
        Pattern patternDate2 = Pattern.compile(REGEX_2);
        Matcher matcherDate2 = patternDate2.matcher(strInput2);
        boolean b2 = matcherDate2.matches();
        Matcher matcherDate3 = patternDate2.matcher(strInput3);
        boolean b3 = matcherDate3.matches();

        System.out.println("chuỗi " + strInput2 + " có đúng định dạng format ko = " + b2);
        System.out.println("chuỗi " + strInput3 + " có đúng định dạng format ko = " + b3);

    }
}
