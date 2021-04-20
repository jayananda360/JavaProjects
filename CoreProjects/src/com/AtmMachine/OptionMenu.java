package com.AtmMachine;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
public class OptionMenu extends Account{

	Scanner scan = new Scanner(System.in);
	DecimalFormat moneyformat = new DecimalFormat("'$'###,##0.00");
	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
	
	//validate Login Information Customer Number and Pin Number
	
	public void getLogin() throws IOException {
		int x = 1;
		
		do {
			try {
				data.put(999999999, 115533);
				data.put(888888888, 448866);
				
				System.out.println("Welcome To The ATM Machine");
				System.out.println("Enter Your Customer Number: ");
				setCustomerNumber(scan.nextInt());
				
				System.out.println("Enter Your PIN Number: ");
				setPinNumber(scan.nextInt());
				
			}catch(Exception e){
				System.out.println("\n"+ "Invalid Input"+"\n");
				x =2;
			}
			for(Entry<Integer, Integer> entry : data.entrySet()) {
				if(entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()) {
					getAccountType();
					
				}	
			}
			System.out.println("\n"+"Wrong Customer Number Or Pin Number."+"\n");
		}while(x == 1);
	}
	//get Account Type Menu Type Selection
	
	public void getAccountType() {
		System.out.println("Select the Account you want to access: ");
		System.out.println("Type 1 - Checking Account");
		System.out.println("Type 2 - Saving Account");
		System.out.println("Type 3 - Exit");
		System.out.println("Choice..");
		
		selection = scan.nextInt();
		
		switch(selection) {
		case 1:
			getChecking();
			break;
			
		case 2:
			getSaving();
			break;
			
		case 3:
			System.out.println("Thank You For Using This ATM, Bye...");
			break;
			
		default:
			System.out.println("\n"+"Invalid Choice."+"\n");
			getAccountType();
		}
	}
	//Display Checking Account Menu With Selection
	
	private void getSaving() {
		// TODO Auto-generated method stub
		System.out.println("Checking Account");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Withdraw Funds");
		System.out.println("Type 3 - Deposit Funds");
		System.out.println("Type 4 - Exit");
		System.out.print("Choice..");
		
		selection = scan.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("Saving Account Balance: "+moneyformat.format(getSavingBalance()));
			getAccountType();
			break;
			
		case 2:
			getSavingWithdrawInput();
			getAccountType();
			break;
			
		case 3:
			getSavingDepositInput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("Thank You For Using ATM, Bye..");
			
		default:
			System.out.println("\n"+"Invalid Choice."+"\n");
			getSaving();
			
		}
	}

	public void getChecking() {
		System.out.println("Checking Account");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Withdraw Funds");
		System.out.println("Type 3 - Deposit Funds");
		System.out.println("Type 4 - Exit");
		System.out.print("Choice..");
		
		selection = scan.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("Checking Account Balance: "+moneyformat.format(getCheckingBalance()));
			getAccountType();
			break;
			
		case 2:
			getCheckingWithdrawInput();
			getAccountType();
			break;
			
		case 3:
			getCheckingDepositInput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("Thank You For Using ATM, Bye..");
			
		default:
			System.out.println("\n"+"Invalid Choice."+"\n");
			getChecking();
			
		}
	}
	int selection;
	
}
