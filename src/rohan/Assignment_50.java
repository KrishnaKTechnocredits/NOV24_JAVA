package rohan;

public class Assignment_50 {
	
	public static void main(String[] args) {
		Assignment_50 assignment = new Assignment_50();
		int [] input = {44,45,22,25,47,29,46};
		int a = assignment.min(input);
		System.out.println("output= "+a);
		int [] input1 = {-44,-45,-22,-25,-47,-29,-46};
		int b = assignment.min(input1);
		System.out.println("Output= "+b);
	}
	int min(int [] input) {
		int minimum = input[0] ;
		for(int i=1;i<input.length;i++) {
			
			if(minimum > input[i] ) {
				minimum = input[i];
			}
		}
		return minimum;
	}
}
