package imran.string_programs;

public class Assignment19_StringReverseOrder {

	void getData(String data)
	{
		System.out.println("The String given by User was :"+ data);
		int a= data.length();
		for(int i=a-1; i>=0;i--)
		{
			char ch = data.charAt(i);
			System.out.println(ch);
		}
		
		}
	public static void main(String[] args) {
		Assignment19_StringReverseOrder assignment19_StringReverseOrder_1 = new Assignment19_StringReverseOrder();
		assignment19_StringReverseOrder_1.getData("Te ch3no");
	}
}
