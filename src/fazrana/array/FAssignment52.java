//Assignment - 52 : 16th Dec'2024 [15 mins]
//
//return maximum and minimum number from given array.
//
//int getMaxMinNum(int[] arr){
//	
//} 
//8min

package fazrana.array;

public class FAssignment52 {
	int[] printMaxMin(int[] array) {
		int[] retrun=new int[2];
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
		retrun[0]=maxVal;
		retrun[1]=minVal;
		return retrun;
	}
	
	String printNum(int[] array) {
		System.out.print("Input array: ");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+",");
		}
		int[] result=printMaxMin(array);
		System.out.println();
		return ("Max Min array: "+result[0]+","+result[1]);
	}
	
	public static void main(String[] args) {
		int[] array= {-44,-45,-22,-25,-47,29,46};
		int[] array1= {44,45,22,25,47,29,46};
		FAssignment52 fassignment52=new FAssignment52();
		System.out.println(fassignment52.printNum(array));
		System.out.println();
		System.out.println(fassignment52.printNum(array1));
	}
}
