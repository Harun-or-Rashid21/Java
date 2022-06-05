package recursive.method;


public class RecursiveMethodDemo {

	public static void main(String[] args) {
		System.out.println("3! = "+ calculateFactorial(3));
		System.out.println("4! = "+ calculateFactorial(4));
		
		System.out.println("Iterative recursive Factorial 4! = "+ iterativeFactorial(4));
		
	}
	private static int calculateFactorial(int i) {
		if(i != 0) {
			return i * calculateFactorial(i - 1);
		} else {
			return 1;
		}
		
	}
	private static int iterativeFactorial(int n) {
		int factorial = 1;
		if(n < 0) {
			return 1;
		}
		for(int i = 1; i <= n; i++) {
			factorial *= i;
		}
		return factorial;
		
	}
	
	

}
