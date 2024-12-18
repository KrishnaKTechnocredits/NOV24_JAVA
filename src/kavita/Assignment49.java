package kavita;
/* Assignment - 49 : 16th Dec'2024 [15 mins] [imp]

return the maximum number from given array. 

input : {44,45,22,25,47,29,46}
output : 47

input : {-44,-45,-22,-25,-47,-29,-46}
output : -22
Time:10m*/
public class Assignment49 {
	int getMaxNumber(int[] arr){
		int maxNumber=arr[0];
		for(int index=1;index<arr.length;index++){
			if(maxNumber<arr[index]){
				maxNumber=arr[index];
			}
		}
		System.out.println("Maximum no in the given array is "+maxNumber);
		return maxNumber;
	}

	public static void main(String[] args){
		Assignment49 assignment49=new Assignment49();
		int[] numbers={44,45,22,25,47,29,46};
		assignment49.getMaxNumber(numbers);
		int[] num={-44,-45,-22,-25,-47,-29,-46};
		assignment49.getMaxNumber(num);
	}
	
}
