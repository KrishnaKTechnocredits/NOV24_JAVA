/*
Assignment - 86: 14th Jan

Remove all the names from list having length less than or equal to 5 characters. 

input : ["Aaruhi","Ansh", "Akanksha", "Eva", "Kishor"]
output : ["Aaruhi", "Akanksha", "Kishor"]
*/

package imran.CollectionFramework.Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment86_RemoveNameLessThan5Char {

	void getElementListHavemoreThan5Char(String[] data)
	{
		List<String> list = new ArrayList<String>();
		for(int i=0; i<data.length;i++)
		{
			String temp= data[i];
			if(temp.length()>5)
			{
				list.add(temp);
			}
		}
		System.out.println(" The Result list is : " + list);
	}
	
	public static void main(String[] args) {
		String[] arr = {"Aaruhi","Ansh", "Akanksha", "Eva", "Kishor"};
		System.out.println(" The Given list is : " + Arrays.toString(arr));
		Assignment86_RemoveNameLessThan5Char assignment86_RemoveNameLessThan5Char_1 = new Assignment86_RemoveNameLessThan5Char();
		assignment86_RemoveNameLessThan5Char_1.getElementListHavemoreThan5Char(arr);
	}
}
