package ajay;

class Assignment19{
	void stringReverse(String input ){
			
		for(int i=input.length()-1;i>=0;i--){
			System.out.println(input.charAt(i));
		}
	}
	public static void main(String[] args){
		Assignment19 assignment19=new Assignment19();
		assignment19.stringReverse("te ch3no");
	}
}