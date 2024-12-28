/*Return the second maximum length string from given array.
If you find multiple string as second maximum, return the last second maximum.*/

package imran.ArrayPrograms;

public class Assignment58_ReturnSecondMaxLenStringFromArray {

	String returnSecondMaxLenElementString(String[] data)
	{
		int maxLenString = data[0].length();
		int secondMaxLenString = data[1].length();
		String maxLenStringElement = data[0];
		String secondMaxLenStringElement = data[1];
	
		if(maxLenString<secondMaxLenString)
		{
			maxLenString = data[1].length();
			maxLenStringElement = data[1];
			secondMaxLenString = data[0].length();
			secondMaxLenStringElement = data[0];
		}
	
		for(int i=2;i<=data.length-1;i++)
		{
			if(maxLenString < data[i].length())
			{
				secondMaxLenString = maxLenString;
				secondMaxLenStringElement = maxLenStringElement;
				maxLenString = data[i].length();
				maxLenStringElement = data[i];
			}
			else if(secondMaxLenString <= data[i].length())
			{
				secondMaxLenString = data[i].length();
				secondMaxLenStringElement = data[i];
			}
		}
		return secondMaxLenStringElement;
	}
	
	public static void main(String[] args) {
		Assignment58_ReturnSecondMaxLenStringFromArray assignment58_ReturnSecondMaxLenStringFromArray_1 = new Assignment58_ReturnSecondMaxLenStringFromArray();
		String[] arr = {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
		String secondMaxArrayElement = assignment58_ReturnSecondMaxLenStringFromArray_1.returnSecondMaxLenElementString(arr);
		System.out.println("The Element having Second Maximum Length, last Occurence in the Array  is : " + secondMaxArrayElement);
	}
}
