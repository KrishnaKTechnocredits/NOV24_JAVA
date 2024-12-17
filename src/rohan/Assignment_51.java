package rohan;

public class Assignment_51 {
	
	public static void main(String[] args) {
		Assignment_51 assignment = new Assignment_51();
		int [] input = {44,45,22,25,47,29,46};
		int[] a = assignment.MinMaxNum(input);
		System.out.println("Maximum num is = "+a[0]+"\n"+"Minimun num is = "+a[1]);
		System.out.println("--------------------------");
		int [] input1 = {-44,-45,-22,-25,-47,-29,-46};
		int[] b = assignment.MinMaxNum(input1);
		System.out.println("Maximum num is = "+b[0]+"\n"+"Minimun num is = "+b[1]);
	}
	int[] MinMaxNum(int [] input) {
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
		return Output;
		
	}
}
