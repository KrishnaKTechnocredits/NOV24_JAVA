package imran.ArrayPrograms;

public class Assignment53_PrintReverseArray {

	void getReverseArray(int[] data)
	{
		for(int i=data.length-1;i>=0;i--)
		{
			System.out.println(" The Element on "+ i + " index in the array is: " + data[i]);
		}
		System.out.println(" ");
	}
	
	public static void main(String[] args) {
		Assignment53_PrintReverseArray assignment53_PrintReverseArray_1 = new Assignment53_PrintReverseArray();
		int[] data = {10,34,22,16,19,99};
		assignment53_PrintReverseArray_1.getReverseArray(data);
	}
}
