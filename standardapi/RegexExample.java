package namoo.standardapi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
	
/**
 * 자바에서 정규표현식 사용하기	
 * @param args
 */
	
	
	
	
	public static void main(String[] args) {
		String message = "Java JavaScript";
		String regex = "java*";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(message);
		boolean match = matcher.matches();
		System.out.println(match);
//		System.out.println(matcher.find()); 
		while(matcher.find()) {
			String text = matcher.group();
			System.out.println(text);
			
			
			
		}
		System.out.println(Pattern.matches("Java*", "Jav"));
		
		String message2 = "Java";
		System.out.println(message2.matches("Java*"));
		
		String message3 = "Java JavaScript";
		System.out.println(message3.replaceAll("Java", "자바"));
		
		String message4 = "Java. JavaScript. HTML. CSS";
		String[] tokens = message4.split("\\.\\s");
		for(String string : tokens) {
			System.out.println(string);
		}
	
	
	
	}	

}
