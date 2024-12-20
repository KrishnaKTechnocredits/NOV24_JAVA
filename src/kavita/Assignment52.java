package kavita;
/*Assignment - 52 : 16th Dec'2024 [15 mins]

return maximum and minimum number from given array.
Time: 12m*/
public class Assignment52 {
	int[] getMaxMin(int[] arr){
		int[] output=new int[2];
		int maxNum=0, minNum=0;
		for(int index=1;index<arr.length;index++){
			if(maxNum<arr[index]){
				maxNum=arr[index];
			}
			
			if(minNum>arr[index]){
				minNum=arr[index];
			}
		}
		output[0]=maxNum;
		output[1]=minNum;
		return output;
	}
	
	public static void main(String[] args){
		Assignment52 assignment52=new Assignment52();
		int[] input={22,78,-1,33,12};
		//int[] input={22,78};
		int[] maxmin=assignment52.getMaxMin(input);
		System.out.println("Maximum no. in array is "+maxmin[0]);
		System.out.println("Minimum no. in array is "+maxmin[1]);
	}
}
