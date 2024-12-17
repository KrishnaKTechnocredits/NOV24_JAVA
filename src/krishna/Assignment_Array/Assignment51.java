package Assignment_Array;

public class Assignment51 {
	
	void printMaxMinNumber(int[] num) {
		int maxNumber = num[0];
		int minNumber = num[0];
		for(int i =0;i<num.length;i++) {
			if(num[i]>maxNumber) {
				maxNumber = num[i];
			}
			if(num[i]<minNumber) {
				minNumber = num[i];
			}
		}
		System.out.println(maxNumber);
		System.out.println(minNumber);
	}

	public static void main(String[] args) {
		int[] num = {44,45,22,25,47,29,46};
		new Assignment51().printMaxMinNumber(num);
	}
}
