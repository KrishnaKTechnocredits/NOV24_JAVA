package siddharth;
/*
Assignment - 98 : 30th Jan'2025
Create a class called Connection and apply singleton design pattern.
 */
public class Assignment98 {
	
	public static void main(String[] args) {
		System.out.println(Assignment98LazySingletonConnection.getObject());
		Assignment98LazySingletonConnection con1 = Assignment98LazySingletonConnection.getObject();
		System.out.println(con1);
	}
}
