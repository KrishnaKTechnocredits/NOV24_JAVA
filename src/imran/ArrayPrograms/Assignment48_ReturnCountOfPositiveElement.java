package imran.ArrayPrograms;

public class Assignment48_ReturnCountOfPositiveElement {

	void getPositiveElementOfArray(int[] data)
	{
		int count=0;
		for(int i=0;i<=data.length-1;i++)
		{
			int temp = data[i];
			if(temp>0)
			{
				count++;
				System.out.println(temp);
			}
		}
		System.out.println("Total positive Element Present in Array is  : " + count);
	}
	
	public static void main(String[] args) {
		Assignment48_ReturnCountOfPositiveElement assignment48_ReturnCountOfPositiveElement_1 = new Assignment48_ReturnCountOfPositiveElement();
		int[] data = {10,30,-45,66,-10};
		assignment48_ReturnCountOfPositiveElement_1.getPositiveElementOfArray(data);
	}
}
