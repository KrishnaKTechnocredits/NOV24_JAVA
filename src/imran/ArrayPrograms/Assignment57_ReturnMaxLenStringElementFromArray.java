package imran.ArrayPrograms;

public class Assignment57_ReturnMaxLenStringElementFromArray {

	String returnMaxLenElement(String[] data)
	{
		int maxLenString = data[0].length();
		String maxLenElement = data[0];
		for(int i=1;i<data.length-1;i++)
		{
			if(maxLenString<=data[i].length())
			{
				maxLenString = data[i].length();
				maxLenElement = data[i];
			}
		}
		return maxLenElement;
	}
	
	public static void main(String[] args) {
		Assignment57_ReturnMaxLenStringElementFromArray assignment57_ReturnMaxLenStringElementFromArray_1 = new Assignment57_ReturnMaxLenStringElementFromArray();
		String[] arr = {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
		String maxLenArrayElement = assignment57_ReturnMaxLenStringElementFromArray_1.returnMaxLenElement(arr);
		System.out.println("The Element having Maximum Length in the Array is :"+ maxLenArrayElement);
	}
}
