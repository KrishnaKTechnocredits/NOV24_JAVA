package swapnil;

public class Assignment19 {
	
	void charrev(String str) {
		for(int a=str.length()-1;a>=0;a--) {
			System.out.println(str.charAt(a));
		}
	}

	public static void main(String[] args) {
		Assignment19 assignment19 = new Assignment19();
		assignment19.charrev("te ch3no");

	}

}



/*
 Assignment - 19 : 24rd Nov'2024 [20 mins]
Print all the characters of given string in reverse order. 

input : te ch3no
output : o
         n
         3
         h
         c
		 
         e 
         t  		 
 */