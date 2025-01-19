package rohan;

public class Assignment_52 {
	
	public static void main(String[] args) {
		Assignment_52 assignment = new Assignment_52();
		int [] input = {44,45,22,25,47,29,46};
		assignment.MinMaxNum(input);
		System.out.println("--------------------------");
		int [] input1 = {-44,-45,-22,-25,-47,-29,-46};
		assignment.MinMaxNum(input1);
	}
	void MinMaxNum(int [] input) {
		int [] Output = new int[2];
		 Output[0] = input[0] ;
		 Output[1] = input[0];
		for(int i=1;i<input.length;i++) {
			
			if(Output[0] < input[i] ) {
				Output[0] = input[i];

			}
			if(Output[1] > input[i] ) {
				Output[1] = input[i];
			}
			
		}
		System.out.println("Maximum num is->"+Output[0]+"\n"+"Minimum nuber is->"+Output[1]);
		
	}
}
