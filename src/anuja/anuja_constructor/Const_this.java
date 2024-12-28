package anuja.anuja_constructor;
// constructor with this keyword.
public class Const_this {
	void m1() {
		System.out.println(this); // will give same adrees as object of class.
	}
	
	public static void main(String[] args) {
		Const_this const_this = new Const_this();
		System.out.println("memory adree of object \n"+const_this);//memory addres of oject of a class name is const_this
		const_this.m1();
	}
}
