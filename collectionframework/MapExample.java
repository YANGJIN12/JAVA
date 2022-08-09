package collectionframework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("111", "김양진");
		map.put("222", "변준호");
		map.put("333", "오준화");
		map.put("444", "김양진");
		map.put("111", "최양진");
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
		System.out.print(values);
		
		Set<Entry<String, String>> entries = map.entrySet();
		System.out.println(entries);
		}
		
		
		

	}


