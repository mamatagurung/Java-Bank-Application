package test;

import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount obj = new BankAccount("XYz","C001");
		obj.showMenu();
		

	}

}

class BankAccount{
	
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	
	
	//constructor to take customerName and CustomerId from user
	BankAccount(String cName, String cId){
		customerName = cName;
		customerId = cId;
	}
	
	
	boolean deposit(int amount){
		if(amount>0) {
			balance = balance + amount;
			previousTransaction = amount;
			return true;
		}
		else 
			return false;
	}
	boolean withdraw(int amount) {
		if(balance > amount) {
			balance = balance -amount;
			previousTransaction = -amount;
			return true;
		}
		else return false;
	}
	
	void getpreviousTransaction() {
		if(previousTransaction>0) {
			System.out.println("Deposit: "+previousTransaction);
		}
		else if(previousTransaction<0) {
			System.out.println("Withdrawn: "+Math.abs(previousTransaction));
		}
		else
			System.out.println("No transaction occured");
		
		
	}
	void showMenu() {
		char option = '\0';
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome "+customerName);
		System.out.println("Your Id is "+customerId);
		System.out.println("\n");
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Check Previous Transaction");
		System.out.println("E. Exit");
		System.out.println("\n");
			
		do {
			
			System.out.println("************************************");
			System.out.println("Enter your option:");
			option = sc.next().charAt(0);
			System.out.println("************************************");
			System.out.println("\n");
			switch(option) {
			
			case 'A':
				System.out.println("************************************");
				System.out.println("Your Current Balance is Rs."+balance);
				System.out.println("************************************");
				System.out.println("\n");
				break;
			
			case 'B':
				System.out.println("************************************");
				System.out.println("Enter the amount you want to deposit:");
				int amount = sc.nextInt();
				if(deposit(amount))
					{
					System.out.println("Rs."+amount+" has been deposited in your account");
					}
				else
					System.out.println("Transaction failed");
				
				System.out.println("************************************");
				System.out.println("\n");
				break;
			
			case 'C':
				System.out.println("************************************");
				System.out.println("Enter the amount you want to withdraw:");
				int amount1 = sc.nextInt();
				if(withdraw(amount1))
					{
					System.out.println("Rs."+amount1+" has been withdrawn from your account");
					}
				else
					System.out.println("Transaction failed");
				
				System.out.println("************************************");
				System.out.println("\n");
				break;
			
				
			case 'D':
				System.out.println("************************************");
				getpreviousTransaction();
				System.out.println("************************************");
				System.out.println("\n");
				break;
				
			case 'E':
				break;

			default:
				System.out.println("************************************");
				System.out.println("Invalid Option.");
				System.out.println("************************************");
				System.out.println("\n");
				break;
				
				
			
			}
			
			
			
		}while(option != 'E');
		
		System.out.println("Thank you for using our services");
	}
	
}
