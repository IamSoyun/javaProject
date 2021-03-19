package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("홍길동", 15);
		map.put("김민수", 20);
		map.put("박소연", 23);
		
		Set<String> set = map.keySet();
		for(String key : set) {
			System.out.println(map.get(key));
		}
		
//		int result = map.get("홍길동");
//		Set<String> set = map.keySet();
//		Iterator<String> iter = set.iterator();
//		while(iter.hasNext()) {
//			String key = iter.next();
//			int val = map.get(key);
//			System.out.print(val+" ");
//		}
		
		
	}
}
