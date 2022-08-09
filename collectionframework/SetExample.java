package collectionframework;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
	
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(10);
		set.add(35.6);
		set.add("Java");
		set.add("JavaScript");
		set.add("HTML");
		set.add(Calendar.getInstance());
		set.add("Java");
		
		Set set2 = new HashSet();
		set2.add("adasdaw");
		set2.add("dadawdawd");
		set2.add("dadawdawd");
		set.addAll(set2);
		
		
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
