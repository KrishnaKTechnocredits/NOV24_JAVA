package rohan;

public class Assignment_49 {
	
	public static void main(String[] args) {
		Assignment_49 assignment = new Assignment_49();
		int [] input = {44,45,22,25,47,29,46};
		int a = assignment.max(input);
		System.out.println("output= "+a);
		int [] input1 = {-44,-45,-22,-25,-47,-29,-46};
		int b = assignment.max(input1);
		System.out.println("Output= "+b);
	}
	int max(int [] input) {
		int maximum = input[0] ;
		for(int i=1;i<input.length;i++) {
			
			if(maximum < input[i] ) {
				maximum = input[i];
			}
		}
		return maximum;
	}
}
