package temp;

public class Account {

	private int balance = 0;

	public void setBalance(int money) {
		if (money >= 0 && money <= 1000000) {
			this.balance = money;
		}
	}

	public int getBalance() {
		return balance;
	}
}
