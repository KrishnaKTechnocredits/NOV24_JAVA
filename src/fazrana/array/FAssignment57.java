//Assignment - 57 : 21th Dec'2024 [15 mins]
//Return the maximum length string from given array.
//
//input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
//ouput : Technocredits
//10min
package fazrana.array;

public class FAssignment57 {

	String getMaxLengthString(String[] array) {
		System.out.print("Input array: {"+array[0]);
		String maxLengthString=array[0];
		for(int i=1;i< array.length;i++) {
			System.out.print(array[i]+",");
			if(maxLengthString.length()<array[i].length()) {
				maxLengthString=array[i];
			}
		}System.out.println("}");
		return ("Max length string is "+ maxLengthString);
	}
	
	public static void main(String[] args) {
		String[] array= {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
		FAssignment57 fassignment57=new FAssignment57();
		System.out.println(fassignment57.getMaxLengthString(array));
	}
}
