package ajay;

class Assignment21{
	
	void getcharcount(String str){
		int count=0;
		int spaceinchar=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!=' '){
				count++;
			}else{
				spaceinchar++;
			}
		}System.out.println("Count of character a is = "+count +" and count of spaces is = " +spaceinchar);
	}
	public static void main(String[] args){
		Assignment21 assignment21=new Assignment21();
		assignment21.getcharcount("prem lata gupta");
	}
}
