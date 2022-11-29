package entities;

public class Main {

	public static void main(String[] args) {
		Account acc = new Account("Lucas Inocencio Pires", "50165", "4343", 500);
		
		acc.deposit(200);
		
		acc.overdraftWithdraw(150);

		acc.extract();
		
		acc.overdraftWithdraw(51);
		
		acc.creditCardWithdraw(501);
		
		acc.creditCardWithdraw(250);
		
		acc.extract();
	}

}
