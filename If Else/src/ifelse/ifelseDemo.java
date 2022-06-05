package ifelse;

import java.util.Scanner;

public class ifelseDemo {

	public static void main(String[] args) {
		int ammountOfMoneyOnAccount = 200;
		int itemPrice = 300;
		
		
		if(ammountOfMoneyOnAccount < itemPrice) {
			
			System.out.println("You don't have enough money on your account to purchase" +"this item.");
		}
		else {
			System.out.println("Item is parchased");
		}
		
		
		ammountOfMoneyOnAccount += 300;
		if(ammountOfMoneyOnAccount < itemPrice) {
			System.out.println("You don't have enough money on your account to purchase" +"this item.");
		}
		else {
			System.out.println("Item is parchased");
		}
		
		int i1 = 3;
		int i2 = 2;
		int i3 = 10;
		
		if(i1>i2) {
			if(i1>i3)
				System.out.println("I1 is more than I2 & I3..");
			else
				System.out.println("I1 is more than I2 but less than I3..");
		}
		
		int orderPrice = 1000;
		
		if(orderPrice > 0 && orderPrice < 100) {
			System.out.println("You have 5% discount for this order..");
		} else if(orderPrice >= 100 && orderPrice < 500){
			System.out.println("You have 10% discount for this order..");
		} else if (orderPrice >= 500 && orderPrice < 5000) {
			System.out.println("You have 15% discount for this order..");
		}
		
		
		System.out.println("Please Enter Integer Number: ");
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			String ans = "";
			
			if(n % 2 == 1) {
				ans = "Weird";
			}else {
				if(n>=2 && n<=5) {
					ans = "Not Weird";
				}else if(n>=6 && n<=20) {
					ans = "Weird";
				}else {
					ans = "Not Weird";
				}
			}
			System.out.println(ans);
		}	
		
		
		
	}

}
