/*Write 2 methods, one method to find maximum number from 2 numbers,
other to find minimum number from given 2 numbers.
sample input :
num1 : 10
num2 : 17
output : 10 is smaller between 10 and 17.mn

sample input :
num1 : 10
num2 : 17
output : 17 is bigger between 10 and 17.
 */
package nitesh.conditions;

class MinMaxFromTwoNum{
	int num1;
	int num2;

	void minNumber(int num1, int num2){
		this.num1 = num1;
		this.num2 =num2;
		if(num1 < num2){
			System.out.println(num1 + " is smaller between 10 and 17.");
		} 
		else 
			System.out.println(num2 + " is smaller between 10 and 17");
	}
	void maxNumber(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
		if(num1>num2){
			System.out.println(num1 +" is bigger between 10 and 17" );
		}
		else
			System.out.println(num2 + " is bigger between 10 and 17");
	}
	public static void main(String[] args){
		MinMaxFromTwoNum minmaxfromtwonum = new MinMaxFromTwoNum();
		minmaxfromtwonum.minNumber(10,17);
		minmaxfromtwonum.maxNumber(10,17);
	} 
}