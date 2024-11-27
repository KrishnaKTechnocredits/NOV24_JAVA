//Assignment - 21 : 24th Nov'2024 [20 mins]
//
//Find the length of the given string excluding space. 
//
//input : prem lata gupta
//output : length without space is 13 and space characters are 2.

package harshada.string;

public class StringAss3 {
	int lengthCnt;
	int spaceCnt;
	void strWithoutSpaces(String str) {
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ')
				spaceCnt++;
			else
				lengthCnt++;
		}
		System.out.println("length without space is "+lengthCnt+" and space characters are "+spaceCnt);
	}
	public static void main(String[] args) {
		StringAss3 stringAss3=new StringAss3();
		stringAss3.strWithoutSpaces("prem lata gupta");
	}
}
