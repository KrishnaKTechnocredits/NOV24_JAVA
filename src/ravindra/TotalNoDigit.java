package ravindra;

public class TotalNoDigit {
	int count;
	int totalNumOfDigit(String name) {
		for(int i=0;i<name.length();i++) {			
			if(Character.isDigit(name.charAt(i))) {
				count++;				
			}
		}return count;
	}
	
	public static void main(String []args) {
		TotalNoDigit totalNoDigit=new TotalNoDigit();
		int digitCount=totalNoDigit.totalNumOfDigit("aa1kan33ks4h5a");
		System.out.println("total "+digitCount+" digits are there in given input.");
	}
}