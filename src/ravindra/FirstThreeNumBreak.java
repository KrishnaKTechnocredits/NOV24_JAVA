package ravindra;

public class FirstThreeNumBreak {
	void threeNumDivision(int startIndex,int endIndex) {
		int count=0;
		System.out.println("First 3 numbers divisible by 3 and 4 is :");
		for(int num=startIndex; num<=endIndex;num++) {
			if(num%3==0 && num%4==0) {
				count++;
				if(count<=3) {
					System.out.println(num);
				}
			}
		}
	}
	
	public static void main(String []args) {
		FirstThreeNumBreak firstThreeNumBreak=new FirstThreeNumBreak();
		firstThreeNumBreak.threeNumDivision(10, 500);
	}
}
