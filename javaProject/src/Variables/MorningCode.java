package Variables;

public class MorningCode {
	public static void main(String[] args) {
		
		int standard = 30;
		int myage = 21;
		
		if(myage > standard)
			System.out.println("나이가 좀 들었습니다");
		else if(myage == standard)
			System.out.println("적정한 나이네요");
		else
			System.out.println("한창이네요.");
	}
}
