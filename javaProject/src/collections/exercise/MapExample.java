package collections.exercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class MapExample {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<Entry<String, Integer>> set = map.entrySet();
		Iterator<Entry<String, Integer>> iter = set.iterator();
		
		while(iter.hasNext()) {
			String id = iter.next().getKey();
			int score = map.get(id);
			if(score > maxScore) {
				maxScore = score;
				name = id;
			}
			totalScore += score;
		}
		
		System.out.println("최고점수: " + map.get(name));
		System.out.println("평균점수: " + totalScore / set.size());
		System.out.println("최고점수 받은 아이디: " + name);
		
		String str;
		System.out.println("b".compareTo("a"));
		TreeSet<String> tSet = new TreeSet<>();
		
	}

}
