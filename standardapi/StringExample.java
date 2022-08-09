package namoo.standardapi;

public class StringExample {
	public static void main(String[] args) {
		String name1 = "김양진";
		String name2 = "김양진";
		System.out.println(name1 == name2);
		System.out.println(name1.equals(name2));
		
		String name3 = new String("java");
		String name4 = new String("java");
		System.out.println(name3 == name4);
		System.out.println(name3.equals(name4));
		
		
//		주요메소드
		String lecture = "java HTML CSS JavaScript SQL";
		System.out.println(lecture.substring(5,8));
		System.out.println(lecture.length());
		
		System.out.println(lecture.concat("ABC").concat("김양진").concat("입니다."));
		
		System.out.println(lecture.replace("java","자바"));
		
		
		String ssn = "010227-3035712";
		char c = ssn.charAt(ssn.indexOf('-')+1);
		switch (c) {
		case '1' : System.out.println("어른 남자"); break;
		case '2' : System.out.println("어른 여자"); break;
		case '3' : System.out.println("어린 남자"); break;
		case '4' : System.out.println("어린 여자"); break;
		default : System.out.println("Foreigner"); break;
		}
	
	
		String message = "abc                                       ";
		System.out.println(message.trim());
		
		int number = 12345;
		System.out.println(String.valueOf(number).length());
		
	
		
		StringBuilder sb = new StringBuilder("Java");
		System.out.println(sb.append(true).append(10).append("여기가 마지막"));
		System.out.println(sb.reverse());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
