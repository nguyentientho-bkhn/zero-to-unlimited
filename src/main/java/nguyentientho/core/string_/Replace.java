package nguyentientho.core.string_;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // sout prinln in 1 chuỗi sau đó xuống dòng
        System.out.println("nhập nội dung 1 chuỗi: ");
        String content = scanner.nextLine();

        // Scanner.nextline sẽ đọc nội dung đến khi xuống dòng mới(enter or \n trong chuỗi) thì dừng
        System.out.println("nhập nội dung cần tìm: ");
        String find = scanner.nextLine();

        // Scanner.next sẽ đọc nội dung nhập vào đến khi có dấu cách thì dừng
        System.out.println("nhập nội dung cần thay thế: ");
        String replace = scanner.next();

        // sout print in ra 1 chuỗi nhưng không xuống dòng
        String result = content.replace(find, replace);
        System.out.print("nội dung chuỗi kết quả: " + result);

    }
}
