package week1.day2.Assignments;

import java.util.Scanner;

public class CheckIfTheNumberIsPositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter the number");
	    number = scanner.nextInt();
	    if(number>=0) {
	    	System.out.printf("%d is positive number",number);
	    }else {
	    	System.out.printf("%d is negative number",number);
	    }

	}

}
