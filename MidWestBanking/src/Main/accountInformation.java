package Main;

import java.util.Scanner;

public class accountInformation {

	public static int balance;
	public static int previousTransaction;
	public static String customerName;
	public static String customerId;
	
	accountInformation(String name, String id){
		customerName = name;
		customerId = id;
	}
	
	
	
	public static void deposit(int amount) {
		if(amount != 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	public static void withDraw(int amount1) {
		if(amount1 != 0) {
			balance = balance - amount1;
			previousTransaction = - amount1;
		}
	}
	public static void getPrevoiusTransaction() {
		if(previousTransaction > 0)
		{
			System.out.println("Amount deposited: " + previousTransaction);
		}else if(previousTransaction < 0) {
			System.out.println("Withdrawn amount: " + Math.abs(previousTransaction));
		}else {
			System.out.println("Thank you");
		}
			
	}
	
	public static void showMainMenu() {
		char option = '\1';
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello Welcome to Midwest Banking " + customerName);
		System.out.println("Your id is" + customerId);
		System.out.println("\n");
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous Transaction");
		System.out.println("E. Exit");
		
		do
		{
			System.out.println("===================");
			System.out.println("What would you like to do: ");
			System.out.println("======================");
			option = scanner.next().charAt(0);

			
			switch(option)
			{
			case 'A':
				System.out.println("-----------");
				System.out.println("Your Balance is: " + balance);
				System.out.println("-----------");

				break;
			case 'B':
				System.out.println("------------");
				System.out.println("nter The amount you would like to deposit :");
				System.out.println("-------------");
				int amount = scanner.nextInt();
				deposit(amount);
				break;	
			case 'C':
				System.out.println("-----------");
				System.out.println("How much would you like to withdraw");
				System.out.println("-----------");
				int amount1 = scanner.nextInt();
				withDraw(amount1);
				break;
			case 'D':
				System.out.println("-------------");
				getPrevoiusTransaction();
				System.out.println("--------------");
				break;
			default:
				
				System.out.println("Not a option please make try again");
				break;
			}
		}while(option !='E');
		
		System.out.println("Thank you please come again");
			
	}
	
}
