package kavita;
/*Return the list of all the prime numbers from given array. 
input : {10,23,31,40,50}
output : {23,31}*/
import java.util.List;
import java.util.ArrayList;
public class Assignment75 {
	boolean getPrimeNumber(int num) {
		boolean flag=false;
		if(num<=1) {
			return false;
		}else {
			for(int i=2;i<Math.sqrt(num);i++) {
				if(num%i==0) {
					return false;
				}else {
					flag=true;
				}
			}
			return flag;
		}
	}
	
	List<Integer> getPrimeNumList(int[] arr){
		List<Integer> listofprimenum=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(getPrimeNumber(arr[i])==true) {
				listofprimenum.add(arr[i]);
			}
		}
		return listofprimenum;
	}
	
	public static void main(String[] args) {
		Assignment75 assignment75=new Assignment75();
		int[] arr = {10,23,31,40,50};
		System.out.println(assignment75.getPrimeNumList(arr));
		
	}
}

