//Assignment - 51 : 16th Dec'2024 [15 mins]
//
//print maximum and minimum number from given array. 
//
//void findMaxMin(int[] arr){
//	int maxNum=arr[0], minNum=arr[0];
//} 
//8min
package fazrana.array;

public class FAssignment51 {
	void printMaxMin(int[] array) {
		int maxVal=array[0];
		int minVal=array[0];
		for(int i=1;i<array.length;i++) {
			if(maxVal<array[i]) {
				maxVal=array[i];
			}
			if (minVal>array[i]){
				minVal=array[i];
			}
		}
		System.out.println("Min value is "+minVal+" and Max value is "+maxVal);
	}
	
	public static void main(String[] args) {
		int[] array= {-44,-45,-22,-25,-47,29,46};
		int[] array1= {44,45,22,25,47,29,46};
		FAssignment51 fassignment51=new FAssignment51();
		fassignment51.printMaxMin(array);
		fassignment51.printMaxMin(array1);
	}
}
