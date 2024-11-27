package deepali.stringDemo;
/*Assignment - 19 : 24rd Nov'2024 [20 mins]
Print all the characters of given string in reverse order. 

input : te ch3no
output : o
         n
         3
         h
         c
		 
         e 
         t
}
*/
public class Assignment_19 {
	void getCharReverse(String str){
		for(int index=str.length()-1;index>=0;index--) {
			System.out.println(str.charAt(index));
		}
	}
	public static void main(String [] args) {
		Assignment_19 assignment = new Assignment_19();
		assignment.getCharReverse("te ch3no");
	}
}
