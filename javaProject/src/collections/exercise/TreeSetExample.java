package collections.exercise;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		
//		Set<Student2> set = new HashSet<Student2>();
//		set.add(new Student2("blue",96));
//		set.add(new Student2("hong",86));
//		set.add(new Student2("white", 92));
//		
//		Iterator<Student2> iter = set.iterator();
//		while(iter.hasNext()) {
//			System.out.println(iter.next().toString());
//		}
		
		TreeSet<Student2> treeSet = new TreeSet<Student2>();
		treeSet.add(new Student2("blue",96));
		treeSet.add(new Student2("hong",86));
		treeSet.add(new Student2("white", 92));
		
		Student2 std2 = treeSet.last();
		System.out.println(std2.id + " " + std2.score);
		
	}
}
