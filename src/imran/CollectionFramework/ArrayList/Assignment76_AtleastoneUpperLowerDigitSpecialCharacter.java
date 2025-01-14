/*
Assignment - 76 : 11th Jan
return the list of names having atleast one uppercase, one lowercase, one digit and one special character (_, !, #, $) in the name.

String[] arr = {"TechnOCrediTs", "TEch1n_o##", "Credits", "Tit!i1ksHa", "PUNE1#"};
output : {"TEch1n_o##", "Tit!i1ksHa"}
*/

package imran.CollectionFramework.ArrayList;
import java.util.*;

public class Assignment76_AtleastoneUpperLowerDigitSpecialCharacter {

	List<String> getatleststring1upperlowerspecialchar(String[] data)
	{
		List<String> arr = Arrays.asList(data);
		List<String> atleastuplowspechar = new ArrayList<String>();
		for(int i= 0;i<arr.size();i++)
		{
			boolean count;
			String element = arr.get(i);
			count = isatleastupperlowerspecialChar( element);
			if(count)
			{
				atleastuplowspechar.add(element);
			}
		}
		return atleastuplowspechar;
	}
	
	boolean isatleastupperlowerspecialChar(String data)
	{
		boolean flag=false;
		int uCount=0,lCount=0,dCount=0,spechar=0;
		for(int i=0; i<data.length();i++)
		{
			char ch = data.charAt(i);
			if(Character.isUpperCase(ch))
			{
				uCount++;
			}
			else if(Character.isLowerCase(ch))
			{
				lCount++;
			}
			else if(Character.isDigit(ch))
			{
				dCount++;
			}
			else if((ch == '_' || ch == '!' || ch == '#' || ch == '$'))
			{
				spechar++;
			}
		}
		if(uCount>0 && lCount>0 && dCount>0 && spechar>0)
		{
			flag = true;
		}
		return flag;
	}
	
	public static void main(String[] args) {
		Assignment76_AtleastoneUpperLowerDigitSpecialCharacter assignment76_AtleastoneUpperLowerDigitSpecialCharacter_1 = new Assignment76_AtleastoneUpperLowerDigitSpecialCharacter();
		String[] arr = {"TechnOCrediTs", "TEch1n_o##", "Credits", "Tit!i1ksHa", "PUNE1#"};
		System.out.println(" The Given Array is: " + Arrays.toString(arr));
		List<String> resultList = assignment76_AtleastoneUpperLowerDigitSpecialCharacter_1.getatleststring1upperlowerspecialchar(arr);
		System.out.println("The Resulting Array is : " + resultList);
	}
}
