package titiksha;

public class Sumofnumber {
 int sum=0;
 int count=0;
 	void sumCountOfNumber(int startrange ,int endrange) {
 		for(int num=startrange;num<=endrange;num++) {
 			if(num %3==0 && num%5==0) {
 				sum=sum+num;
 				count++;
 				System.out.println("Numbers divisible by 3 and 5 are : " + num);
 			}
 		}
 		System.out.println("\n"+"Sum of numbers are : " + sum);
 		System.out.println("\n"+"Total count is : " + count);
 	}
 	
 	public static void main(String[] args) {
 		Sumofnumber sumofnumber=new Sumofnumber();
 		sumofnumber.sumCountOfNumber(3,70);
 	}
 }

