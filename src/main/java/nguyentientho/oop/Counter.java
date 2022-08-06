package nguyentientho.oop;

public class Counter {
	private static int count = 0;
	
	public static void visit() {
		count++;
		System.out.println("Couter = " + count);

	}

	public static void main(String[] args) {
		Counter ob1 = new Counter();
		ob1.visit();
		Counter ob2 = new Counter();
		ob2.visit();
		Counter ob3 = new Counter();
		ob3.visit();
	}

}
