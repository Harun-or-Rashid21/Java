package find.max.integer;

import java.util.Scanner;
import java.util.Arrays;

public class FindMaxInt {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Please, enter integer numbers separated by space: ");
			String numbers = sc.nextLine();
			int[] intArray = convertStringArrayToIntArray(numbers.split("\\s+"));
			int maxInt = findMaxIntInArray(intArray);
			System.out.println("*** Initial Array ***");
			System.out.println(Arrays.toString(intArray));
			System.out.println("*** Max number in array ***");
			System.out.println(maxInt);
		}		

	}

	public static int findMaxIntInArray(int[] intArray) {
		int max = intArray[0];
		for (int i : intArray) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}

	private static int[] convertStringArrayToIntArray(String[] stringArray) {
		int[] intArray = new int[stringArray.length];
		for (int i = 0; i < stringArray.length; i++) {
			intArray[i] = Integer.valueOf(intArray[i]);
		}
		return intArray;
	}

}
