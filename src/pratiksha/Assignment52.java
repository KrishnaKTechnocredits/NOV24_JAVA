package pratiksha;

public class Assignment52 {
/*
 Assignment - 52 : 16th Dec'2024 [15 mins]

return maximum and minimum number from given array.

int getMaxMinNum(int[] arr){
	
 */
	int[] printMaxMin(int[]array) {
		
		int[] output=new int[2];
		
		int maxVal=array[0];
		
		int minVal=array[0];
		
		for(int i=0; i<array.length;i++) {
			
			if(maxVal<array[i]) {
				maxVal=array[i];
			}
			if(minVal>array[i]) {
				minVal=array[i];
			}
			
			
		}
		
		output[0]=maxVal;
		output[1]=minVal;
		
		return output;
	}
	String printNum(int[]array) {
		
		System.out.println("Input array: ");
		
		for(int i=0;i<array.length;i++) {
			
			System.out.println(array[i]+",");
		}
		int[]output=printMaxMin(array);
		
		System.out.println();
		
		return("Max Min array: "+output[0]+","+output[1]);
	}
	public static void main(String[] args) {
		
		int[]array={44,45,22,25,47,29,46};
		
		int[]array1={-44,-45,-22,-25,-47,29,46};
		
		Assignment52 assign52= new Assignment52();
		
		System.out.println(assign52.printNum(array));
		
		System.out.println();
		
		System.out.println(assign52.printNum(array1));
		
		
	}
}
