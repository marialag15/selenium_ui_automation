package week1.day2.Assignments;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter the number");
	    int number = scanner.nextInt();
		int sum=0;
		int remainder=0;
		
		while(number>0) {
	    remainder = number%10;
		sum = sum+remainder;
		number = number/10;
	   }

		System.out.println("Sum of the digits: "+sum);
	}

}
