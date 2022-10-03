package week1.day2.Assignments;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1,2,3,4,2,5,2,4};
		
		for(int i=0; i<numbers.length-1;i++) {
			for(int j=i+1; j<numbers.length;j++) {
				if(numbers[i]==numbers[j]) {
					System.out.println(numbers[j]);
					break;
				}
					
			}
		}

	}

}
