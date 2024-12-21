package imran.ArrayPrograms;

public class Assignment56_ReturnMaxNumberArrayFrom2Array {

	int[] returnMaxNumArray(int[] data, int[] data1)
	{
		int[] newArray = new int[data.length];
		System.out.println("The First Array is : " );
		for(int i=0;i<=data.length-1;i++)
		{
			System.out.print(data[i] + " " );
		}
		System.out.println(" ");
		System.out.println("The Second Array is : " );
		for(int i=0;i<=data.length-1;i++)
		{
			System.out.print(data1[i] + " ");
		}
		if(data.length == data1.length)
		{
			for(int i= 0;i<=data.length-1;i++)
			{
				if(data[i]>= data1[i])
				{
					newArray[i]= data[i];
				} 
				else
				{
					newArray[i] = data1[i];
				}
			}
		}
		return newArray;
	}
	
	public static void main(String[] args) {
		Assignment56_ReturnMaxNumberArrayFrom2Array  assignment56_ReturnMaxNumberArrayFrom2Array_1 = new Assignment56_ReturnMaxNumberArrayFrom2Array ();
		int[] arr1 = {10,55,22,77,88};
		int[] arr2 = {5,102,28,77,18};
		int[] maxArray = assignment56_ReturnMaxNumberArrayFrom2Array_1.returnMaxNumArray(arr1, arr2);
		System.out.println(" ");
		System.out.println("The New Compared MAx Number Array from Above Array is : " );
		for(int i=0;i<=maxArray.length-1;i++)
		{
			System.out.print(maxArray[i] + " ");
		}
		
	}
}
