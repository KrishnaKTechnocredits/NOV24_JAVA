package anuja.collection;
/*I am having students name in the array, I want to get the unique set of names
 *  and wants to print first and last name of the list.

String[] arr = {"Maulik", "Kanani", "Maulik", "Pune", "India", "Pune"};
output : [Maulik, Kanani, Pune, India
          First name of the list is -> Maulik
          Last name of the list is -> India*/
import java.util.*;
public class Assignment90 {
	public static void main(String[] args) {
		Assignment90  assignment90 = new Assignment90();
		String[] arr = {"Maulik", "Kanani", "Maulik", "Pune", "India", "Pune"};
		
		System.out.println("Input array is: " +Arrays.toString(arr) +"\n");
		assignment90.proccessArraytoSet(arr);
	}
	

	private void proccessArraytoSet (String[] arr) {
	List<String> list1 = new ArrayList<String>();
	list1 = Arrays.asList(arr);
	//use hashset to get only unique
	Set<String> newSet = new LinkedHashSet<String>(list1);
	//convert again into a list to get the index based output, pass set as a constructor
	List<String> uniqueNameList = new ArrayList<String>(newSet);
	System.out.println("Unique name list is: " +uniqueNameList +"\n");
	System.out.println("0th element is: " +uniqueNameList.get(0) + " --> "+"and last element is " +uniqueNameList.get(uniqueNameList.size()-1));

	}

}