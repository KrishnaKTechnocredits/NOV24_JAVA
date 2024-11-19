package radhika;
class Example13{
	
	int num1 = 100;
	int num2 = 200;
	
	void updateValues(){
		num1 = num1 + 10;
		num2 = num2 + 10;
		num2 = num2 + num1;
	}
	
	void updateNum(){
		num2 = num2 - 10;
	}
	
	void display(){
		System.out.println("num1 is " + num1 + ", num2 is " + num2);
	}
	
	public static void main(String[] args){
		Example13 example13 = new Example13();
		example13.updateNum();
		example13.display();
		
		Example13 example13_1 = new Example13();
		example13_1.updateNum();
		example13_1.updateValues();
		example13_1.display();
	}
}
