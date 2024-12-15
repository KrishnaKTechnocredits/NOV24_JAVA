package ravindra;

public class AsciiValueChar65_100_A_Z{
	void chars(){
		for(int num=65;num<=100;num++)
		{
			char allchar=(char)num; 
			System.out.println(num+"--->"+allchar);
			
		}		
	}
	
	void  interger() {		
		for(char a='A';a<='Z';a++) {
			int num=a;
			System.out.println(a+"-->"+num);
		}
		
	}
	
	public static void main(String[] args) {
		AsciiValueChar65_100_A_Z all=new AsciiValueChar65_100_A_Z();
		all.chars();
		all.interger();
	}
}