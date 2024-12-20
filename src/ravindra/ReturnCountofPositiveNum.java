package ravindra;

public class ReturnCountofPositiveNum {
	void countOfPositiveNum(int [] numbers) {
		int count=0;
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]>0) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		int [] input ={10,30,-45,66,-10};
		ReturnCountofPositiveNum returnCountofPositiveNum=new ReturnCountofPositiveNum();
		returnCountofPositiveNum.countOfPositiveNum(input);
	}
}
