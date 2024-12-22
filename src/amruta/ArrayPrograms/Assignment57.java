package amruta.ArrayPrograms;
/*Return the maximum length string from given array.

input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
ouput : Technocredits*/
public class Assignment57 {

	public String getMaxLengthStringFromArray(String[] arr1) {
		String largeName = "";
		int maxLen = arr1[0].length();
		for(int i = 1 ; i<arr1.length ; i++) {
			if(arr1[i].length() > maxLen) {
				maxLen = arr1[i].length();
				largeName = arr1[i];

			}
		}
		return largeName;
	}
	
	public static void main(String[] args) {
		Assignment57 assignment57 = new Assignment57();
		String[] names = {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
		String largeName = assignment57.getMaxLengthStringFromArray(names);
		System.out.println("Max length string is " +largeName);
	}
}
