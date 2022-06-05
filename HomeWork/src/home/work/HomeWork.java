package home.work;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		System.out.println("Please Enter Any Integer: ");
		try (Scanner sc = new Scanner(System.in)) {
			String intString = sc.next();
			
			for(char digit: intString.toCharArray()) {
				System.out.println(digit);
			}
		}
	}

}
