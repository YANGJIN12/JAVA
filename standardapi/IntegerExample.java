package namoo.standardapi;

public class IntegerExample {
	public static void main(String[] args) {
		String age = "10";
		int num = Integer.parseInt(age);
		System.out.println(num + 10 + 20);
		System.out.println(Integer.toBinaryString(num));
		System.out.println(Integer.toHexString(num));
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.max(10,20));
		
		
		
	}

}
