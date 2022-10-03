package week1.day2.Assignments;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1,2,3,5,4};
		int size = numbers.length;
		Arrays.sort(numbers);
		System.out.println("Second Number is "+ numbers[size-2]);
	}

}
