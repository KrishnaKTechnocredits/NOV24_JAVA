package nilam.Array;
//From given int array, return count of positive numbers.
public class Assignment48 {
	
	static int count=0;
	
	int printNumCount(int[] num) {	
		for(int index=0;index<num.length;index++) {
			if(num[index]>0) {
				count++;
				System.out.println(num[index]);
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Assignment48 assignment48=new Assignment48();
		int[] num= {10,30,-45,66,-10};
		assignment48.printNumCount(num);
		System.out.println("There are total "+count+ " positive numbers present in the given array");
	}
}
