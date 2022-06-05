package nasted.loop.demo;

public class NastedLoopDemo {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			System.out.println("*** i = " + i +"***");
			for(int j = 0; j < 3; j++) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}
		

		
		int week = 7;
		int days = 7;
		
		for(int i = 1; i<=week; ++i) {
			System.out.println("Week: "+i);
			for(int j = 1; j<= days; ++j) {
				if(j % 2 != 0) {
					continue;
				}
				System.out.println("Days: "+j);
			}
		}
		
		int rows = 5;
		for(int i = 1; i<=rows; ++i) {
			for(int j = 1; j<=i; ++j) {
				System.out.print(j +" ");
			}
			System.out.println("");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
