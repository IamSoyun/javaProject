package practice.p0308;

public class MemberExample {
	public static void main(String[] args) {
		
		Member original = new Member("blue","홍길동","12345", 25, true);
		
		Member cloned = original.getMember();
		cloned.password = "67890";
		
		Member copy1 = original.getMember();
		copy1.password = "67890";				
		
		System.out.print("복제 ");
		System.out.println(cloned.toString());
		
		System.out.print("원본 ");
		System.out.println(original.toString());
		
		System.out.println("-------------------------------");
		
		Member2 original2 = new Member2("홍길동", 25, new int[] {90,90}, new Car("소나타"));
		
		Member2 cloned2 = original2.getMember2(); 
		cloned2.scores[0] = 100;
		cloned2.car.model = "그랜저";
		
		System.out.print("복제 ");
		System.out.println(cloned2.toString());
		
		System.out.print("원본 ");
		System.out.println(original2.toString());
		
		
	}
}
