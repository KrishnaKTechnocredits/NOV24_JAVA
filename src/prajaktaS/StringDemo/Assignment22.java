package prajaktaS.StringDemo;

public class Assignment22 {

	int getCharCount(String str) {
	boolean flag;
	int count=0;
	for (int index=0;index<str.length();index++) {
	flag=Character.isDigit(str.charAt(index));
		if(flag==true) {
				count++;
			}
		}
		return count; 
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans=new Assignment22().getCharCount("aa1kan33ks4h590a");
		System.out.println("total "+ ans + " digits are there in given input.");
	}

}
