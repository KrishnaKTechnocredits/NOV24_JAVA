package pankaj.arrayProgram;

public class Assignment48 {

	void positiveNum(int[] arr)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				System.out.println(arr[i]);
				count++;
			}
		}
		System.out.println("Total count of positive numbers==>>"+count);
	}

	public static void main(String[] args) {
		 int[] data= {10,30,-45,66,-10};
		 Assignment48 A=new Assignment48();
		 A.positiveNum(data);
		 
	}
}
