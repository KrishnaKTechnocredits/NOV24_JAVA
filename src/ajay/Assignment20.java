package ajay;

class Assignment20{
	
	int getcharcount(String str, char ch){
		int count=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='a'){
				count++;
			}
		}System.out.println("Count of character a is = "+count);
	return count;
	}
	public static void main(String[] args){
		Assignment20 assignment20=new Assignment20();
		assignment20.getcharcount("aakanskha", 'a');
	}
}
