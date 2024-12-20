package imran.ArrayPrograms;

public class Assignment52_ReturnMaxMinNumberFromArray {

	int[] getMaxMinNumberReturn(int[] data)
	{
		int maxNum= data[0], minNum = data[0];
		int[] result = new int[2];
		for(int i =1;i<=data.length-1;i++)
		{
			if(minNum>data[i])
			{
				minNum= data[i];
			}
			if(maxNum<data[i])
			{
				maxNum = data[i];
			}
		}
		result[0]= minNum;
		result[1]= maxNum;
		return result;
	}
	
	public static void main(String[] args) {
		Assignment52_ReturnMaxMinNumberFromArray assignment52_ReturnMaxMinNumberFromArray_1 = new Assignment52_ReturnMaxMinNumberFromArray();
		int[] data = {44,45,22,25,47,29,46};
		int[] finalResult= assignment52_ReturnMaxMinNumberFromArray_1.getMaxMinNumberReturn(data);
		System.out.println("The min Number of array is : "+ finalResult[0]);
		System.out.println("The max Number of array is : "+ finalResult[1]);
		int[] data_1 = {-44,-45,-22,-25,-47,-29,-46};
		finalResult= assignment52_ReturnMaxMinNumberFromArray_1.getMaxMinNumberReturn(data_1);
		System.out.println("The min Number of array is : "+ finalResult[0]);
		System.out.println("The max Number of array is : "+ finalResult[1]);
	}
}
