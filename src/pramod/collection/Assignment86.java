/*
Assignment - 86: 14th Jan

Remove all the names from list having length less than or equal to 5 characters. 

input : ["Aaruhi","Ansh", "Akanksha", "Eva", "Kishor"]
output : ["Aaruhi", "Akanksha", "Kishor"]
*/
package pramod.collection;
import java.util.*;
class Assignment86{

	List<String> getNames(String[] input)throws Exception{
		List<String> myList = new ArrayList<String>(Arrays.asList(input));
		for(int i = 0; i< myList.size(); i++){
			String name = myList.get(i);
			if(name.length()<=5)
			{
				myList.remove(name);
				i--;
			}
		}
		return myList;
	}

	public static void main(String[] args){
		String[] input = {"Aaruhi","Ansh", "Akanksha", "Eva", "Kishor"};
		System.out.println("Given names are :" + Arrays.toString(input));
		try{
		List<String> ans = new Assignment86().getNames(input);
		System.out.println("Names more than 5 characters :" +ans);
		}
		catch(Exception e){
			System.out.println("Error : "+ e.getMessage());
		}
	}
}