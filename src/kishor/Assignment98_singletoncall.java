package kishor;

public class Assignment98_singletoncall {
	
	public static void main(String[] args) {
		
		Assignment98_connection obj=Assignment98_connection.getConnectionobject();
		System.out.println(obj);
		System.out.println(obj);
		System.out.println(obj);
	}
}
