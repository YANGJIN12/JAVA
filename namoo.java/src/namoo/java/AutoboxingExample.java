package namoo.java;

public class AutoboxingExample {
	public static void main(String[] args) {
//		Autoboxing
		Integer integer = 10;
		System.out.println(integer.doubleValue());
//		Unboxing
		int x = new Integer(100) + 50;
		System.out.println(x+100);
		
	}

}
