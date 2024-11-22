
/*Assignment - 11 : 20th Nov'2024 [20 mins]
Write 2 methods, to find min and max one method to find maximum number from 2 numbers,
output should be : 10 is smaller between 10 and 17.
output : 17 is bigger between 10 and 17.*/
package anuja;

public class Assignment11 {
	// Method to print the large number of two numbers
	public void findMax(int x,int y) {
		if(x>y) {
			System.out.println(x +" is larger between " +x+ " and " +y+ ".");
			}
		else {
			System.out.println(y +" is larger between " +x+ " and  " +y+ ".");
		}
		System.out.println("------------------------ \n ");
		}
	
	//method to print small num of two numbers
	
	public void findMin(int x,int y) {
		if(x>y) {
			System.out.println(y +" is smaller between " +x+ " and " +y+ ".");
			}
		else {
			System.out.println(x +" is smaller between " +x+ " and " +y+ ".");
		}
		}
	
	public static void main(String[] args) {
		Assignment11 assignment11 = new Assignment11();
		assignment11.findMax(10,17);//find max
		assignment11.findMin(10,17);//find min

		
	}
}
