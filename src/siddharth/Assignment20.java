package siddharth;

public class Assignment20 {
	
	int count=0;
	int getCharFreq(String str, char ch) {
		for(int index = 0;index<str.length();index++) {
			if(str.charAt(index)==ch) {
				count++;
			}
		}	
		return count;
	}
	
	public static void main(String[] args) {
		Assignment20 assignment20 = new Assignment20();
		System.out.println("The frequency of charcter 'a' in string aakansha is :"+assignment20.getCharFreq("aakanskha", 'a'));
	}
}