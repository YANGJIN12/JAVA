package collectionframework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class LinkedMapExample {

	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<String, String>();
		map.put("111", "김양진");
		map.put("333", "오준화");
		map.put("444", "김양진");
		map.put("111", "최양진");
		map.put("222", "변준호");
		System.out.println(map.get("111"));
		System.out.println(map.remove("444"));
		
		Set<String> keys = map.keySet();
		System.out.println(keys);
//		Iterator<String> iterator = keys.iterator();
//		while(iterator.hasNext()) {
//			
//			String key = iterator.next();
//			System.out.println(key);
		Collection<String> values = map.values();
		System.out.println(values);
		
		Set<Entry<String, String>> entries = map.entrySet();
		System.out.println(entries);
		}
		
		
		

	}


