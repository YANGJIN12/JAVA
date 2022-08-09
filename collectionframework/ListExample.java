package collectionframework;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListExample {
	
	public static void main(String[] args) {
		List<String> set = new ArrayList<String>();
		set.add("Java");
		set.add("JavaScript");
		set.add("HTML");
		set.add("Java");
		System.out.println(set.size());
		
		
		
		Iterator<String> iter =  set.iterator();
		while (iter.hasNext()) {
			String text = iter.next();
		}
		
		
		System.out.println(set.contains("Java"));
		System.out.println(set.contains("ava"));
		System.out.println(set.remove("Java"));
		System.out.println(set.size());
//		set.clear();
			
		} 
}

