package gcdemos;

import java.util.Scanner;

public class wiledemo {

	public static void main(String[] args) {
		String response;
		do {	
			System.out.println("enter somthing to herar it echo!");
			
			Scanner scnr =new Scanner(System.in);
			String echo = scnr.nextLine();
			System.out.println(echo);
			System.out.println("do you want to continue?");
		 response = scnr.next();
		 } while (response.equalsIgnoreCase("yes"));
		System.out.println("See ya!");



			



		
			
		

		
	}
		
}
