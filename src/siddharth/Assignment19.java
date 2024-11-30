package siddharth;

public class Assignment19 {
	
	void printReverseOrder(String str) {
		System.out.println("Input: "+str);
		System.out.println("Output: ");
		for(int index=(str.length()-1);index>=0;index--) {
			System.out.println(str.charAt(index));
		}
	}
	
	public static void main(String[] args) {
		Assignment19 assignment19 = new Assignment19();
		assignment19.printReverseOrder("te ch3no");
	}

}
