package week1.day2.Assignments;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {10,30,50,70,90};
		int[] arr2 = {20,30,40,50,60};
		
		System.out.println("Insection numbers:");
		for(int i=0; i<arr1.length;i++) {
			for(int j=0; j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr2[j]);
				}
			}
		}
		

	}

}
