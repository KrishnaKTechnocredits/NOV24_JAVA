package imran.ArrayPrograms;

public class Assignment51_PrintMaxMinNumberFromArray {

	void printMaxMinNumber(int[] data)
	{
		int maxNum = data[0], minNum = data[0];
		for(int i=1;i<=data.length-1;i++)
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
		System.out.println(" The Minimum digit Element present in the Array is : "+ minNum);
		System.out.println(" The Maximum digit Element present in the Array is : "+ maxNum);
	}
	
	public static void main(String[] args) {
		Assignment51_PrintMaxMinNumberFromArray assignment51_PrintMaxMinNumberFromArray_1 = new Assignment51_PrintMaxMinNumberFromArray();
		int[] data = {44,45,22,25,47,29,46};
		assignment51_PrintMaxMinNumberFromArray_1.printMaxMinNumber(data);
		int[] data_1 = {-44,-45,-22,-25,-47,-29,-46};
		assignment51_PrintMaxMinNumberFromArray_1.printMaxMinNumber(data_1);
	}
}
