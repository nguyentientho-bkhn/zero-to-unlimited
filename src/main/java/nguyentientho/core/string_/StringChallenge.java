package nguyentientho.core.string_;

//import java.sql.Date;


public class StringChallenge {
    public static void main(String[] args) {
        String str = "acdcda";
        countAnagramSubstring(str);
    }

    private static int countAnagramSubstring(String inputStr) {
        int counter = 0;
        for (int i = 0; i < inputStr.length(); i++) {
            for (int j = i + 1; j < inputStr.length(); j++) {
                System.out.println(inputStr.substring(i,j));
                counter++;
            }
        }
        System.out.println(counter);
        return counter;
    }
}
