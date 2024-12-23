package Assignment_Array;

public class Assignment60 {
	
	int getSecondMaximumNumber(int[] arr) {
		int maxNumber = arr[0] , secondMaxNumber = arr[1];
		if(maxNumber<secondMaxNumber) {
			maxNumber = arr[1];
			secondMaxNumber = arr[0];
		}
		
		for(int i = 2;i<arr.length;i++) {
			if(arr[i]>maxNumber) {
				secondMaxNumber = maxNumber;
				maxNumber = arr[i];
			}else if(secondMaxNumber<arr[i]) {
				secondMaxNumber = arr[i];
			}
		}
		
		return secondMaxNumber;
	}

	public static void main(String[] args) {
		int[] num = {33,33,19,55,53,11};
		System.out.println(new Assignment60().getSecondMaximumNumber(num));
	}
}
