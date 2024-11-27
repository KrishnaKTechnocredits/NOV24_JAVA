package titiksha;

public class Weekdaywithloop {
	
	void weekday(int num) {
		
		if(num>1 && num<=5) {
			System.out.println("It's a weekday");
			if(num==1) {
				System.out.println("Monday");
			}
			else if(num==2) {
				System.out.println("Tuesday");
			}
			else if(num==3) {
				System.out.println("Wednesday");
			}
			else if(num==4) {
				System.out.println("Thursday");
			}
			else if(num==5) {
				System.out.println("Friday");
			}
		}
			else if (num==6 || num==7) {
				System.out.println("\n"+"Its weekend");
				if(num==6) {
					System.out.println("Saturday");
				}
				else if(num==7) {
					System.out.println("Sunday");
				}
			}
			else {
				System.out.println("\n"+"Invalid weekday");
			}
		}
	
	public static void main(String[] args) {
		Weekdaywithloop weekdaywithloop=new Weekdaywithloop();
		weekdaywithloop.weekday(2);
		weekdaywithloop.weekday(6);
		weekdaywithloop.weekday(8);
		
	}
}
	


