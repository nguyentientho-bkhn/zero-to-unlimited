package nguyentientho.core;

public class YoungBrotherTurtle {
    public static void main(String[] args) {
//        deQuyMethod(2);
        BaseClass aClass = new ChildClass();
        aClass.doSomething("override");
    }

    private static void deQuyMethod(int n) {
        if (n == 0) {
            System.out.println("Bum Bum Bum");
        } else {
            System.out.println(n);
            deQuyMethod(n-1);
        }
    }

    public static class BaseClass {
        public void doSomething(String str){
            System.out.println("Base impl:"+str);
        }
    }

    public static class ChildClass extends BaseClass{
        @Override
        public void doSomething(String str){
            System.out.println("Child impl:"+str);
        }
    }

}
