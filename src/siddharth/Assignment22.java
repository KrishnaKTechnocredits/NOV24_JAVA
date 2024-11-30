package siddharth;

public class Assignment22 {
	
	void returnTotalNum(String str) {
		int index=0;
		int count=0;
		System.out.println("Input : "+str);
		for(index=0;index<str.length();index++) {
			boolean flag = Character.isDigit(str.charAt(index));
			if(flag == true) {
						count++;
			}
		}
		System.out.println("Output : total "+count+" digits are there in given input.");
	}
	
	public static void main(String[] args) {
		new Assignment22().returnTotalNum("aa1kan33ks4h5a");
	}
}
