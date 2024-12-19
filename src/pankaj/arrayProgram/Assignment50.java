package pankaj.arrayProgram;

public class Assignment50 {
	
	int minNum(int[] arr)
	{
		int MinNum=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(MinNum>arr[i])
			{
				MinNum=arr[i];
			}
		}
		System.out.println("The minimum Numbers are==>> "+MinNum);
		return MinNum;
	}
	public static void main(String[] args)
	{
		int[] arrOne={44,45,22,25,47,29,46};
		int[] arrTwo={-44,-45,-22,-25,-47,29,46};
		Assignment50 Aone=new Assignment50();
		Aone.minNum(arrOne);
		Aone.minNum(arrTwo);
		
		
	}
	

}
