package vrushali.arrayProgram;

//Assignment - 50 : 16th Dec'2024 [10 mins] [imp]
//
//return the maximum number from given array. 
//
//input : {44,45,22,25,47,29,46}
//output : 22
//
//
//input : {-44,-45,-22,-25,-47,29,46}
//output : -47

public class PrintMinNoFromArray {
	int getMinNumberFromArray(int[] numArray)
	{
		int minNo=numArray[0];
		for(int i=0;i<numArray.length;i++)
		{
			if(minNo>numArray[i])
			{
				minNo=numArray[i];
			}
		}
		return minNo;
	}
	public static void main(String[] args) {
		int[] numArray1 = { 44, 45, 22, 25, 47, 29, 46 };
		int[] numArray2 = { -44, -45, -22, -25, -47, -29, -46 };
		int minNo = 0;
		PrintMinNoFromArray printMinNoFromArray = new PrintMinNoFromArray();
		minNo = printMinNoFromArray.getMinNumberFromArray(numArray1);
		System.out.println("Minimum Number From Array1 iS :--> " + minNo);
		minNo = printMinNoFromArray.getMinNumberFromArray(numArray2);
		System.out.println("Minimum Number From Array2 iS :--> " + minNo);
	}
}
