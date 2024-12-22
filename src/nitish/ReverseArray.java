package nitish;

public class ReverseArray {
	void output() {
		int[] num = {2,4,6,8,9,10,14,17,20};
		for(int i = (num.length-1);i>=0;i--) {
			System.out.println(num[i]);
		}
	}

	public static void main(String[] args) {
		ReverseArray obj = new ReverseArray();
		obj.output();
	}

}
