package siddharth;
/*
Assignment - 45 : 10th Dec 
#*#*#
#*#
#*#*#
#*#    */

public class Assignment45 {
	
	void printPattern() {
		for(int i=1;i<=4;i++) {
			if(i%2==1) {
				System.out.println("#*#*#");
			}else {
				System.out.println("#*#");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Assignment45 assignment45 = new Assignment45();
		assignment45.printPattern();
	}
}