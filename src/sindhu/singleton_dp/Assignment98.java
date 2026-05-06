/*Create a class called Connection and apply singleton design pattern.*/

package sindhu.singleton_dp;

public class Assignment98 {
	public static void main(String[] args) {
		SingletonConnection con1 = SingletonConnection.getObject();
		SingletonConnection con2 = SingletonConnection.getObject();
		
		System.out.println(con1);
		System.out.println(con2);
		
		// lazy initialization
		
		//LazySingletonConnection con3 = LazySingletonConnection.getObjectLazy();
		//LazySingletonConnection con4 = LazySingletonConnection.getObjectLazy();
		
		//System.out.println(con3);
		//System.out.println(con4);
	}
}
