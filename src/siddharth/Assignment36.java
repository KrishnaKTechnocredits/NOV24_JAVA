package siddharth;

//Assignment - 36 : 8th Dec [10 mins] print table for 1 to 5 numbers.

public class Assignment36 {
	
	void printTable() {
		int mult=0;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				mult = i*j;
				System.out.println(i+" X "+j+" = "+mult);
			}
			System.out.println("-------------");
		}
		
	}
	
	public static void main(String[] args) {
		Assignment36 assignment36 = new Assignment36();
		assignment36.printTable();
	}
	
}
