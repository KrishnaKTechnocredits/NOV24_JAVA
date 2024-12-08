package pratiksha;


public class Assignment11 {
		/*Write 2 methods, one method to find maximum number from 2 numbers,
		other to find minimum number from given 2 numbers.
		sample input :
		num1 : 10
		num2 : 17
		output : 10 is smaller between 10 and 17.

		sample input :
		num1 : 10
		num2 : 17
		output : 17 is bigger between 10 and 17.*/
		
		void maxNumber(int num1,int num2) {
			if(num1<num2) {
				System.out.println("10 is smaller between 10 & 17");
			}
		}
		void minNumber(int num1, int num2) {
			if(num1<num2) {
				System.out.println("17 is bigger between 10 and 17");
			}
		}
		public static void main(String[] args) {
			Assignment11 Assi = new Assignment11();
			Assi.maxNumber(10, 17);
			Assi.minNumber(10, 17);
			}
	}

