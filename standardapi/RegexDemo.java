package namoo.standardapi;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
//	임의의 한 문자(.)
	public static void example1() {
		String message = "Java, HTML, CSS, JavaScript, SQL";
		String pattern = "a.a";
		Matcher matcher = Pattern.compile(pattern).matcher(message);
		System.out.println(matcher.find());
	}
	
//	 수량 관련 메타문자(?, *, +)	
	public static void example2() {
		String message = "I love griy, gray, grey color gry graay graaaay";
		String pattern = "gra*y";
//		String pattern = "gra+y";
		Matcher matcher = Pattern.compile(pattern).matcher(message);
//		System.out.println(matcher.find());
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
	
//	 OR 메타문자(|)
	public static void example3() {
		String message = "Hi there, Nice to meet you. And Hello there and hi.";
		String pattern = "Hi|Hello";
		Matcher matcher = Pattern.compile(pattern).matcher(message);
		System.out.println(matcher.find());
	}
	
//	 경계 관련 메타문자( ^, $)
	public static void example4() {
		String message = "JavaScript, HTML, CSS, JavaScript, Java\n" +
	                     "자바Script, HTML, CSS, JavaScript, Java.";
		String pattern = "^자바";
		Matcher matcher = Pattern.compile(pattern).matcher(message);
//		Matcher matcher = Pattern.compile(pattern, Pattern.MULTILINE).matcher(message);
		System.out.println(matcher.find());
	}
	
//	 그룹 메타문자('()')
	public static void example5() {
		String message = "HelloHelloHello";
		String pattern = "(Hello){3}";
		Matcher matcher = Pattern.compile(pattern).matcher(message);
		System.out.println(matcher.find());
	}
	
	public static void example6() {
		String message = "I love griy, gray, grey color";
		String pattern = "gr(i|a|e)y";
		Matcher matcher = Pattern.compile(pattern).matcher(message);
		System.out.println(matcher.find());
	}
	
//	 '[]' 문자클래스
	public static void example7() {
		String message = "I love griy, gray, grey color";
		String pattern = "[ae]";
//		String pattern = "gr[ae]y";
		Matcher matcher = Pattern.compile(pattern).matcher(message);
		System.out.println(matcher.find());
	}
	
	public static void example8() {
		String message = "I love griy, gray, grey color";
		String pattern = "[a-zA-Z0-9]";
//		String pattern = "[^a-zA-Z0-9]"; //부정
		Matcher matcher = Pattern.compile(pattern).matcher(message);
//		System.out.println(matcher.find());
		while (matcher.find()) {
			String ch = matcher.group();
			System.out.println(ch);
		}
	}
	
//	 축약 문자 클래스(\w, \W, \d, \D, \s, \S)
	public static void example9() {
		String message = "I love griy, gray, grey color";
		String pattern = "\\w";
//		String pattern = "\\s";
//		String pattern = "\\S";
		Matcher matcher = Pattern.compile(pattern).matcher(message);
		System.out.println(matcher.find());
	}
	
//	 축약 경계 문자클래스(\b, \B)
	public static void example10() {
		String message = "Ya ya YaYaYa Ya";
		String pattern = "Ya";
//		String pattern = "\\bYa"; // 단어앞에서 쓰이는 Ya만 선택(Ya Ya Ya)
//		String pattern = "Ya\\b"; // 단어뒤에서 쓰이는 Ya만 선택(Ya Ya Ya)
//		String pattern = "Ya\\B"; // 단어뒤에서 쓰이지 않는 Ya만 선택(Ya Ya)
		Matcher matcher = Pattern.compile(pattern).matcher(message);
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}

//		전화번호 패턴
	public static void example11() {
		String telephones = "02-777-88888 "
				          + "02-7777-88888 "
				          + "02-77-88888 "
				          + "010 333 4444 "
				          + "010.3333.4444 "
				          + "010.3333.444 "
				          + "010-1234-5678";
		
		String pattern = "\\d{2,3}[- .]\\d{3,4}[- .]\\d{4}";
		Matcher matcher = Pattern.compile(pattern).matcher(telephones);
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}
	
//	이메일 패턴
	public static void example12() {
		String Emails = "bangry313@gmail.com "
				          + "bangry@daum.net "
				          + "bangry313@some.co.kr "
				          + "bangry-313@some.co.kr "
				          + "bangry@some "
				          + "bangry+313@some.co.kr "
				          + "namoo.bangry@some.co.kr ";
		String pattern = "[a-zA-Z0-9._+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9.]+";
		Matcher matcher = Pattern.compile(pattern).matcher(Emails);
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}
	
//	URL 패턴
	public static void example13() {
		String URSs = "https://www.naver.com "
				          + "https://en.wikipedia.org/wiki/Regular_expression "
				          + "https://developer.mozilla.org/ko/docs/Web/JavaScript/Guide/Regular_Expressions "
				          + "https://jsbin.com/?html,output "
				          + "https://codepen.io/ "
				          + "https://korea/ "
				          + "https://www.youtu.be/-ZClicWm0zM";
		String pattern = "https?:\\/\\/(www\\.)?[-a-zA-Z0-9@:%._\\+~#=]{1,256}\\.[a-zA-Z0-9()]{1,6}\\b([-a-zA-Z0-9()@:%_\\+.~#?&//=]*)";
		Matcher matcher = Pattern.compile(pattern).matcher(URSs);
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}
		
	
	public static void main(String[] args) {
//		example1();
//		example2();
//		example3();
//		example4();
//		example5();
//		example6();
//		example7();
//		example8();
//		example9();
//		example10();
//		example11();
//		example12();
		example13();
	}

}
