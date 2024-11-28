package vrushali;

import java.util.Iterator;

//Print all the characters of given string in reverse order. 
//Assignment - 19 : 24rd Nov'2024 [20 mins]
//input : te ch3no
//output : o
//         n
//         3
//         h
//         c
//		 
//         e 
//         t  	

public class PrintCharInReverseOrder {
	
	void printStringInRevrseOrder(String str)
	{
		int length=str.length();
		int endIndex=length-1;
		char ch;
		
		for(int num=endIndex;endIndex>=0;endIndex--)
		{
			ch=str.charAt(endIndex);
			System.out.println(ch);
		}
	}

	public static void main(String[] args) {
		PrintCharInReverseOrder printCharInReverseOrder= new PrintCharInReverseOrder();
		printCharInReverseOrder.printStringInRevrseOrder("te ch3no");
	}
}
