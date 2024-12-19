package nilam.Array;
//Print array in reverse order
public class Assignment53 {
	
	void printReverseArray(int[] numArray) {
		for(int index=numArray.length-1;index>=0;index--) {
			System.out.println(numArray[index]);
		}
	}
	
	public static void main(String[] args) {
		Assignment53 assignment53=new Assignment53();
		int[] numArray= {10,34,22,16,19,99};
		assignment53.printReverseArray(numArray);
	}
}
