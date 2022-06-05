package for_each_loop;

public class ForEachLoopDemo {

	public static void main(String[] args) {
		int[] array = {1,2,3};
		int sum = 0;
		
		for(int number: array) {
			sum += number;
			System.out.println("Number :" + number);
		}
		System.out.println("Sum :"+ sum);
	}
	

}
