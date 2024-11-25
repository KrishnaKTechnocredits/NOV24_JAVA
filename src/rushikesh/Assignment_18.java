package rushikesh;

public class Assignment_18 {

	int getLastDivNumber(int startIndex,int endIndex) {
		int count=0;
		for(int num=startIndex;num>=endIndex;num--) 
			if (num%5==0) {
				System.out.println(num+" is the last number which is div by 5 in the given range.");
				return num;
			}
		return 10;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_18 assignment_10=new Assignment_18();
		int ans=assignment_10.getLastDivNumber(498,10);
		System.out.println("Return- "+ans);
	}

}
