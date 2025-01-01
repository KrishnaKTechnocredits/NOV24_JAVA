package kavita;
/*return second maximum number from given array.
input = {33,33,19,55,53,11};
output : 53 
Time:8m*/
public class Assignment60 {
	int getSecMaxNum(int[]input){
		int maxNum=input[0];
		int secMaxNum=input[1];
		if(input[1]>input[0]){
			maxNum=input[1];
			secMaxNum=input[0];
		}
			for(int i=2;i<input.length;i++){
				if(input[i]>maxNum) {
					secMaxNum=maxNum;
					maxNum=input[i];
				}else if(input[i]>secMaxNum) {
					secMaxNum=input[i];
				}
			}
	
		return secMaxNum;
	}
	
	public static void main(String[] args) {
		Assignment60 assignment60=new Assignment60();
		int[] arr={33,33,19,55,53,11};
		int ans=assignment60.getSecMaxNum(arr);
		System.out.println("The Second maximum number in the given array is : "+ans);
	}
}
