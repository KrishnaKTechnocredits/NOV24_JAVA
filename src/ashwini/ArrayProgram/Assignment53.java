package ashwini.ArrayProgram;
/*Assignment - 53 : 16th Dec'2024 [5-7 mins]

print the array in reverse order. 

input : {10,34,22,16,19,99}
output : 99
         19
		 16
		 22
		 34
		 10 */

public class Assignment53 {
	void getReverseArray(int[]arr){
		int [] output= new int[arr.length];
		for(int index=(arr.length)-1,j=0;index>=0;index--,j++) {
			output[j]=arr[index];
			System.out.println(arr[index]);
		}
	}

	public static void main(String[] args) {
		Assignment53 a53=new Assignment53();
		int [] arr=  {10,34,22,16,19,99};
		System.out.println("Array in Reverse order-->");
		a53.getReverseArray(arr);
	}
}
