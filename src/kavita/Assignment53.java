package kavita;
/*Assignment - 53 : 16th Dec'2024 [5-7 mins]

print the array in reverse order. 

input : {10,34,22,16,19,99}
output : 99
         19
		 16
		 22
		 34
		 10
Time:7m*/
public class Assignment53 {
	void printArrayInReverse(int[] arr){
		for(int index=arr.length-1;index>=0;index--){
			System.out.println(arr[index]);
		}
	}
	
	public static void main(String[]args){
		Assignment53 assignment53=new Assignment53();
		int[]input={10,34,22,16,19,99};
		assignment53.printArrayInReverse(input);
	}
}
