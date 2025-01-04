package kavita;
/*Rearrange the given String, uppercase followed by sum of all the digits followed by lowercase.
input : Te1ch6NOCre4dits
output : TNOC11echredits
Time:7m*/
public class Assignment68 {
	String getReArrangeString(String input){
		String upperCase= "";
		String lowerCase= "";
		int digit=0;
		 for(int i=0;i<input.length();i++){
			 char ch=input.charAt(i);
			 if(Character.isUpperCase(ch)){
				 upperCase=upperCase+ch;
			 }
			 else if(Character.isDigit(ch)){
				 int num=Character.getNumericValue(ch);
				 digit=digit+num;
			 }else{
				 lowerCase=lowerCase+ch;
			 }
		 }
		 return upperCase+lowerCase+digit;
	}
	
	public static void main(String[] args){
		Assignment68 assignment68=new Assignment68();
		String ans=assignment68.getReArrangeString("Te1ch6NOCre4dits");
		System.out.println(ans);
	}
}
