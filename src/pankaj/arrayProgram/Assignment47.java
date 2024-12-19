package pankaj.arrayProgram;

public class Assignment47 {
	void middleChar(String[] input)
	{
		
		for(int i=0;i<input.length;i++)
		{
			
			String temp=input[i];
			int len=temp.length();
			if(len>6)
			{
				System.out.println(temp);
			}
		//	System.out.println(temp+" ==>>"+temp.charAt(len));
			
		}
	}
	


	public static void main(String[]args)
	{
		String[] temp= {"Rohan", "Premlata", "Anuja", "Fazrana"};
		Assignment47 A=new Assignment47();
		A.middleChar(temp);
	}

}
