package ajay;

class Assignment22{
	int count;
	int returnTotalgdigits(String str){
		 
		for(int i=0;i<str.length();i++){
			boolean flag=Character.isDigit(str.charAt(i));
			if(flag==true){
				 count++;
				 }
		}System.out.println("Total Numbers of digits in given input is = "+count);
	return count;		
	}
	public static void main(String[] args){
		Assignment22 assignment22=new Assignment22();
		assignment22.returnTotalgdigits("aa1kan33ks4h5a");
	}
}
