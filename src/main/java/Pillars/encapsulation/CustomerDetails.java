package Pillars.encapsulation;

public class CustomerDetails {
    //data 
	public static void main(String[] args) {
		Bank b = new Bank();// Creating object of Bank class by using new keyword. 
		b.setMoney(100000);// setting the value of variable. 
		int myProfit = b.getMoney();// reading the value of variable. 
		System.out.println("My amount in account is " + myProfit);
	}
}
