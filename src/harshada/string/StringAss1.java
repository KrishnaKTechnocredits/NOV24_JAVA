//Assignment - 19 : 24rd Nov'2024 [20 mins]
//Print all the characters of given string in reverse order. 
//
//input : te ch3no
//output : o
//         n
//		 3
//		 h
//         c
//		 
//         e 
//         t  		 


package harshada.string;

public class StringAss1 {
	
	void printStringInReverse(String str) {
		for(int i=str.length()-1;i>=0;i--) {
			System.out.println(str.charAt(i));
		}
	}
	public static void main(String[] args) {
		StringAss1 stringAss1=new StringAss1();
		stringAss1.printStringInReverse("te ch3no");
	}

}
