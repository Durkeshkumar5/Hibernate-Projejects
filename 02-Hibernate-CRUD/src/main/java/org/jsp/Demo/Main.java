package org.jsp.Demo;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("--> Select the options to Perform Operation <--");
		System.out.println();
		System.out.println("1.Insert the Data (Save Employee) :");
		System.out.println("2.Update the Employee :");
		System.out.println("3.Find the Employee by Id :");
		System.out.println("4.Verify By Phone_Number and Password :");
		
		switch(sc.nextInt()){
		
		case 1:
			InsertEmployee.perform();
			break;
			
		case 2:
			UpdateEmployee.perform();
			break;
		
		case 3:
			FindEmployee.perform();
			break;
		
		case 4:
			VerifyPhoneAndPass.perform();
			
		}
		sc.close();
	}
}
