/*print all the second maximum length string from given array.

input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
ouput : GlobantPune
        PuneGlobant
		PuGlobantne */

package sindhu.Array;

public class Assignment59 {
	
	void getAllSecMaxString(String[] ip) {
		String MaxStr = ip[0];
		String SecMaxStr  = ip[1];
		
		if(SecMaxStr.length()>MaxStr.length()) {
			MaxStr = ip[1];
			SecMaxStr = ip[0];
		}
		
		for(int i=2; i<ip.length; i++) {
			if(ip[i].length()>MaxStr.length()) {
				SecMaxStr = MaxStr;
				MaxStr = ip[i];
			}else if(ip[i].length()>=SecMaxStr.length()) {
				SecMaxStr = ip[i];
			}	
		}
		displayAllSecMax(ip, SecMaxStr.length());
	}
	
	void displayAllSecMax(String[] ip, int targetLength) {
		for(int j=0; j<ip.length; j++) {
			if(ip[j].length()== targetLength) {
				System.out.println(ip[j]);
			}
		}
	}
	
	public static void main(String[] args) {
		String[] input = {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
		Assignment59 assign59 = new Assignment59();
		System.out.println("All secondmax String in given array: ");
		assign59.getAllSecMaxString(input);
		
	}
}
