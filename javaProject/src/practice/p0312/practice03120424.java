package practice.p0312;

import java.util.ArrayList;
import java.util.List;

public class practice03120424 {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0 ; i < 10 ; i ++ ) {
			list.add((int)(Math.random()*100)+1);
		}
		
		for(int i : list)
			System.out.print(i + " ");
		
		System.out.println();
		
		int temp;
		
		for(int i = 0 ; i < list.size()-1 ; i++ ) {
			for(int j = 0 ; j < list.size() - 1 - i ; j++) {
				if(list.get(j) < list.get(j+1)) {
					temp = list.get(j);
					list.set(j, list.get(j+1)); 
					list.set(j+1, temp);
				}
			}
			
		}
		
		for(int i : list)
			System.out.print(i + " ");
		
	}
	
	public void sortArray(List list) {
		
	}
}
