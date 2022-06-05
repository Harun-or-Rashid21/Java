package switchdemo.com;

public class switchDemo {

	public static void main(String[] args) {
		
		String customerStatus = "premium-customer";
		switch (customerStatus) {
			case "guest":
				System.out.println("Thanks for yor order!..");
				break;
			case "regula_customer":
				System.out.println("Thanks for your parchase! Take discount 10% for your order " +" as a gratitude for staying with us..");
				break;
			case "premium-customer":
				System.out.println("Wow! you are our PREMIUM customer! Just take all order " +"for 1$..");
				break;
		default:
			System.out.println("Customer dosen't have status set..");
			
		
		}
		
		int i = 1;
		switch(i) {
			case 1:
				System.out.println("one");
			case 2:
				System.out.println("two");
				break;
		default:
			System.out.println("This is default block");
		}
		
		int i1 = 10;
		switch(i1) {
			case 1:
				System.out.println("one");
			case 2:
				System.out.println("two");
				break;
		default:
			System.out.println("This is default block");	
		}
	}

}
