package nilam.Array;
//print maximum and minimum number from given array
public class Assignment51 {
	
	void findMaxMin(int[] num) {
		int minNum=num[0],maxNum=num[0];
		for(int index=1;index<num.length;index++) {
			if(minNum<num[index]) {
				minNum=num[index];
			}
			
			if(maxNum>num[index]) {
				maxNum=num[index];
			}
			
		}
		System.out.println("Minimum number in the given array is: "+minNum);
		System.out.println("Maxmum number in the given array is: "+maxNum);
	}

	public static void main(String[] args) {
		Assignment51 assignment51=new Assignment51();
		int[] num= {10,52,98,4,12};
		assignment51.findMaxMin(num);
	}
}
