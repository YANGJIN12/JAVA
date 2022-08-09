package namoo.standardapi;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String ymd = "2022-03-13";
		StringTokenizer st = new StringTokenizer(ymd,"-");
		System.out.println(st.countTokens());
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		
		
	}

}
