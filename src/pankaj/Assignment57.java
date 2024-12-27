package pankaj;

class Assignment57
{
		void maxLength(String[] arr)
		{
			String str=arr[0];
			int len=str.length();
			for(int i=0;i<=arr.length-1;i++)
			{
				if(len<arr[i].length())
				{
					str=arr[i];
					len=str.length();
				}
			
			}
			System.out.println(str+" :: "+len);
		}
		
		public static void main(String[] args)
		{
			String[] arr={"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
			Assignment57 A=new Assignment57();
			A.maxLength(arr);
		}
	
	
}