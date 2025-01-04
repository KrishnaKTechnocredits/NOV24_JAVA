package pranita;

public class Assignment49 {
	
	void getMaxNum(int[] num) {
		int maxNum=num[0];
		for(int i=0; i<num.length; i++) {
			if(maxNum<num[i]) {
				maxNum=num[i];
			}
		}
		System.out.println("Max number in given array is "+maxNum);
	}
	
	public static void main(String[] args) {
		int[] number = {44,45,22,25,47,29,46};
		int[] number1 = {-44,-45,-22,-25,-47,-29,-46};
		Assignment49 assi49 = new Assignment49();
		assi49.getMaxNum(number);
		assi49.getMaxNum(number1);	
	}
}
