//Assignment - 60 : 21st Dec'2024 [20 min]
//return second maximum number from given array.
//
//input = {33,33,19,55,53,11};
//output : 53 

package fazrana.array;

public class FAssignment60 {
	int getNum(int[] array) {
		int maxNum=array[0];
		int secondNum=array[1];
		if(array[0]<array[1]) {
			maxNum=array[0];
			secondNum=array[1];
		}
		System.out.print("Input Array: {"+ array[0]+","+ array[1]);
		for(int i=2;i< array.length;i++) {
			System.out.print(array[i]+",");
			if (maxNum<array[i]) {
				secondNum=maxNum;
				maxNum=array[i];
			}else if(secondNum<array[i]) {
				secondNum=array[i];
			}
		}System.out.println("}");
		return secondNum;
	}
	
	public static void main(String[] args) {
		int[] array= {33,33,19,55,53,11};
		FAssignment60 fassignment60=new FAssignment60();
		System.out.println("Second Max number : "+fassignment60.getNum(array));
	}
}
