package collectionframework;


import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class LinkedListExample {
	
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Java");
		list.add("JavaScript");
		list.add("HTML");
		list.add("Java");
// 		insert 기능		
		list.add("C");
//		update 기능
		((ListIterator<String>) list).set("C++");
//		delete 기능
		list.remove(0);
		List<String> sublist = ((List<String>) list).subList(1,3);
		Iterator<String> iter = sublist.iterator();
		while(iter.hasNext()) {
			String text = iter.next();
			System.out.println(text);
			
		}
		
		ListIterator<String> lt = (ListIterator<String>) list.iterator();
		while(iter.hasNext()) {
			System.out.println(lt.next());
			String string = ((ListIterator<String>) iter).previous();
			
		}
		
		
		System.out.println(list.size());
		
		
		Iterator<String> lter =  list.iterator();
		while (lter.hasNext()) {
			String text = lter.next();
		}
		
		
		System.out.println(list.contains("Java"));
		System.out.println(list.contains("ava"));
		System.out.println(list.remove("Java"));
		System.out.println(list.size());
//		set.clear();
			
		} 
}

