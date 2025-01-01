package kavita;
/*Return the second maximum length string from given array.
If you find multiple string as second maximum, return the last second maximum.

input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
ouput : PuGlobantne
Time: 11m */
public class Assisgnment58 {
	String getSecMaxlLen(String[] input){
		String maxString=input[0];
		String secMaxString=input[1];
		if(input[1].length()>input[0].length()){
			maxString=input[1];
			secMaxString=input[0];
		}
		for(int i=2;i<input.length;i++){
			if(input[i].length()>maxString.length()){
				secMaxString=maxString;
				maxString=input[i];
			}else if(input[i].length()>=secMaxString.length()){
				secMaxString=input[i];
			}
		}
		return secMaxString;
	}
	
	public static void main(String[] args){
		Assisgnment58 assignment58=new Assisgnment58();
		String[] arr={"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
		String ans=assignment58.getSecMaxlLen(arr);
		System.out.println("The second maximum string in the given array is : "+ans);
	}
}
