package pranita;

public class Assignment50 {
	void getMinNum(int[] num) {
		int minNum=num[0];
		for(int i=0; i<num.length; i++) {
			if(minNum>num[i]) {
				minNum=num[i];
			}
		}
		System.out.println("Min number in given array is "+minNum);
	}
	
	public static void main(String[] args) {
		int[] number = {44,45,22,25,47,29,46};
		int[] number1 = {-44,-45,-22,-25,-47,-29,-46};
		Assignment50 assi50 = new Assignment50();
		assi50.getMinNum(number);
		assi50.getMinNum(number1);	
	}
}
