package nilam.Array;

public class Assignment54 {
	int[] reverseArray(int[] numArray) {
		int[] revArray=new int[numArray.length];
		for(int index=numArray.length-1,i=0;index>=0;index--,i++) {
				revArray[i]=numArray[index];	
		}
		return revArray;
	}
	
	public static void main(String[] args) {
		Assignment54 assignment54=new Assignment54();
		int[] numArray={10,34,22,16,19,99};
		int[] revArray=assignment54.reverseArray(numArray);
		for(int i=0;i<revArray.length;i++) {
			System.out.println(revArray[i]);
		}
	}
}
