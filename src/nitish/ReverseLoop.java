package nitish;

public class ReverseLoop {
	
	void inputData(int start,int end) {
		int count=0;
		for(int num = end;num >=start;num--) {
			if(num%5==0) {
				System.out.println(num);
				count++;
			}
			if(count==5) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		ReverseLoop reverseLoop = new ReverseLoop();
		System.out.println("Last 5 numbers which are divisible by 5 are ");
		reverseLoop.inputData(10,500);

	}

}
