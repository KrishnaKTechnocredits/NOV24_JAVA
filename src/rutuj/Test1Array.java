package rutuj;

public class Test1Array {
	
	void Sum(int[] num)
	{
		int[] output= new int[num.length];
		
		int TotalSum=0;
		for(int i =0;i<num.length;i++)
		{
			TotalSum = TotalSum+num[i];
			
		}
		for(int i=0;i<num.length;i++)
		{
			output[i] = TotalSum - num[i];
			System.out.println(output[i]);
		}
			
		
	}
	public static void main(String[] args)
	{
		Test1Array ex1 = new Test1Array();
		int[] Data = {3,5,7,1,9};
		ex1.Sum(Data);
	}

}
