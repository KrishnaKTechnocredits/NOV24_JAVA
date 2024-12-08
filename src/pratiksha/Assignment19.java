package pratiksha;

public class Assignment19 {
	/* 24rd Nov'2024 [18 mins]
Print all the characters of given string in reverse order. 

input : te ch3no
output : o
         n
		 3
		 h
         c
		 
         e 
         t  	*/
	void stringReverseOrder() {
		
		String str="te ch3no";
		System.out.println(str.length());
		
		for(int i=str.length()-1;i>=0;i--) {
			
			char ch = str.charAt(i);
			
			System.out.println(ch);
					
		}
	}
public static void main(String[] args) {
	Assignment19 assign19 = new Assignment19();
	assign19.stringReverseOrder();
}

}
