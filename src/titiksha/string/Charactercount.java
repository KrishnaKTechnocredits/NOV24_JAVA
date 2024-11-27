//Find the given character count from given string. 
//input : aakanskha, a

package titiksha.string;

public class Charactercount {
	int count;
	int getcharactercount(String name ,char ch) {
		System.out.println("The total count for " +"is: ");
		for(int index=0;index<name.length();index++) {
			if(name.charAt(index)=='a') {
				count++;}
			}
		return count;
	}
	public static void main(String[] args) {
		Charactercount charactercount=new Charactercount();
		int num=charactercount.getcharactercount("aakansha",'a');
		System.out.println(num);
	}
}

