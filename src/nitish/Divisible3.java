package nitish;

public class Divisible3 {
	
	void inputData(int start,int end) {
		int count=0;
		for(int num = start;num <=end;num++) {
			if(num%4==0 && num%3==0) {
				System.out.println(num);
				count++;
			}
			if(count==3) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		Divisible3 divisible = new Divisible3();
		System.out.println("First 3 numbers which are divisible by 3 & 4 are ");
		divisible.inputData(10, 500);

	}

}
