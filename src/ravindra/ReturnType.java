package ravindra;

public class ReturnType {
	int  lastNumDiv(int startIndex, int endIndex) {
		int count=0;
		int  num;
		for(num=startIndex;num>=endIndex;num--) {
			if(num%5==0) {
				count++;			
				if(count>=1) {					
					return num;					
				}
				break;
			}
		}return num;
	}
	
	public static void main (String []args) {
		ReturnType returnType=new ReturnType();
		int num = returnType.lastNumDiv(498, 10);
		System.out.println(num+" is the last number which is div by 5 in the given range.");
	}
}
