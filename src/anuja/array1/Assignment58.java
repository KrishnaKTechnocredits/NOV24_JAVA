package anuja.array1;
/*Return the second maximum length string from given array.
If you find multiple string as second maximum, return the last second maximum.

input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
ouput : PuGlobantne*/

public class Assignment58 {
	public void getLastBuOneMaxStringI(String[] names) {
		
		String maxlenStr = names[0];//assume 0th index string is max
		int maxLen = maxlenStr.length(); //maxlen variable
		String secondMaxlenStr = names[1]; //assume 1st index string is second max
		int secondMaxlen = secondMaxlenStr.length();//length of second max
		
		//logic to check between first 2 index
		
		if(names[0].length() < names[1].length()) {
			maxLen = names[1].length();
			maxlenStr = names[1];
			secondMaxlen = names[0].length();
			secondMaxlenStr = names[0];
		}
		
		//Check between all pending index of array, use for loop 
		//make sure add else condition what if first condition dose now work
		for(int i = 2 ; i<names.length ; i++) {
			if(names[i].length() > maxLen) {//max is small now, then update max with current and sencond max with max
				secondMaxlen = maxLen ;//shift max into second max
				secondMaxlenStr = maxlenStr;
				maxLen = names[i].length();
				maxlenStr = names[i];

			}
			else if(names[i].length() > secondMaxlen) {//if second max is lesser than current
				secondMaxlen = names[i].length();
				secondMaxlenStr = names[i];
				
			}
			else if(names[i].length() == secondMaxlen ) {
				secondMaxlen = names[i].length();
				secondMaxlenStr = names[i];
			}
		}
		
		
		
		System.out.println("Second last max len string is: " +secondMaxlenStr +"-->" +secondMaxlenStr.length());
	}
	
	public static void main(String[] args) {
		Assignment58 assignment58 = new Assignment58();
		String[] names =  {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
		assignment58.getLastBuOneMaxStringI(names);
	}
}
