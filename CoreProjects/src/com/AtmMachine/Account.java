package com.AtmMachine;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

	Scanner input =new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	//Select the Customer Number
	
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}
	//Get The Customer Number
	
	public int getCustomerNumber() {
		return customerNumber;
	}
	
	//set the pin number
	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}
	
	// get the pin Number
	public int getPinNumber() {
		return pinNumber;
	}
	
	//get checking Account Balance
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	//get checking Account Balance
	public double getSavingBalance() {
		return savingBalance;
	}
	
	//Calculate Checking Account Withdrawal
	
	public double calcCheckingWithdraw(double amount) {
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
	}
	
	//Calculate Saving Account withdrawal
	
	public double calcSavingWithdraw(double amount) {
		savingBalance = (savingBalance - amount);
		return savingBalance;
	}
	
	//Calculate Checking Account Deposit
	public double calcCheckingDeposit(double amount) {
		checkingBalance = (checkingBalance + amount);
		return checkingBalance;
	}
	
	//calculate Saving Account Deposit
	public double calcSavingDeposit(double amount) {
		savingBalance = (savingBalance + amount);
		return savingBalance;
	}
	
	//Customer Checking Account Withdraw Input
	public void getCheckingWithdrawInput() {
		System.out.println("Checking Account Balance: "+moneyFormat.format(checkingBalance));
		System.out.print("Amount You Want To Withdraw from Checking Account: ");
		double amount = input.nextDouble();
		
		if((checkingBalance - amount) > 0) {
			calcCheckingWithdraw(amount);
			System.out.println("New Checking Account Balance: "+moneyFormat.format(checkingBalance));
			
		}else {
			System.out.println("\n"+"Insufficient Balance."+"\n");
		}
	}
	 public void getSavingWithdrawInput() {
		 System.out.println("Saving Account Balance: "+moneyFormat.format(savingBalance));
		 System.out.println("Amount You Want To Withdwar from Saving Account: ");
		 double amount = input.nextDouble();
		 
		 if((savingBalance - amount) > 0) {
			 calcSavingWithdraw(amount);
			 System.out.println("New Saving Account Balance: "+savingBalance+"\n");
		 }else {
			 System.out.println("\n"+"Insufficient Balance."+"\n");
		 }
		 
	 }
	 
	 //Customer Checking Account Deposit Input
	 public void getCheckingDepositInput() {
		 System.out.println("Checking Account BAlance: "+moneyFormat.format(checkingBalance));
		 System.out.println("Amount You Want to deposit from Checking Account: ");
		 double amount = input.nextDouble();
		 
		 if((checkingBalance + amount) > 0) {
			 calcCheckingDeposit(amount);
			 System.out.println("New Checking Accout BAlance: "+moneyFormat.format(checkingBalance));
			 
		 }else {
			 System.out.println("\n"+"Insufficient Balance."+"\n");
		 }
	 }
	 
	 //Customer Saving Account deposit Input
	 public void getSavingDepositInput() {
		 System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
		 System.out.println("Amount you want to Deposit from Saving Account: ");
		 double amount = input.nextDouble();
		 
		 
		 if((savingBalance + amount) > 0) {
			 calcSavingDeposit(amount);
			 System.out.println("New Saving Account Balance: " + moneyFormat.format(savingBalance));
			 
		 }else {
			 System.out.println("\n"+"Insuficient Balance."+"\n");
		 }
	
	}
	 private int customerNumber;
	 private int pinNumber;
	 private double checkingBalance = 0;
	 private double savingBalance = 0;
	 
}
