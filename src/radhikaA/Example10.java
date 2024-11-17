package radhikaA;
class Example10{
	int num1 = 10;
	int num2 = 20;
	
	void processData(){
		int num1 = 1; 
		int num2 = 2;
		System.out.println(this.num1 + num1); //
		System.out.println(this.num2 + num2); // 
	}
	
	public static void main(String[] args){
		Example10 example10 = new Example10();
		example10.processData();
	}
}