package ravindra;

public class ReturnArrayOfMaxAndMinNum {
	int [] retrunArrayMaxMin(int []numbers) {
		int []output=new int[2];
		int maxnum=numbers[0];
		int minnum=numbers[0];
		for(int i=0;i<numbers.length;i++) {
			if(maxnum<numbers[i]) {
				maxnum=numbers[i];
			}
			if(minnum>numbers[i]) {
				minnum=numbers[i];
			}
			output[1]=minnum;
			output[0]=maxnum;
		}
		return output;
	}
	public static void main(String[] args) {
		int [] input={44,45,22,25,47,29,46};
		ReturnArrayOfMaxAndMinNum returnArrayOfMaxAndMinNum=new ReturnArrayOfMaxAndMinNum();
		int []out=returnArrayOfMaxAndMinNum.retrunArrayMaxMin(input);
		System.out.println(out[0]);
		System.out.println(out[1]);
	}
}
