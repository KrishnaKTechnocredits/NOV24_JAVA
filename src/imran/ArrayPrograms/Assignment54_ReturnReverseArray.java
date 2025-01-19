package imran.ArrayPrograms;

public class Assignment54_ReturnReverseArray {
	
	int[] returnReverseArray(int[] data)
	{
		int[] newArr = new int[data.length];
		System.out.println(" The Given Array is ");
		for(int i=0,j=data.length-1;i<=data.length-1 && j>=0;i++,j--)
		{
			newArr[j]= data[i];
			System.out.println(data[i]);
		}
		System.out.println(" ");
		return newArr;
		
	}
	
	public static void main(String[] args) {
		Assignment54_ReturnReverseArray assignment54_ReturnReverseArray_1 = new Assignment54_ReturnReverseArray();
		int[] data = {10,34,22,16,19,99};
		int[] revArray = assignment54_ReturnReverseArray_1.returnReverseArray(data);
		System.out.println(" The Reverse array is ");
		for(int k=0;k<=revArray.length-1;k++)
		{
			System.out.println(revArray[k]);
		}
	}
}
