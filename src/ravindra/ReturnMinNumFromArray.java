package ravindra;

public class ReturnMinNumFromArray {
	int minNum(int []numbers) {
		int minnum=numbers[0];
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]<minnum) {
				minnum=numbers[i];
			}
		}return minnum;
	}
	
	public static void main(String[] args) {
		int []input1= {44,45,22,25,47,29,46};

		int[] input2 ={-44,-45,-22,-25,-47,29,46};

		ReturnMinNumFromArray returnMinNumFromArray=new ReturnMinNumFromArray();
		int minnum1=returnMinNumFromArray.minNum(input1);
		int minnum2=returnMinNumFromArray.minNum(input2);
		System.out.println(minnum1);
		System.out.println(minnum2);
	}
}
