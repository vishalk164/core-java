package BankApplication.Model.controller;

import java.util.Scanner;

import BankApplication.Model.Service.RBI;
import BankApplication.Model.serviceExmple.SBI;

public class AdminController {

	public static void main(String[] args) {

		System.out.println("****WELCOME TO SBI BANK****");
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		RBI rbi = new SBI();// indirect object of interface
		while (flag) {
			System.out.println("--------------------------");
			System.out.println("--------------------------");
			System.out.println("1 : Create Bank Account  ");
			System.out.println("2 : Show Account Details ");
			System.out.println("3 : Show Account Balance ");
			System.out.println("4 : Withdraw Amount ");
			System.out.println("5 : Deposit Amount ");
			System.out.println("6 : Update Account Details ");
			System.out.println("7 : Exit");
			System.out.println("---------------------------");
			System.out.println("---------------------------");
			System.out.println("***Enter your Choice***");
			int ch = sc.nextInt();

			switch (ch) {

			case 1:
				rbi.registerAccount();
				break;
			case 2:
				rbi.showAccountDetails();
				break;
			case 3:
				rbi.showAccountBalance();
				break;
			case 4:
				rbi.withdrawAmount();
				break;
			case 5:
				rbi.depositeAmount();
				break;
			case 6:
				rbi.updateAccountDetails();
				break;

			case 7:
				flag = false;
				break;

			default:
				System.out.println("Wrong choice ");
				break;
			}

		}

	}
}