package mahesh;

public class Assignment_22 {
	
	int count;
	
	void findDigits (String str) {
		
		for (int index=0; index<=str.length()-1; index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment_22 assignment = new Assignment_22();
		assignment.findDigits("aa1kan33ks4h5a");
		System.out.println("Total "+assignment.count+" digits are there in given input.");
	}
}
