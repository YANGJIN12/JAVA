package namoo.java;

import java.util.Formatter;

/**
 * 출력형식 지정하여 출력하기
 * @author KimYangJin
 *
 */


public class FormatterExample {
	public static void main(String[] args) {
		int number = 12345678;
		System.out.println(number);
		Formatter formatter = new Formatter();
		formatter = formatter.format("%,+-20d", number);
		System.out.print(formatter);
		
		double num  = 12345.23156485431;
		System.out.printf("%,-20.2f",num);
	
		String name = "김양진";
		System.out.printf("%-10s",name);
		System.out.printf("%o입니다..",7);
		
		System.out.println(String.format("%,+20d", 343434));
	
	
	
	}
	
	

}
