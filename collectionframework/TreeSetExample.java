package collectionframework;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
	
	public static void main(String[] args) {
		Set set = new TreeSet<String>();
		set.add(10);
		set.add(35.6);
		set.add("Java");
		set.add("JavaScript");
		set.add("HTML");
		set.add("Java");
		
		
		System.out.println(set.size());
		
		Iterator iter =  set.iterator();
		
		while (iter.hasNext()) {
//		System.out.println(iter.next());
		Object obj = iter.next();
		if(obj.equals("Java")) {
			iter.remove();
		}
		
			
		} 
		
		System.out.println(set.contains("Java"));
		System.out.println(set.contains("ava"));
		System.out.println(set.remove("Java"));
		System.out.println(set.size());
//		set.clear();
	
	
	
	}

}
