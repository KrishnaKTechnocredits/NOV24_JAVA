package ravindra;

public class PrintMaxAndMinNumFromArray {
	void maxminnum(int []numbers) {
		int maxnum=numbers[0];
		int minnum=numbers[0];
		
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]>maxnum) {
				maxnum=numbers[i];
			}
			if(numbers[i]<minnum) {
				minnum=numbers[i];
			}
		}
		System.out.println(maxnum);
		System.out.println(minnum);
		System.out.println("------");
	}
	
	public static void main(String[] args) {
		int [] input1={44,45,22,25,47,29,46};
		int[] input2={-44,-45,-22,-25,-47,29,46};
		PrintMaxAndMinNumFromArray printMaxAndMinNumFromArray=new PrintMaxAndMinNumFromArray();
		printMaxAndMinNumFromArray.maxminnum(input1);
		printMaxAndMinNumFromArray.maxminnum(input2);
	}
}
