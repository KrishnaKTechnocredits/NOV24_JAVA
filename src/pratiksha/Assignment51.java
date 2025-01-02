package pratiksha;

public class Assignment51 {
/*
 Assignment - 51 : 16th Dec'2024 [15 mins]

print maximum and minimum number from given array. 

void findMaxMin(int[] arr){
	int maxNum=arr[0], minNum=arr[0];
} 
 */
	void printMaxMin(int[]array) {
		
		int maxval=array[0];
		
		int minval=array[0];
		
		for(int i=0; i<array.length; i++) {
			
			if(maxval<array[i]) {
				maxval=array[i];
			}
			if(minval>array[i]) {
				minval=array[i];
			}
		}
		System.out.println("Min value is: " +minval+ " Max value is: " +maxval);
	}
	public static void main(String[] args) {
		
		int[] array= {44,45,22,25,47,29,46};
		
		int[]array1={-44,-45,-22,-25,-47,29,46};
		
		Assignment51 assign51= new Assignment51();
		
		assign51.printMaxMin(array);
		assign51.printMaxMin(array1);
	}
	}

