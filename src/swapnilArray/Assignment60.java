package swapnilArray;

//import java.util.Arrays;

public class Assignment60 {
	
	void secMaxNum(int[] input) {
		int maxNum=input[0];
		int secMax=input[1];
		if(input[0]<input[1]) {
			maxNum=input[1];
			secMax=input[0];
		}
		for(int i=0;i<input.length;i++) {
			if(maxNum<input[i]) {
				maxNum=input[i];
			}
			else if(secMax<input[i]) {
				secMax=input[i];
			}
		}
		System.out.println(secMax);
		
	}

	public static void main(String[] args) {
		int[] input = {33,33,19,55,53,11};
		Assignment60 a = new Assignment60();
		a.secMaxNum(input);
		//System.out.println(Arrays.toString(input));
		

	}

}
