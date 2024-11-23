package ashwini;

public class NumDivBy3Assignment15 {
	
	void Num(int startRange,int endRange) {
		int count = 0;
		for(int num=startRange;num<=endRange;num++) {
		if(num%3==0&&num%4==0){
			System.out.println(num);
			count++;
			if(count==3) {
			break;
			}
		}
		}	
	}

	public static void main(String[] args) {
		NumDivBy3Assignment15 assignment15=new NumDivBy3Assignment15();
		assignment15.Num(10, 500);
	}

}
