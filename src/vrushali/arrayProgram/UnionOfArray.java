package vrushali.arrayProgram;
//Assignment - 55 : 18th Dec'2024 [15-20 mins]
//
//return union of given two array.
//
//input : 
//{10,19,18}
//{99,8}
//
//output :  {10,19,18,99,8}

public class UnionOfArray {
	int[] returnUnionOfArray(int[] array1,int[] array2)
	{
		int length=array1.length+array2.length;
		int index=0;
		int[] finalArray=new int[length];
		for(int i=0;i<array1.length;i++)
		{
			finalArray[index]=array1[i];
			index++;
		}
		for(int i=0;i<array2.length;i++)
		{
			finalArray[index]=array2[i];
			index++;
		}
		return finalArray;
	}
	public static void main(String[] args) {
		UnionOfArray unionOfArray=new UnionOfArray();
		int[] array1= {10,19,18};
		int[] array2= {99,8};
		int length=array1.length+array2.length;
		int[] finalArray=new int[length];
		finalArray=unionOfArray.returnUnionOfArray(array1, array2);
		System.out.println("Union Of two array :--");
		for(int i=0;i<finalArray.length;i++)
		{
			System.out.println(finalArray[i]);
		}
		
	}

}
