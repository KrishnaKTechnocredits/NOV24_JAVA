package pankaj.arrayProgram;

public class Assignment52 {
	
		int[] minMax(int[] arr)
		{
			int[] output=new int[2];
			int maxvalue=arr[0],minvalue=arr[0];
			for(int i=0;i<arr.length;i++)
			{
				if(maxvalue<arr[i])
				{
					maxvalue=arr[i];
				}
				if(minvalue>arr[i])
				{
					minvalue=arr[i];
				}
			}
			output[0]=maxvalue;
			output[1]=minvalue;
			return output;
		}
		public static void main(String[] args)
		{
			int[] data= {44,45,22,25,47,29,46};
			Assignment52 A=new Assignment52();
			int[] num1= A.minMax(data);
			
			System.out.println("The max value is==>>"+num1[0]);
			System.out.println("The min value is==>>"+num1[1]);
		}
}
