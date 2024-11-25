package imran.string_programs;

public class Assignment_TotalNumberDigit {

	int count=0;
	void getData(String data)
	{
		System.out.println("The Given String is : "+ data);
		for(int i=0;i<data.length();i++)
		{
			char ch = data.charAt(i);
			if(Character.isDigit(ch)== true)
			{
				count++;
			}
		}
		System.out.println("The total number of Digits present in a string is "+ count);
	}
	
	public static void main(String[] args) {
		Assignment_TotalNumberDigit assignment_TotalNumberDigit_1 =new Assignment_TotalNumberDigit();
		assignment_TotalNumberDigit_1.getData("Imran1706Ansari1996");
	}
}
