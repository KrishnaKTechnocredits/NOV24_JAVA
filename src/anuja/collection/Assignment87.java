package anuja.collection;

import java.util.*;

/*HashSet<String> setOfNames = new HashSet<String>();
		setOfNames.add("techno");
		setOfNames.add("credits");
		setOfNames.add("rushikesh");
		setOfNames.add("krishna");
 * */
public class Assignment87 {

	public static void main(String[] args) {
		Assignment87 assignment87 = new Assignment87();
		
		Set<String> setOfNames = new HashSet<String>();
		setOfNames.add("techno");
		setOfNames.add("credits");
		setOfNames.add("rushikesh");
		setOfNames.add("krishna");
		setOfNames.add("krishna");

		System.out.println("Input set is: \n " +setOfNames +"\n");
		
		//create new set to store the resul
		System.out.println("Output if Set is used:");
		Set<String> outputSet = new HashSet<String>();
		outputSet = assignment87.returnSet(setOfNames);
		System.out.println("Output set is: \n " +outputSet);
		System.out.println("-----------------------------------------------");
		
		//create new list to store the output.
		List<String> outputList = new ArrayList<String>();
		System.out.println("Output if list is used : ");
		outputList = assignment87.returnList(setOfNames);
		System.out.println("Output set is: \n " +outputList +"\n");


	}

	private Set<String> returnSet(Set<String> inputSet) {
		//create one set to return to the main method
		Set<String> outputSet = new HashSet<String>();
		String vowels = "AEIOUaeiou" ;
		//always use enhanced for loop to iterate through set
		for(String name : inputSet) {
			//we compare lastchar to string so need to convert char to string first hence use character class method
			String lastChar = Character.toString(name.charAt(name.length()-1));
			if(vowels.contains(lastChar)) {
				outputSet.add(name);
			}
			
		}
		
		return outputSet;
	}
	
	//its possible to return the list also 
	
	private List<String> returnList(Set<String> inputSet) {
		//create one set to return to the main method
		List<String> outputList = new ArrayList<String>();
		String vowels = "AEIOUaeiou" ;
		//always use enhanced for loop to iterate through set
		for(String name : inputSet) {
			//we compare lastchar to string so need to convert char to string first hence use character class method
			String lastChar = Character.toString(name.charAt(name.length()-1));
			if(vowels.contains(lastChar)) {
				outputList.add(name);
			}
			
		}
		
		return outputList;
		
	}
}
