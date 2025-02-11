package ashwini.singleton;

import java.lang.reflect.Constructor;

/*
 Assignment - 98 : 30th Jan'2025
Create a class called Connection and apply singleton design pattern.
 */
public class Connection {
 private static Connection con;
 private Connection() {
	 
	 System.out.println(" Connection Constructor....");
	 
 }
 public static Connection getObject() {
	 if(con==null) {
		con= new Connection();
	 }
		return con; 
	
 }
 public void connect() {
     System.out.println("Connecting to the database...");
 }
}
