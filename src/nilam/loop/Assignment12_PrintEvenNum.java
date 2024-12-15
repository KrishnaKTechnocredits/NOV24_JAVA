package nilam.loop;

public class Assignment12_PrintEvenNum {
	
	void printEvenNum(int startRange,int endRange) {	
		System.out.println("Even numbers are:");
		for(;startRange<=endRange;startRange++) {
			if (startRange%2==0) {
				System.out.println(startRange);				
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment12_PrintEvenNum assignment12_printevennum=new Assignment12_PrintEvenNum();
		assignment12_printevennum.printEvenNum(10,20);		
	}
}


/*public class Assignment12_PrintEvenNum {
	//print even numbers from the given range
	
	void printEvenNum(int startRange,int endRange) {	
		System.out.println("Even numbers are:");
		for(int start=startRange;start<=endRange;start++) {
		
			if(start%2==0) {
				System.out.println(start);
			}
		}
	}
	
	public static void main(String[] args) {		
		Assignment12_PrintEvenNum assignment12_printevennum=new Assignment12_PrintEvenNum();
		assignment12_printevennum.printEvenNum(10,20);		
	}
}*/

