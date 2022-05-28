package nguyentientho.java_8.lambda_expression;

public class LambdaExpression3 {
    static int outerStaticNum;
    int outerNum;
    interface Converter<F, T> {
        T convert (F from);
    }

    public void testScope() {
        Converter<Integer, String> stringConverter = from -> {
            outerStaticNum = 1;
            return String.valueOf(from);
        };
        Converter<Integer, String> stringConverter2 = from -> {
            outerNum = 1;
            return String.valueOf(from);
        };
    }

    public static void main(String[] args) {
        doThing1();
        doThing2();
        dothing3();
    }

    public static void doThing1 () {
        final int num = 1;
       Converter<Integer, String> integerStringConverter = (Integer from) -> String.valueOf(from + num);
        System.out.println("Tong = " + integerStringConverter.convert(2));
    }

    public static void doThing2() {
        int num2 = 2;
        Converter<Integer, String> integerStringConverter2 = from -> String.valueOf(from * num2);
        String result = integerStringConverter2.convert(3);
        System.out.println("Tich 2 so = " + result);
    }

    public static void dothing3() {
        int num3 = 3;
        Converter<Integer, String> integerStringConverter3 = (from) -> String.valueOf(from / num3);
        String result3 = integerStringConverter3.convert(30);
        System.out.println("Thuong 2 so = " + result3);
    }
}
