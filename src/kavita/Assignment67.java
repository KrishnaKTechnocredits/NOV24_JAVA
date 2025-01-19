package kavita;
/*Rearrange the given String, uppercase followed by digits followed by lowercase.
input : Te1ch6NOCre3dits
output : TNOC163echredits
Time:6m*/
public class Assignment67 {
	String getReArrangeString(String input){
		String upperCase= "";
		String lowerCase= "";
		String digit= "";
		
		for(int i=0;i<input.length();i++){
			char ch=input.charAt(i);
			if(Character.isUpperCase(ch)){
				upperCase=upperCase+ch;
			}else if(Character.isDigit(ch)){
				digit=digit+ch;
			}else{
				lowerCase=lowerCase+ch;
			}
		}
		return upperCase+lowerCase+digit;
	}
	
	public static void main(String[] args){
		Assignment67 assignment67=new Assignment67();
		String ans=assignment67.getReArrangeString("Te1ch6NOCre3dits");
		System.out.println("Rearranging the strings : "+ans);
	}
}
