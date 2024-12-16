package imran.ArrayPrograms;

public class Assignment50_PrintMinNumberFromArray {

	void printMinNumber(int[] data)
	{
		int minNum = data[0];
		for(int i=1;i<=data.length-1;i++)
		{
			if(minNum>data[i])
			{
				minNum= data[i];
			}
		}
		System.out.println(" The Minimum digit Element present in the Array is : "+ minNum);
	}
	
	public static void main(String[] args) {
		Assignment50_PrintMinNumberFromArray assignment50_PrintMinNumberFromArray_1 = new Assignment50_PrintMinNumberFromArray();
		int[] data = {44,45,22,25,47,29,46};
		assignment50_PrintMinNumberFromArray_1.printMinNumber(data);
		int[] data_1 = {-44,-45,-22,-25,-47,-29,-46};
		assignment50_PrintMinNumberFromArray_1.printMinNumber(data_1);
	}
}
