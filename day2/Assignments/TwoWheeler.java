package week1.day2.Assignments;

public class TwoWheeler {
	
	int noOfWheels = 2;
	short noOfMirrors = 1;
	long chassisNumber = 5647388378L;
	boolean isPunctured = false;
	String bikeName = "RX100";
	double runningKM = 25.56;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoWheeler obj = new TwoWheeler();
		
		System.out.println("Number of Wheels: "+obj.noOfWheels);
		System.out.println("Number of Mirrors: "+obj.noOfMirrors);
		System.out.println("Chassis Number: "+obj.chassisNumber);
		System.out.println("Puncture status: "+obj.isPunctured);
		System.out.println("Bike Name: "+obj.bikeName);
		System.out.println("Running KM: "+obj.runningKM);
	}

}
