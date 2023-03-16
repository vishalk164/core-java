package BankApplication.Model.serviceExmple;

import java.util.Scanner;

import BankApplication.Model.Account;
import BankApplication.Model.Service.RBI;

public class SBI implements RBI {

	Scanner sc = new Scanner(System.in);
	Account ac = new Account();

	@Override
	public void registerAccount() {

		System.out.println("Enter account no");
		int accountno = sc.nextInt();// 1234
		ac.setAccountBalance(accountno);
		System.out.println("Enter account name");
		String accountName = sc.next();
		ac.setAccountName(accountName);
		System.out.println("Enter your aadhar card number ");
		String aadharNo = sc.next();
		ac.setAadharCard(aadharNo);
		System.out.println("Enter your pan card ");
		String panNo = sc.next();

		ac.setPanCard(panNo);
		System.out.println("Enter your mobile no");
		long mbNo = sc.nextLong();
		ac.setMobileNo(mbNo);
		System.out.println("Enter account opening balance ");
		double accBalance = sc.nextDouble();
		ac.setAccountBalance(accBalance);
		System.out.println("@@@Account Opening Success@@@@");
	}

	@Override
	public void showAccountDetails() {

		System.out.println("Enter your account number ");
		int accounNo = sc.nextInt();

		if (ac.getAccountNo() == accounNo) {
			System.out.println(ac.getAccountName() + " " + ac.getAadharCard() + " " + ac.getPanCard());
		} else {

			System.out.println("Account doesn't exit !!");
		}
	}

	@Override
	public void showAccountBalance() {

	}

	@Override
	public void withdrawAmount() {

   //500
    //int entered = 500
    //double updatedBalance = ac.getAccount()- enteredAmount;//1000-500//500
    //ac.setAccountBalance(updatedBalance);
	}

	@Override
	public void depositAmount() {

	}

@Override
public void updateAccountDetails(){

}

	@Override
	public void depositeAmount() {
		// TODO Auto-generated method stub

	}
}
