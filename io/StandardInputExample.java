package namoo.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 표준입력
 * @author KimYangJin
 *
 */

public class StandardInputExample {
	public static void main(String[] args) throws IOException {
//		System.out.println(System.in);
//		System.out.print("이름을 입력하여 주세요.");
//		int data = System.in.read();
//		System.out.println(data);
//		byte[] buffer = new byte[100];
//		int count = System.in.read(buffer);
//		System.out.println(count);
//		문자 디코딩
//		String name = new String(buffer,0,count-2);
//		System.out.println(name);
		
//		InputStreamReader isr = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String name = br.readLine();
//		System.out.println(name);
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름: ");
		String name = scanner.next();
		System.out.print("나이: ");
		int age = scanner.nextInt();
		System.out.print("몸무게: ");
		double weight = scanner.nextDouble();
		System.out.println(name);
		System.out.println(age);
		System.out.println(weight);
		
	}

}
