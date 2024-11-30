/*
Write only one program having the following methods.
1. print all even numbers in a user defined range.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 15
Output : Even numbers are:
10
12
14
printEvenNum(int startRange, int endRange){
for(int num=startRange; num<=endRange; num++){
}
}
printEvenNum(int startRange, int endRange){
for(; startRange<=endRange; startRange++){
}
}
*/
package ajay;

public class Assignment12 {
	
	void evenNumber(int startRange,int endRange) {
		System.out.println("All Even Numbers from " +startRange +" to " +endRange +" for Menthod evenNumber are: ");
		for(int i=startRange;i<=endRange;i++) {
			if(i%2==0){
				System.out.println(i);
			}
		}	
	}
	void evenNumber1(int startRange,int endRange) {
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("All Even Numbers from " +startRange +" to " +endRange +" for Method evenNumber1 are : ");
		int i=startRange;
		for(;i<=endRange;i++) {
			if(i%2==0){
				System.out.println(i);
			}
		}	
	}

	public static void main(String[] args) {
		Assignment12 assignment12=new Assignment12();
		assignment12.evenNumber(1,10);
		assignment12.evenNumber1(11,20);
	}

}
