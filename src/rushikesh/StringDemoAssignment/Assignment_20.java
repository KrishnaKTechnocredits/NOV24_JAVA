package rushikesh.StringDemoAssignment;

public class Assignment_20 {
	
	int getCharFreq(String str,char ch) {
		
		int count=0;
		int len=str.length();
		System.out.println("Lenth of String is "+len);
		for (int i=0;i<len;i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
	    }
		return count;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_20 assignment_20=new Assignment_20();
		int c=assignment_20.getCharFreq("aakansha", 'a');
		System.out.println("count of Match Character= "+c);
		
	}

}
