package pankaj.stringAssignment;

public class Practice1 {
	
	int sum=0;
	int positiveNum(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%5==0 && arr[i]%7==0)
			{
			//	System.out.println(arr[i]);
				sum=sum+arr[i];
			}
		}
    return sum;
   // System.out.println(""+sum);
}

	public static void main(String[] args) {
		Practice1 A=new Practice1();
		 int[] data= {44,22,45,25,21,29};
		 
		 A.positiveNum(data);
		 System.out.println(data);
		 
	}

}
