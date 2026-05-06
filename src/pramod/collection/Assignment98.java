/*
 * Assignment - 98 : 30th Jan'2025
Create a class called Connection and apply singleton design pattern.
 */

package pramod.collection;

public class Assignment98 {

	public static void main(String[] args) {

		System.out.println(Connection.getConnection());
		System.out.println(Connection.getConnection());
		Connection con1 = Connection.getConnection();
		System.out.println(con1);
	}
}
