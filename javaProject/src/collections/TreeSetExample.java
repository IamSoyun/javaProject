package collections;

import java.io.Serializable;
import java.util.Iterator;
import java.util.TreeSet;

//class Integer implements Serializable, Comparable<Integer>{
//	
//	@Override
//	public int compareTo(Integer o) {
//		return 0; // -1 this < o, 0 this == o
//	}
//	
//}

class Person implements Comparable<Person>{
	int age;

	@Override
	public int compareTo(Person o) {
		return 0;
	}
	
}

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));
		
		Iterator<Integer> iter = scores.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
