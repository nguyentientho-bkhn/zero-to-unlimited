package nguyentientho.oop;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Counter {
	private static int count = 0;
	
	public static void visit() {
		count++;
		System.out.println("Couter = " + count);

	}

	public static void main(String[] args) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		Date date = new Date();
		System.out.println(simpleDateFormat.format(date));
		System.out.println(new Date(System.currentTimeMillis()));
	}

}
