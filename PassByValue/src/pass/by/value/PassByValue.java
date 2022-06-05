package pass.by.value;

import java.util.Arrays;

public class PassByValue {

	public static void main(String[] args) {
		int i = 10;
		changeIntValue(i);
		System.out.println("I After ChangeIntValue: " +i);
		
		i = changeInt(i);
		System.out.println("I After ChangeInt: " +i);
		
		
		int[] array = {1,2,3};
		System.out.println("Array Before Change: "+ Arrays.toString(array));
		changeArray(array);
		System.out.println("Array After Change: "+ Arrays.toString(array));
		
		clearArray(array);
		System.out.println("After Clear Array:" + Arrays.toString(array));
		

		
	}


	private static void changeIntValue(int i) {
		i += 100;
	}

	private static int changeInt(int i) {
		i += 100;
		return i;
	}
	private static void changeArray(int[] array) {
		array[1] = 200;
	}
	private static void clearArray(int[] array) {
		array = null;
	}
	

}
