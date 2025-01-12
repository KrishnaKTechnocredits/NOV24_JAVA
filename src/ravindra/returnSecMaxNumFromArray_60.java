package ravindra;

public class returnSecMaxNumFromArray_60 {
	int maxNo(int[] input) {
		int maxNo = input[0];
		int secMaxNo = input[1];
		if (maxNo == secMaxNo) {
			secMaxNo = input[2];
		}
		for (int i = 0; i < input.length; i++) {
			if (maxNo <= input[i]) {
				secMaxNo = maxNo;
				maxNo = input[i];
			} else if (secMaxNo <= input[i] & input[i] < maxNo) {
				secMaxNo = input[i];
			}
		}
		return secMaxNo;
	}
	
	public static void main(String[] args) {
		int [] input = {33,33,19,55,53,11};
		returnSecMaxNumFromArray_60 assignment60=new returnSecMaxNumFromArray_60();
		int secnum=assignment60.maxNo(input);
		System.out.println(secnum);
	}
}
