package Pillars.encapsulation;

public class Bank {
	//binding of data and corresponding methods
	private int money;
	public void setMoney(int money) {
		this.money=money;
	}
	public int getMoney() {
		return money*2;
	}
	public static void main(String[] args) {

	}
}
