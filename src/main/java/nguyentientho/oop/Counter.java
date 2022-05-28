package nguyentientho.oop;

public class Counter {
	static int count = 0;
	
	public void visit() {
		count++;
		this.print();
	}

	public void print() {
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
