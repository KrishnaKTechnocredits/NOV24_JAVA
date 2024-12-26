package pranita;

public class Assignment51 {
	void getMaxMinNum(int[] num) {
		int maxNum=num[0]; int minNum=num[0];
		for(int i=1; i<num.length; i++) {
			if(maxNum<num[i]) {
				maxNum=num[i];
			}
			if(minNum>num[i]) {
				minNum=num[i];
			}			
		}
		System.out.println("Max number in given array is "+maxNum);
		System.out.println("Min number in given array is "+minNum);
	}
	
	public static void main(String[] args) {
		int[] number1 = {-44,-45,-22,-25,-47,-29,-46};
		Assignment51 assi51 = new Assignment51();
		assi51.getMaxMinNum(number1);	
	}
}
