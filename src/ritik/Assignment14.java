//Assignment - 14 : 21st Nov'2024 [15 mins]
//
//On user defined range print sum of all the number which is divisible by 3 & 5, and print count of numbers too.
//
//Hint : pass start and end index as a parameter.
//
//Input : Range -> 1 to 60
//Output : In the range 1 to 70, calculated sum is 150
//         In the range 1 to 70, 4 numbers are divisible by 3 and 5.

package ritik;

public class Assignment14 {
	int sum =0;	//15,45,90,150
	int count =0; //1, 2,3,4
	
	void m1(int startRange, int EndDate){
		for (int num=startRange;num<=EndDate;num++) {
			if(num%3==0 && num%5==0) {
				sum = sum + num;
				count++;				
			}
		}System.out.println("In the range of "+startRange+"to"+EndDate+" ,calculated sum is "+sum);
		System.out.println("In the range of "+startRange+"to"+EndDate+","+count +"numbers are divisible by 3 and 5");
	}
	
	public static void main(String[] args) {
		Assignment14 assignment14 = new Assignment14();
		assignment14.m1(1,70);
	}
}
