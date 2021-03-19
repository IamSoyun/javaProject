package practice.p0308;

import java.util.Scanner;

public class FriendExample {

	static Friend[] friends = new Friend[10];

	public static void main(String[] args) {

		boolean run = true;
		Scanner sc = new Scanner(System.in);
		int answer;

		while (run) {

			System.out.println("-------------------------------------------------------");
			System.out.println("1.친구등록 2.학교친구등록 3.회사친구등록 4.전체목록 5.친구이름검색 6.종료");
			System.out.println("-------------------------------------------------------");
			System.out.print("선택 > ");
			answer = Integer.parseInt(sc.nextLine());

			if (answer == 1) {
				System.out.print("이름 > ");
				String name = sc.nextLine();
				System.out.print("번호 > ");
				String number = sc.nextLine();

				Friend friend = new Friend(name, number);
				saveFriend(friend);

			} else if (answer == 2) {

				System.out.print("이름 > ");
				String name = sc.nextLine();
				System.out.print("번호 > ");
				String number = sc.nextLine();
				System.out.print("학교정보 > ");
				String schoolInfo = sc.nextLine();

				Friend friend = new SchoolFriend(name, number, schoolInfo);
				saveFriend(friend);

			} else if (answer == 3) {

				System.out.print("이름 > ");
				String name = sc.nextLine();
				System.out.print("번호 > ");
				String number = sc.nextLine();
				System.out.print("회사정보 > ");
				String companyInfo = sc.nextLine();

				Friend friend = new CompanyFriend(name, number, companyInfo);
				saveFriend(friend);

			} else if (answer == 4) {

				for (Friend friend : friends) {
					if (friend != null) {
						System.out.println(friend.toString());
					}
				}

			} else if (answer == 5) {

				System.out.print("검색할 친구 이름 입력 > ");
				String findName = sc.nextLine();

				for (Friend friend : friends) {
					if (friend != null && findName.equals(friend.getName())) {
						System.out.println(friend.toString());
						break;
					}
				}
			} else if (answer == 6) {
				System.out.println("종료.");
				run = false;
			}

		}

	}

	public static void saveFriend(Friend friend) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
	}

}
