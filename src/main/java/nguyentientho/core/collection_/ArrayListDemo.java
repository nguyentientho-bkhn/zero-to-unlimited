package nguyentientho.core.collection_;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
//        findX();
        putAndShowArrayList();
    }

    private static void putAndShowArrayList() {
        List<Double> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.printf("nhập phần tử thứ %d: ", i + 1);
            Double dou = sc.nextDouble();
            list.add(dou);
        }

        System.out.println("List Double = " + list);

        try {
            for (Double itemD : list) {
                System.out.print("List itemD = " + itemD);
                System.out.printf("; ");
            }
        } catch (Exception e) {
            System.err.print(e.getMessage() + " ---> Cause: " + e.getCause());
        }
    }

    private static void findX() {
        List<String> list = new ArrayList();
        list.add("cường");
        list.add("Tuấn");
        list.add("Phương");
        list.add("Hồng");
        list.add("Hạnh");

        list.set(0, "Tèo");
        list.remove(3);
        list.remove("Phương");
        list.remove("Thọ");

        // giá trị của list.indexOf("Hồng") = -1 do hồng đã được xóa trước đó
        int x = list.size() - list.indexOf("Hồng");
        System.out.println("giá trị: " + x);
    }


}
