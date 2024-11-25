package pankaj.stringAssignment;

public class Assignment22 {
	
	int count;
	
	int getDigitCount(String str)
	{
		for(int i=0;i<=str.length()-1;i++)
		{
			boolean flag=Character.isDigit(str.charAt(i));
			if(flag==true)
			{
				count++;
			}
			
		}
		return count;
		
	}

	public static void main(String[] args) {
		
			Assignment22 A22=new Assignment22();
			int ans=A22.getDigitCount("aa1kan33ks4h5a");
			System.out.println("Total " +ans+ " digits are there in given input");
			
	}

}
