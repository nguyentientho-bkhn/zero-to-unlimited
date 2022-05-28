package nguyentientho.java_8.lambda_expression;

import java.util.Arrays;
import java.util.List;

interface Sayable1 {
    public String say();
}

interface Sayable2 {
    public String say(String name);

    boolean equals (Object obj);
}

interface Addable {
    int add(int a, int b);
}

public class LambdaExpression_1 {
    public static void main(String[] args) {
//        lambdaNonePara();
//        lambdaOnePara();
//        lambdaTwoPara();
//        lambdaWithFor();
        lambdaWithThread();
    }

    protected static void lambdaNonePara() {
        Sayable1 s = () -> { return "I have nothing"; };
        Sayable1 s2 = () -> "I have nothing to say,";
        System.out.println(s.say());
    }

    protected static void lambdaOnePara() {
        Sayable2 s = name -> "Hello " + name;
        System.out.println(s.say("VNDIRECT"));
    }

    protected static void lambdaTwoPara() {
        Addable addable = (a, b) -> {
            return a + b;
        };
        System.out.println("Tổng 2 số = " + addable.add(10, 20));

        Addable add2 = (int a, int b) -> a + b;
        System.out.println("Tong 2 so = " + add2.add(20 , 30));

        Addable add3 = (a, b) -> a + b ;
        System.out.println("Tong = " + add3.add(30, 30));
    }

    protected static void lambdaWithFor() {
        List<String> language = Arrays.asList("C++", "C#", "Java", "Js", "Python");
        language.forEach(implement -> System.out.println(implement));
    }

    protected static void lambdaWithThread() {
        // su dung lop an danh
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Start run Thread-1");
            }
        };
        r1.run();

        // su dung lambda
        Runnable r2 = () -> System.out.println("Start run thread-2");
        r2.run();

    }

}
