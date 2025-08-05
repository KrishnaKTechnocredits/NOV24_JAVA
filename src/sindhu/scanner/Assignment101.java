/*On user defined numbers, find out the second largetest number. 
Hint : Use scanner.*/

package sindhu.scanner;
import java.util.*;

public class Assignment101 {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> al = new ArrayList<Integer>();
		// we can provide input from console
		System.out.println("provide int input: ");
		for(int i=0; i<=5; i++) {
			int num = sc.nextInt();
			al.add(num);
		}
		System.out.println("The input int list is: "+al);	
		Assignment101 a100 = new Assignment101();
		a100.getSecLargestNum(al);
		sc.close();
	}
	 
	 public void getSecLargestNum(List<Integer> al) {
		 int maxNum = 0;
		 int secMaxNum = 0;
		 for(int j=0; j<al.size(); j++) {
			 maxNum = al.get(j);
			 secMaxNum = al.get(j++);
			 
			 if(secMaxNum>maxNum) {
				 maxNum = secMaxNum;
				 secMaxNum = maxNum;
			 }
			 
			 if(al.get(j)>maxNum) {
				 secMaxNum = maxNum;
				 maxNum = al.get(j);
			 }else if(al.get(j)>secMaxNum) {
				 secMaxNum = al.get(j);
			 }
		 }
		 System.out.println("The second Larget number is: "+secMaxNum);
	 }
	 
}
