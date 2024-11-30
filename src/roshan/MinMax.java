package roshan;

public class MinMax {
	
	void maxNo(int num1,int num2) {
	 if(num1>num2) {
		 System.out.println("Max no is " + num1);
	 }
	 else if (num1<num2){
		  System.out.println("Max no is " + num2);

	 }

	}
	
	
	void minNo (int num1,int num2){
		 if(num1>num2) {
			 System.out.println("Min no is " + num2);
		 }
		 else if (num1<num2){
			 
			 System.out.println("Min no is " + num1);

		 }
		
		
	}
	public static void main(String[] args) {
		MinMax minmax = new MinMax();
		minmax.maxNo(5,10);
		minmax.minNo(2,12);
	}
}
