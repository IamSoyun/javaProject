package api;

import java.util.HashMap;

public class UserExample {
	public static void main(String[] args) {
		System.out.println("hello".hashCode());
		System.out.println("hello23".hashCode());

		User user1 = new User();
		user1.userId = "user1";
		user1.score = 80;
		
		User user2 = new User();
		user2.userId = "user1";
		user2.score = 80;
		
		System.out.println(user1 == user2);
		System.out.println(user1.equals(user2));
		System.out.println(user1.score == user2.score);

		HashMap<User, String> hashMap = new HashMap<>();
		hashMap.put(user1, "홍길동");
		hashMap.put(user2, "박길동");

		System.out.println(hashMap.get(user1));
		System.out.println(hashMap.get(user2));

	}
}

class User {

	String userId;
	int score;

	@Override
	public int hashCode() {
//		return super.hashCode();
		return score;
	}

	@Override
	public boolean equals(Object obj) {
//		return super.equals(obj);
		User u = (User) obj;
		return this.userId.equals(u.userId);
	}

}
