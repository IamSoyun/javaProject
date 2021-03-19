package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Fruit{
	int price;
	
	Fruit(int price){
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		return price;
	}
	
	@Override
	public boolean equals(Object obj) {
		Fruit f = (Fruit) obj;
		return this.hashCode() == (obj.hashCode());
	}
}

public class HashSetExample {
	public static void main(String[] args) {

		Set<Fruit> fset = new HashSet<>();

		fset.add(new Fruit(1000));
		fset.add(new Fruit(2000));
		fset.add(new Fruit(3000));
	
		Iterator<Fruit> fIter = fset.iterator();
		
		while(fIter.hasNext()) {
			System.out.println(fIter.next().price);			
		}

	}
}
