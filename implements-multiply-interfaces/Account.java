package entities;

public class Account implements ICreditCardWithdraw, IOverdraftWithdraw{
	private String name;
	private String accountNumber;
	private String agency;
	private double balance;
	private double limitCreditCard;
	
	public Account(String name, String accountNumber, String agency, double limitCreditCard) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		this.agency = agency;
		this.balance = 0;
		this.limitCreditCard = limitCreditCard;
	}
	
	public Account(String name, String accountNumber, String agency) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		this.agency = agency;
		this.balance = 0;
		this.limitCreditCard = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAgency() {
		return agency;
	}

	public void setAgency(String agency) {
		this.agency = agency;
	}

	public double getBalance() {
		return balance;
	}

	public double getLimitCreditCard() {
		return limitCreditCard;
	}

	public void setLimitCreditCard(double limitCreditCard) {
		this.limitCreditCard = limitCreditCard;
	}
	
	public void deposit(double value) {
		this.balance += value;
		System.out.println("Deposito no valor de R$ " + value + " efetuado com sucesso!");
	}
	
	public void transfer(Account account, double value) {
		if (this.balance >= value) {
			
			System.out.println("Transferência realizada com sucesso!");
		} else {
			System.out.println("Saldo insuficiente para realizar a transferência!");
		}
	}
	
	public void extract() {
		System.out.println("Titular: " + this.name + " | Agência: " + this.agency + " | Conta: " + this.accountNumber);
		System.out.println("Saldo: R$ " + this.balance + " | Limite Saque cartão de crédito: R$ " + this.limitCreditCard);
	}
	
	public void creditCardWithdraw(double value) {
		if (this.limitCreditCard >= value) {
			this.limitCreditCard -= value;
			System.out.println("Saque do cartão de crédito no valor de R$ " + value + " realizado com sucesso!");
		} else {
			System.out.println("Limite no cartão de crédito insuficiente para realizar o saque!");
		}	
	}
	
	public void overdraftWithdraw(double value) {
		if (this.balance >= value) {
			this.balance -= value;
			System.out.println("Saque no valor de R$ " + value + " realizado com sucesso!");
		} else {
			System.out.println("Saldo insuficiente para realizar o saque!");
		}
	}
	
}
