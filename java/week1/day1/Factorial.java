package week1.day1;

public class Factorial  {

	public static void main(String[] args) {
		 int input = 5;
		 int result = 1;
		 
		 for(int j=1;j<=input; j++) {
			 result = result*j;
		 }
		 
		 System.out.println("Factorial of Number is: " + result);
		 
	}
}
