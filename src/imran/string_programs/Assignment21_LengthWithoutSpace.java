package imran.string_programs;

public class Assignment21_LengthWithoutSpace {
	
	int count=0;
	void getData(String data)
	{
		System.out.println("The Given String is :" + data);
		for(int i=0;i<=data.length()-1;i++)
		{
			char ch = data.charAt(i);
			if(ch==' ')
			{
				count++;
			}
		}
		int len = data.length()- count;
		System.out.println("The Total length of the String is :"+ data.length());
		System.out.println("The Total length of the String without Spaces is :"+ len);
		System.out.println("The number of Spaces available in the String is :"+ count);
	}
	
	public static void main(String[] args) {
		Assignment21_LengthWithoutSpace assignment21_LengthWithoutSpace_1 =new Assignment21_LengthWithoutSpace();
		assignment21_LengthWithoutSpace_1.getData("Imran Ahmed Ansari");
	}
}
