//Assignment - 19 : 24rd Nov'2024 [20 mins]
//Print all the characters of given string in reverse order. 
//
//input : te ch3no
//output : o
//         n
//         3
//         h
//         c
//		 
//         e 
//         t  		 

package komal.String;

public class Assignment19ReverseOrder {

	void getReverseOrderStr(String str) {
		System.out.print("String with reverse order : ");
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}

	public static void main(String[] args) {
		Assignment19ReverseOrder reverseOrder = new Assignment19ReverseOrder();
		reverseOrder.getReverseOrderStr("te ch3no");
	}

}
