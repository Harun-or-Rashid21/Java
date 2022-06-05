package useractivity;

import java.util.Scanner;

public class UsersActivitySelector {

	public static void main(String[] args) {
		System.out.println("Please Enter Your Action Name :");
		try (Scanner sc = new Scanner(System.in)) {
			String userInput = sc.nextLine();
			
			switch (userInput) {
				case "Login":
					System.out.println("Please Enter your Username!..");
					break;
				case "Sign_up":
					System.out.println("Welcome!..");
					break;
				case "Terminate_program":
					System.out.println("Thank you! Good Bye!..");
					break;
				case "Main_menu":
					System.out.println("Main Menu!..");
					break;
				case "About_app":
					System.out.println("This app is created by me!..");
					break;
			default:
				System.out.println("Please Enter one of this values: Login " + "Sign_up, Terminate_program, Main_menu, About_app");
				break;
			}
		}
	}

}
