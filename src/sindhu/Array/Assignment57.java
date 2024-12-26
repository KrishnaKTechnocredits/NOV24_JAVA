/*Return the maximum length string from given array.

input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
ouput : Technocredits*/

package sindhu.Array;

public class Assignment57 {
	
	String getMaxStringFromArray(String[] ip) {
		String str = ip[0];
		for(int i=1; i<ip.length; i++) {			
			if(str.length()<ip[i].length()) {
				 str = ip[i];			
			}
		}
		return str;
	}
	
	public static void main(String[] args) {
		String[] input = {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
		Assignment57 assign57 = new Assignment57();
		String str = assign57.getMaxStringFromArray(input);
		System.out.println("Max length String in given array is: "+str);
	}
}
