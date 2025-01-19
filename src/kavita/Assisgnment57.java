package kavita;

/*Assignment - 57 : 21th Dec'2024 [15 mins]
Return the maximum length string from given array.

input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
ouput : Technocredits
Time: 10m*/

public class Assisgnment57 {
	String getMaxLenString(String[] input) {
		String maxLenString=input[0];
		for(int i=1;i<input.length;i++) {
			if(maxLenString.length()<input[i].length()) {
				maxLenString=input[i];
			}
		}
		return maxLenString;
	}
	
	public static void main(String[] args) {
		Assisgnment57 assisgnment57=new Assisgnment57();
		String[] arr={"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
		String ans=assisgnment57.getMaxLenString(arr);
		System.out.println("The maximum length string from given array is : " +ans);
	}
}
