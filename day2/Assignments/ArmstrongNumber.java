package week1.day2.Assignments;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter the number");
	    int number = scanner.nextInt();
		int temp = number;
		int result=0;
		
		while(temp>0) {
		int remainder = temp%10;
		result = result+(remainder*remainder*remainder);
		temp = temp/10;
		}
		
		if(result==number) {
			System.out.println("Given number is Armstrong number");
		}else {
			System.out.println("Given number is Not an Armstrong number");
		}
		

	}

}
