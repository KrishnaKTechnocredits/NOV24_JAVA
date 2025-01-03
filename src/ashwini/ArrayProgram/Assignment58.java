package ashwini.ArrayProgram;
/*
 Assignment - 58 : 21th Dec'2024 [15 mins]
Return the second maximum length string from given array.
If you find multiple string as second maximum, return the last second maximum.

input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
ouput : PuGlobantne
 */
public class Assignment58 {
	String secondMaxLenString(String[] arr) {
	String maxLen=arr[0],secondMaxLen=arr[1];
	if(arr[1].length()>arr[0].length()) {
		maxLen=arr[1];
		secondMaxLen=arr[0];
		}
	for(int index=2;index<arr.length;index++) {
		if(maxLen.length()<arr[index].length()) {
			secondMaxLen=maxLen;
			maxLen=arr[index];
		}else if(secondMaxLen.length()<=arr[index].length()) {
			secondMaxLen=arr[index];
		}
	}
	
	return secondMaxLen;
	}
	public static void main(String[] args) {
		String[] arr={"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
		Assignment58 a58 = new Assignment58();
		String secondMaxLen=a58.secondMaxLenString(arr);
		System.out.println(secondMaxLen);
	}

}
