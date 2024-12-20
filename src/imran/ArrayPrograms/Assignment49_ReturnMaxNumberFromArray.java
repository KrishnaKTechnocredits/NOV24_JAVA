package imran.ArrayPrograms;

public class Assignment49_ReturnMaxNumberFromArray {

	int getmaxNumber(int[] data)
	{
		int maxNum= data[0];
		for(int i=1;i<=data.length-1;i++)
		{
			if(maxNum<data[i])
			{
				maxNum = data[i];
			}
		}
		return maxNum;
	}
	
	public static void main(String[] args) {
		Assignment49_ReturnMaxNumberFromArray assignment49_ReturnMaxNumberFromArray_1 = new Assignment49_ReturnMaxNumberFromArray();
		int[] data = {44,45,22,25,47,29,46};
		int maxNumber = assignment49_ReturnMaxNumberFromArray_1.getmaxNumber(data);
		System.out.println("The Maximum Number Present the Array is : "+ maxNumber);
		int[] data_1 = {-44,-45,-22,-25,-47,-29,-46};
		maxNumber = assignment49_ReturnMaxNumberFromArray_1.getmaxNumber(data_1);
		System.out.println("The Maximum Number Present the Array is : "+ maxNumber);
	}
}
