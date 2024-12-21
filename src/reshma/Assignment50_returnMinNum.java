package reshma;
/* return the minimum number from given array. 

input : {44,45,22,25,47,29,46}
output : 22
input : {-44,-45,-22,-25,-47,29,46}
output : -47 */ 

public class Assignment50_returnMinNum {
	int getMinNum(int [] input) {
		int MinNum=input[0];
		for(int index=0;index<input.length;index++) {
			if(input[index]<MinNum) {
				MinNum=input[index];
			}
		}
		return MinNum;
	}
	public static void main(String[] args) {
		Assignment50_returnMinNum a50=new Assignment50_returnMinNum();
		int [] input1={44,45,22,25,47,29,46};
		int [] input2={-44,-45,-22,-25,-47,29,46};
		int num1=a50.getMinNum(input1);
		System.out.println("The minimum number from given array are: " +num1);
		int num2=a50.getMinNum(input2);
		System.out.println(num2);
	}
}
