package swapnil;;

public class Example1 {
	int a;
	String name;
	boolean b;
	double d;
	Example1(int i, String s)
	{
		a=i;
		name=s;		
	}
	Example1(int i,String s,boolean boo)
	{
		a=i;
		name=s;
		b=boo;		
	}
	Example1(String s, double c )
	{
		name=s;
		d=c;
	}
	void Display()
	{
		System.out.println(a +" "+name+ " "+b+ " "+d);	
		System.out.println();
	}
	public static void main(String[] args)
	{
		Example1 ex=new Example1(1, "Pranshi");
		Example1 ex2=new Example1(2, "Abhi",true);
		Example1 ex3=new Example1("Preeti",7.7);
		ex.Display();
		ex2.Display();		
		ex3.Display();
		
		
	}
   
	
}



