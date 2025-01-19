package titiksha.Returntype;

public class Practise2 {
	String processData(int ans) {
		for(int count=1;count<=5;count++) {
		ans=ans+10;
		if(ans>50) {
			return "Hi";}
		}
		
		return "Techno";}

	
public static void main(String[] args) {
	Practise2 practise2=new Practise2();
	String ans=practise2.processData(10);
	System.out.println(ans);
}
}

