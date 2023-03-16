package com.ExceptionHandling;

import java.util.Scanner;

public class CustomException {
	

	public static void validateAtmpin() throws AtmPinCheckException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your 4 digit atm pin");
		String atmPin = sc.next();
		if (atmPin.equals("4567")) {
			System.out.println("txn success..!!!");
		} else {

//			AtmPinCheckException atmpinCheck = new AtmPinCheckException(
//					"Entered invalid atm pin , Please enter valid pin for next txn");
//			throw atmpinCheck;
			 throw new AtmPinCheckException(
			 "Entered invalid atm pin , Please enter valid pin for next txn");
		}
	}

	public static void main(String[] args) {

		try {
			validateAtmpin();
		} catch (AtmPinCheckException e) {
			 e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e);
		}
	}


}
