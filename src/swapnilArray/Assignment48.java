package swapnilArray;

public class Assignment48 {

	public static void main(String[] args) {
		int[] input = {10,30,-45,66,-10};
		int count=0;
		
			for(int i=0;i<input.length;i++) {
				if(input[i]>0) {
					count++;
					System.out.println(input[i]);
				}
				
			}
			System.out.println(count);
	}

}
