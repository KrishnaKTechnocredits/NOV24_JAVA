package pankaj.arrayProgram;

public class Assignment46 {
	
	void middleChar(String[] input)
	{
		
		for(int i=0;i<input.length;i++)
		{
			
		//	String temp=input[i];
		//	int len=temp.length()/2;
		//	System.out.println(temp+" ==>>"+temp.charAt(len));
			int len=input[i].length()/2;
			System.out.println(input[i]+"==>>"+input[i].charAt(len));
			
		}
	}
	


	public static void main(String[]args)
	{
		String[] temp= {"Rohan", "Premlata", "Anuja", "Fazrana"};
		Assignment46 A=new Assignment46();
		A.middleChar(temp);
		
		
	}
}
