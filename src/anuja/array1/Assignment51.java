package anuja.array1;
/*
 * 2 if blocks, individual blokcs..

print maximum and minimum number from given array. 

void findMaxMin(int[] arr){
	int maxNum=arr[0], minNum=arr[0];
} */
public class Assignment51 {

	void findMaxMin(int[] arr){
		int maxNum=arr[0], minNum=arr[0];
		//iterate array
		for(int i = 0; i<arr.length ; i++) {
			//check max condition
			if(maxNum < arr[i]) {
				maxNum  = arr[i];
			}
			
			if(minNum > arr[i]) {
				minNum = arr[i];
			}
			
		}
		System.out.println("Max num is -->" + maxNum +"\n");
		System.out.println("Min num is --> " + minNum +"\n");

	}	
	public static void main(String[] args) {
		Assignment51 assignment51 =  new Assignment51();
		System.out.println("Array 1 executed \n");
		int[] num1 = {44,45,22,25,47,29,46};
		int[] num2 = {-44,-45,-22,-25,-47,-100,46};
		assignment51.findMaxMin(num1);
		System.out.println("-------------");
		System.out.println("Array 2 executed \n");
		assignment51.findMaxMin(num2);

	}
}
