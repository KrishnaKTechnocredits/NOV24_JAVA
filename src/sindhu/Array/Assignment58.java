/*Return the second maximum length string from given array.
If you find multiple string as second maximum, return the last second maximum.

input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
ouput : PuGlobantne
19:45*/

package sindhu.Array;

public class Assignment58 {
	
	String getSecondMaxLengthString(String[] ip) {
		String MaxStr = ip[0];
		String SecMaxStr = ip[1];
		
		if(ip[1].length()>ip[0].length()) {
			MaxStr=ip[1];
			SecMaxStr=ip[0];
		}
		
		for(int i=2; i<ip.length; i++) {
			if(ip[i].length()>MaxStr.length()) {
				SecMaxStr = MaxStr;
				MaxStr = ip[i];
			}else if(ip[i].length()>=SecMaxStr.length()) {
				SecMaxStr = ip[i];
			}
		}
		return SecMaxStr;
	}
	
	public static void main(String[] args) {
		String[] input = {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
		Assignment58 assign58= new Assignment58();
		String SecMaxStr = assign58.getSecondMaxLengthString(input);
		System.out.println("second max string in given array is: "+SecMaxStr);
	}
}
