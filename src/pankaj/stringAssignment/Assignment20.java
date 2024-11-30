package pankaj.stringAssignment;

public class Assignment20 {
	
	int count;
	int getCharFreq(String str,char ch)
	{
		for(int index=0; index <= str.length()-1;index++)
		{
			if(str.charAt(index)==ch)
			{
				count++;
				
			}
			
		}
		return count;
	}

	public static void main(String[] args) {
		
		Assignment20 A20=new Assignment20();
		int ans=A20.getCharFreq("aakanksha", 'a');
		
		System.out.println(" The character are==>>"+ans);
		
		

	}

}
