package prem;
	
public class Assignment14 {
	static int numTotal;
	static int count;

	void divisible(int num1,int num2) {
		for(int num = num1;num <= num2;num++) {
			if (num%5==0 && num %3==0) {
			numTotal = numTotal + num; 
			count++;
			}
		}	
		System.out.println("In the range"+ num1 +" to "+ num2+" ,calculated sum is " +numTotal);
		System.out.println("In the range"+ num1 +" to "+ num2+ ", "+ count +" are divisible number by 3 &5");
	   }
	
	public static void main(String[] args){
		Assignment14 assign14 = new Assignment14();
		assign14.divisible(1,70);
	}

}
