package technocredits.loopdemo;

public class Example1 {
	
	void printData(String name) {
		for(int num=1;num<=5;num++) {
			if(num%2 == 0) {
				System.out.println(name + "-" + num);
			}	
		}
	}
	
	void printDataInRevOrder(String name) {
		for(int index=5;index>=1;index--) {
			System.out.println(name + "-" + index);
		}
	}
	
	public static void main(String[] args) {
		Example1 example1 = new Example1();
		example1.printData("Technocredits");
	}
}
