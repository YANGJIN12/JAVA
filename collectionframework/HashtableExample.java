package collectionframework;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableExample {

	public static void main(String[] args) {
		Hashtable<String, String> table = new Hashtable<String, String>();
		table.put("111", "김양진");
		table.put("222", "변준호");
		table.put("333", "오준화");
		table.put("444", "김양진");
		table.put("111", "최양진");
		System.out.println(table.get("111"));
		System.out.println(table.remove("444"));
		
		Enumeration<String> e = table.keys();
//		System.out.println(e);
		while(e.hasMoreElements()) {
			String string = e.nextElement();
			System.out.println(string);
		}
		
		Enumeration<String> en = table.elements();
		System.out.println(en);
		
		}
		
		
		

	}


