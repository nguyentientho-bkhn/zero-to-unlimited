package nguyentientho.core.recursive_;

import java.util.Locale;

public class YoungBrotherTurtle {
    public static void main(String[] args) {
//        countDown(5);
//        newLine(6);
//        welcome();
//        System.out.println(factorial(2));
        System.out.println(fibonacci(3));
    }

    private static void countDown(int n) {
        if (n <= 0) System.out.println("bum bum");
        else {
            System.out.println(n);
            countDown(n - 1);
        }
    }

    private static void newLine(int n) {
        if (n <= 0) System.out.println("finisher");
        else {
            System.out.println(String.format(Locale.ENGLISH, "-%s-", n));
            newLine(n - 1);
        }
    }

    // hàm đệ quy vô tận đến 1 lúc nào đó sẽ dừng và ném ra exception StackOverFlow
    private static void welcome() {
        System.out.println("Xin chào!");
        welcome();
    }

    /** Một hàm đệ quy sẽ gồm 2 phần:
     * void recursion() {
     *     if (condition) {
     *         // Điều kiện thoát khỏi đệ quy
     *     }
     *     recursion(); // Gọi đệ quy
     * }
     *
     * Luồng đi:
     *          step1:factorial(2) ___ đầu tiên đối số = 2 ko vào th suy biến nên nhảy vào else
     *            step2:factorial(1) ___ sau lúc này khi đã gọi đệ quy 1 lần đối số = 1 nên sẽ vào suy biến if(f == 1)
     *                step3:return 1 ___ sau khi vào th suy biến kết quả sẽ trả về = 1
     *            step4:return 2*1 = 2 ___ sau đó lại gọi factorial(2) được ghi nhớ lúc trước do hàm đối số = 2 ko vào suy biến nhưng phải
     *                                     thực hiện factorial(1) = 1 trước bây giờ mới được gọi lại để thực hiện. Lúc này
     *                                     f=2 do đó factorial(2-1) = 1 tương đương factorial(1) = 1 đã thực hiện ở trên
     *                                     nên recurse = 1, và return = (2 * 1) = 2 do hiện tại f = 2;
     */
    private static int factorial(int f) {
        if (f == 1) {
            return 1;
        } else {
            int recurse = factorial(f-1);
            return (f * recurse);
        }
    }

    /** Luồng đi:
     *           fibonacci(3) ___ đối số = 3 nên vào else
     *              fibonacci(2) ___ sau khi vào else với đối số = 2 sẽ vào if
     *                 |- return 1 ___ sau khi vào if kết quả = 1 lúc này fibonacci(2) = 1 do đó fibo1st = 1
     *                 |- fibonacci(3-2) ___ lúc này f=3 lại gọi fibonacci(1) để thực hiện tiếp do lúc nãy chưa thực hiện xong
     *                 |- return 1 ___ lại vào if và kết quả = 1 lúc này fibonacci(2) = 1
     *              return 2 ___ lúc này trả lại kết quả cuối cùng của fibonacci(f-1) + fibonacci(f-2)
     */
    // Tìm số hàng thứ n của dãy fibonacci
    private static int fibonacci(int f) {
        if (f == 1 || f == 2) {
            return 1;
        } else {
            int fibo1st = fibonacci(f-1);
            int fibo2nd = fibonacci(f-2);
            return fibo1st + fibo2nd;
        }
    }
}
