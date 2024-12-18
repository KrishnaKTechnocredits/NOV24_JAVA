package imran.ArrayPrograms;

public class Assignment55_ReturnUnionOfArray {

	int[] returnUnionOfArray(int[] data, int[] data_1)
	{
		int count =0;
		int[] newArr = new int [data.length + data_1.length];
		System.out.println("The First array is :");
		for(int i=0;i<=data.length-1;i++)
		{
			newArr[count] = data[i];
			count++;
			System.out.print(data[i] + "  ");
		}
		System.out.println(" ");
		System.out.println("The Second Array is :");
		for(int k=0;k<=data_1.length-1;k++)
		{
			newArr[count] = data[k];
			count++;
			System.out.print(data_1[k] + "  ");
		}
		System.out.println(" ");
		return newArr;
	}
	
	public static void main(String[] args) {
		Assignment55_ReturnUnionOfArray assignment55_ReturnUnionOfArray_1 = new Assignment55_ReturnUnionOfArray();
		int[] data_1 = {10,19,18};
		int[] data_2 = {99,8};
		int[] unionArray = assignment55_ReturnUnionOfArray_1.returnUnionOfArray(data_1, data_2);
		System.out.println(" The Union of Two Arrays are as follows");
		for(int i =0;i<=unionArray.length-1;i++)
		{
			System.out.println(unionArray[i]);
		}
	}
}
