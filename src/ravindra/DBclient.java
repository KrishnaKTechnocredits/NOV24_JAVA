package ravindra;

public class DBclient {
	public static void main(String[] args) {
		Connection obj1= Connection.getObject();
		Connection obj2 = Connection.getObject();
		System.out.println(obj1);
		System.out.println(obj2);
	}
}
