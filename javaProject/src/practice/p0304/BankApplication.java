package practice.p0304;

import java.util.Scanner;

public class BankApplication {

	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;

		while (run) {

			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택 > ");

			int selectNo = Integer.parseInt(sc.nextLine());

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
				System.out.println("프로그램 종료.");
			}
		}

	}

	private static void createAccount() { // 계좌생성

		System.out.println("------------");
		System.out.println("계좌생성");
		System.out.println("------------");

		System.out.print("계좌번호: ");
		String ano = sc.nextLine();

		System.out.print("계좌주: ");
		String owner = sc.nextLine();

		System.out.print("초기입금액: ");
		int balance = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = new Account(ano, owner, balance);
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}

	}

	private static void accountList() { // 계좌목록

		System.out.println("------------");
		System.out.println("계좌목록");
		System.out.println("------------");

		for (int i = 0; i < accountArray.length; i++) {

			if (accountArray[i] == null)
				break;
			System.out.println(
					accountArray[i].getAno() + "\t" + accountArray[i].getOwner() 
					+ "\t" + accountArray[i].getBalance());
		}

	}

	private static void deposit() { // 예금

		Account account;

		System.out.println("------------");
		System.out.println("예금");
		System.out.println("------------");

		System.out.print("계좌번호: ");
		account = findAccount(sc.nextLine());
		System.out.print("예금액: ");
		account.setBalance(account.getBalance() + Integer.parseInt(sc.nextLine()));

		System.out.println("결과: 예금이 성공되었습니다.");
	}

	private static void withdraw() { // 출금

		Account account;

		System.out.println("------------");
		System.out.println("출금");
		System.out.println("------------");

		System.out.print("계좌번호: ");
		account = findAccount(sc.nextLine());
		System.out.print("출금액: ");
		account.setBalance(account.getBalance() - Integer.parseInt(sc.nextLine()));

		System.out.println("결과: 출금이 성공되었습니다.");

	}

	private static Account findAccount(String ano) {

		int accountIndex = 0;

		for (int i = 0; i < accountArray.length; i++) {

			if (ano.equals(accountArray[i].getAno())) {
				accountIndex = i;
				break;
			}
		}

		return accountArray[accountIndex];
	}

}
