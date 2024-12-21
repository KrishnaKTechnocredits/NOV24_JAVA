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
				for(int j=1;j<=5;j++) {
					if(j%2==1) {
						System.out.print("#");
					}else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
			if(i%2==0) {
				for(int j=1;j<=3;j++) {
					if(j%2==1) {
						System.out.print("#");
					}else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		}
		
	}
	public static void main(String[] args) {
		Assignment45 assignment45 = new Assignment45();
		assignment45.printPattern();
	}
}