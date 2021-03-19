package Control;

public class ContinueExample {

	public static void main(String[] args) {
		for(int i = 1 ; i <= 10 ; i++) {
			if(i%2==1)
				continue;	// 만나면 반복문 다시실행(위로감)
			System.out.println(i);
		}
		
	}
}
