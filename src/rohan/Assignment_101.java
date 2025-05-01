/*
 * Assignment - 101 : 1st Feb'2025
On user defined numbers, find out the second largetest number. 
Hint : Use scanner.

 */

package rohan;
import java.util.*;
public class Assignment_101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_101 assignment = new Assignment_101();
		assignment.secondLarge();
		
		
	}
	void secondLarge() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elemnt ::");
		int num = sc.nextInt();
		int [] input = new int[num];
		System.out.println("Enter numbers ::");
		for(int i=0; i<num ;i++) {
			int n = sc.nextInt();
			input[i]= n;
		}
		
		int N = 2;
		List<Object> takeInput = new ArrayList<>();
		for(int a : input) {
			takeInput.add(a);
		}
		//System.out.println(takeInput);
		Set<Object> Nthlargest = new TreeSet<>(takeInput);
		List<Object> output = new ArrayList<>(Nthlargest);
		Collections.reverse(output);
		
		System.out.println("Second largest is :: "+output.get(N-1) );
	}
	

}
