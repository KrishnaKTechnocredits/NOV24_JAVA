package ashwini.stringAssignments;

public class StringAssignment20 {
	int count=0;
		int getCharFreq(String str, char ch){
			
			for(int index=0;index<str.length();index++) {
				if(str.charAt(index)=='a') {
					count++;	
				}
			}
			System.out.println("Count of "+ch+" in aakanskha is "+ count);
	        return count;    
		}
	public static void main(String[] args){
		StringAssignment20 assn20=new StringAssignment20();
		assn20.getCharFreq("aakanskha",'a');
		
	}
	  
	}

