package roshan;

public class SumAllNumber {
	
	static void method1 (int startRange,int endRange) {
		int sum=0,count=0,num=0;
		
		for (num=startRange ;num<= endRange ; num++) {      //in loop inilization was mistake made  >>(startRange = num ; endRange<= num ; num++)
			if(num % 5==0 && num % 3==0) {                     
			sum = num + sum;
			count++;
			}
		}
		
		System.out.println("In the range 1 to 70, calculated sum is" +" "+ sum);
		System.out.println("In the range 1 to 70,"+ " " + count + " "+ "numbers are divisible by 3 and 5.");
	}
public static void main(String[] args) {
	    SumAllNumber.method1  (1,70);
}
}


