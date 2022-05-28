package nguyentientho.core.string_;

import java.util.*;


/**
 * cú pháp của printf:
 * System.out.printf(local, format, arguments1, arguments2,…, argumentsn);
 * Trong đó:- local sẽ khác null và được tự động định dạng
 *          - quy định chuẩn định dạng sẽ in ra với đối số truyền vào
 *          - argument123 sẽ là các đối số truyền vào
 * 1 số định dạng có sẵn trong printf:
 *      %c: Ký tự
 *      %d: Số thập phân (số nguyên) (cơ số 10)
 *      %e: Dấu phẩy động theo cấp số nhân
 *      %f: Dấu phẩy động
 *      %i: Số nguyên (cơ sở 10)
 *      %o: Số bát phân (cơ sở 8)
 *      %s: Chuỗi
 *      %u: Số thập phân (số nguyên) không dấu
 *      %x: Số trong hệ thập lục phân (cơ sở 16)
 *      %t: Định dạng ngày / giờ
 *      %%: Dấu phần trăm
 *      \%: Dấu phần trăm
 * **/
public class Sort {
    public static void main(String[] args) {
//        shuffleArrLisst();

        Date date = new Date();
        System.out.printf("Ngày giờ hiện tại là %t", date);

        String s = "học lập trình mà không buồn ngủ";
        System.out.printf("IN HOA ---> %S", s);

        int i = 100;
        double v = 6.88888;
        System.out.printf("số nguyên: %i \t Số thập phân: %d",i,v);
    }

    private static void shuffleArrLisst() {
        List<String> ds = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.printf("nhập ký tự thứ %d: ", i+1);
            String c = sc.nextLine();
            ds.add(c);
        }

        Collections.shuffle(ds);

        System.out.println("giá trị các phần tử: ");
        for (String item : ds) {
            System.out.printf(" %s", item);
        }
    }
}
