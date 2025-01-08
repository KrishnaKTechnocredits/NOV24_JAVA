package anuja.array1;
/*int input1[] = {30, 30, 5, 7, 9, 24};
int input1[] = {-10,-10,-20,-30,-40,-50};

Find Maximum and second Maximum number from above arrays.*/
public class Interview3 {
	
	public static void main(String[] args) {
		Interview3 interview3 = new Interview3();
		int[] arr1 = {30, 30, 5, 7, 9, 24};
		int[] arr2 = {-10,-10,-20,-30,-40,-50,0};
		interview3.findMaxAndSecondMax(arr1);
		//interview3.findMaxAndSecondMax(arr2);

	}
	
	public void findMaxAndSecondMax (int[] arr) {
		//
			int max = arr[0];
			int secondMax = arr[1];
			if(max < secondMax) {
				max = arr[1];
				secondMax =  arr[0];
			}
			for(int i = 2 ; i<arr.length ; i++) {
				if(secondMax > arr[i]  && arr[i] < max) {
					secondMax = max ;
					max = arr[i];
				}
			}
			System.out.println(max +" , "+secondMax);
	}
}