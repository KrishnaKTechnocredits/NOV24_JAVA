package prajaktaP;

public class Example {
	int age =30;
	String name="Prajakta";
	String dept="ENTC";
	
	void display(){
	System.out.println(age+" "+name+"  "+dept);
	}
	
	public static void main(String args[] ){
		Example example = new Example();
		example.display();
	}

}
