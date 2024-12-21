package imran.ArrayPrograms;

public class Assignment59_PrintAllSecondMaxLengthElementFromArray {

	void printAllsecondMaxElement(String[] data)
	{
		int maxLenString = data[0].length();
		int secondMaxLenString = data[1].length();
		//String maxLenStringElement = data[0];
		//String secondMaxLenStringElement = data[1];
	
		if(maxLenString<secondMaxLenString)
		{
			maxLenString = data[1].length();
			//maxLenStringElement = data[1];
			secondMaxLenString = data[0].length();
			//secondMaxLenStringElement = data[0];
		}
	
		for(int i=2;i<=data.length-1;i++)
		{
			if(maxLenString < data[i].length())
			{
				secondMaxLenString = maxLenString;
				//secondMaxLenStringElement = maxLenStringElement;
				maxLenString = data[i].length();
				//maxLenStringElement = data[i];
			}
			else if(secondMaxLenString <data[i].length())
			{
				secondMaxLenString = data[i].length();
			//	secondMaxLenStringElement = data[i];
			}
		}
		for(int j=0; j<=data.length-1;j++)
		{
			if(data[j].length() == secondMaxLenString)
			{
				System.out.println(data[j]);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment59_PrintAllSecondMaxLengthElementFromArray assignment59_PrintAllSecondMaxLengthElementFromArray_1 = new Assignment59_PrintAllSecondMaxLengthElementFromArray();
		String[] arr= {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
		System.out.println("The Elements Having Secomd Maximum length in the Given Array are as Follows: ");
		assignment59_PrintAllSecondMaxLengthElementFromArray_1.printAllsecondMaxElement(arr);
	}
}
