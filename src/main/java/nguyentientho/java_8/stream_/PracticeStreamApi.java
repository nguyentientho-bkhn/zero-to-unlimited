package nguyentientho.java_8.stream_;

import java.util.Arrays;
import java.util.List;

public class PracticeStreamApi {
    public static void main(String[] args) {
        withoutStream();
        withStream();
    }

    private static void withoutStream() {
        List<Integer> list = Arrays.asList(5, 7, 2, 6, 10, 8);
        for (Integer iter : list) {
            if (iter % 2 == 0) System.out.printf("số = %d là số chẵn", iter);
            else System.out.printf("số = %d là số lẻ", iter);
        }
    }

    private static void withStream() {
        List<Integer> list = Arrays.asList(5, 7, 2, 6, 10, 8);
        long count = list.stream().filter(num -> num % 2 == 0).count();
        System.out.printf("there are %d elements of list");
    }



}
