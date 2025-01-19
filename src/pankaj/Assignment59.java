package pankaj;

public class Assignment59 {
	
	void secondMax(String[] arr)
	{
		String One =arr[0];
		String Second=arr[1];
		if(One.length()<Second.length())
		{
			One=arr[1];
			Second=arr[0];
		}
		for(int i=1;i<arr.length;i++)
		{
			if(One.length()<arr[i].length())
			{
				Second=One;
				One=arr[i];
			}
			else if(Second.length()<arr[i].length())
			{
				Second=arr[i];
			}
		}
		allSecondMax(arr,Second.length());
	}
	
	void allSecondMax(String[] arr,int targetlen)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].length()==targetlen)
			{
				System.out.println(arr[i]);
			}
		}
	}
	
	public static void main(String[] args)
	{
		String[] arr={"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
		Assignment59 A=new Assignment59();
		A.secondMax(arr);
	}

}
