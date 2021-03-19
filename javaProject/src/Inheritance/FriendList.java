package Inheritance;

public class FriendList {
	public static void main(String[] args) {
		
		Friend[] friends = new Friend[10];
		friends[0] = new Friend("임성원","01012345678");
		friends[1] = new ComFriend("정준영","01098765432","총무부서");
		friends[2] = new UnivFriend("도왕락","01045456767","역사학과");
		
		for(Friend friend : friends) {
			if(friend != null)
				System.out.println(friend.toString());
		}
		
	}
	
}
