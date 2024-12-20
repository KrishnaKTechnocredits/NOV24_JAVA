package swapnil;

public class Assignment51 {
	
	void minMax(int[] input) {
		int maxNum=input[0];
		int minNum=input[0];
		for(int i=0;i<input.length;i++) {
			if(maxNum<input[i]) {
				maxNum=input[i];
			}
			if(minNum>input[i]) {
				minNum=input[i];
			
			}
			
		}
		System.out.println(maxNum);
		System.out.println(minNum);
		
	}

	public static void main(String[] args) {
		int[] arr = { 44, 45, 22, 25, 47, 29, 46 };
		Assignment51 a = new Assignment51();
		a.minMax(arr);
		

	}

}
