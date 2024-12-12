package prem;

public class Assignment22 {
	static int count;
	
	int getTotalNumDigit(String str) {
		for(int i=0;i<=str.length()-1;i++){
       	boolean flag =Character.isDigit(str.charAt(i));
          if (flag == true) {
			count++;			
		    }
		}
		return count;	
	}
	
	public static void main(String[] args) {
		Assignment22 assign22 =new Assignment22();
		int digit = assign22.getTotalNumDigit("aa1kan33ks4h5a");
		System.out.println("Total "+ digit +" digits are there in given input.");			
	}
}
