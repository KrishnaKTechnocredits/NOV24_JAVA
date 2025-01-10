package kavita;
/*Print frequency of each word from given String.
String str = "Hi Hello Hi Hi Hi Techno Credits Techno";
output : 
Hi -> 4
Hello -> 1
Techno -> 2
Credits -> 1
Time: 15m*/
public class Assignment69 {
	void printFreqOfEachWord(String str){
		String[] words=str.split(" ");
		for(int i=0;i<words.length;i++){
		String singleword=words[i];
		if(!singleword.equals("")){
			int count=0;
			for(int j=0;j<words.length;j++){
				if(singleword.equals(words[j])){
					words[j]="";
					count++;
				}
			}
			System.out.println(singleword+ "--->" +count);
		}
		}
	}
	
	public static void main(String[] args){
		Assignment69 assignment69=new Assignment69();
		String str = "Hi Hello Hi Hi Hi Techno Credits Techno";
		System.out.println("Input string: "+str);
		assignment69.printFreqOfEachWord(str);
		
	}
}
