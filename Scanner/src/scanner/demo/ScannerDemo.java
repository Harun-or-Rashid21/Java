package scanner.demo;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		System.out.println("Please Enter Integer Number: ");
		
		  Scanner scan = new Scanner(System.in);
		  int i = scan.nextInt();
		  System.out.println("Please Enter Double Number: ");
		  double d = scan.nextDouble();
		  System.out.println("Please Enter a String: ");
		  scan.nextLine();
		  String s = scan.nextLine();
		  scan.close();
		  
		  
		  System.out.println("String: " + s); 
		  System.out.println("Double: " + d);
		  System.out.println("Int: " + i);
		 
			
	}

}
