package Assignment_Array;

public class Assignment48 {
	
	void printCount(int[] num) {
		int count =0;
		for(int i =0;i<num.length;i++) {
			if(num[i]>0) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		int[] num =  {10,30,-45,66,-10};
		new Assignment48().printCount(num);
	}
}
