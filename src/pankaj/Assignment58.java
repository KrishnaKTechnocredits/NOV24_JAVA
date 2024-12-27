package pankaj;

public class Assignment58 {
	

	
	String[] secondMax(String[] arr)
	{
			String str=arr[0];
			
			String second=arr[1];
			
			
			
			
			if(str.length()<second.length())
			{
				str=arr[1];
				second=arr[0];
			}
			for(int i=1;i<arr.length;i++)
			{
					if(str.length()<arr[i].length())
					{
						second=str;
						str=arr[i];
					}
					else if(second.length()<=arr[i].length())
					{
						second=arr[i];	
						
					}
			}
			System.out.println(str+" : "+str.length()+" :: "+second+" : "+second.length());
			return arr;
			
		
	}
	public static void main(String[] args)
	{
			String[] arr={"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
			Assignment58 A=new Assignment58();
			A.secondMax(arr);
			
			
	}

}
