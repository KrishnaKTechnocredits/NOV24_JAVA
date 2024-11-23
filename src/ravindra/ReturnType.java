package ravindra;

public class ReturnType {
	void lastNumDiv(int startIndex, int endIndex) {
		int count=0;
		for(int num=startIndex;num>=endIndex;num--) {
			if(num%5==0) {
				count++;
				if(count>=1) {
					System.out.println(num+" is the last number which is div by 5 in the given range.");
					break;
				}
			}
		}
	}
	
	public static void main (String []args) {
		ReturnType returnType=new ReturnType();
		returnType.lastNumDiv(498, 10);
	}
}
