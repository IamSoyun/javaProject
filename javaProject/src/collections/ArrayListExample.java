package collections;

import java.util.List;
import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		
		String[] strAry = new String[10];
		strAry[0] = "Hello";
		strAry[1] = "World";
		strAry[4] = "Nice";
		
		for(int i = 0 ; i < strAry.length ; i++ ) {
			if(strAry[i] != null)
				System.out.println(strAry[i] + " ");
		}
		
		List<String> strList = new ArrayList<>();
		strList.add("Hello");
		strList.add("Nice");
//		strList.add(100);
		
		for (Object obj : strList) {
			String str = (String) obj;
			System.out.println(obj);
		}
		
		
	}

}
