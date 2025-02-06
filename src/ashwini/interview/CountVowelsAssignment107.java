package ashwini.interview;

import java.util.Scanner;

/*
  Assignment 107: Count Vowels in a String
📥 Input: aaryahi
📊 Total vowel count: 4
🅰️ a → 3
ℹ️ i → 1
🔢 Unique vowels: 2

💡 Hint: Use switch-case and a Scanner class for input handling.
 */
public class CountVowelsAssignment107 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
System.out.println("Enter a String :");
String input=sc.nextLine().toLowerCase();

int totalVowelsCount=0;
int aCount=0,eCount=0,iCount=0,oCount=0,uCount=0;
for(char ch:input.toCharArray()) {
	switch(ch){
		case 'a':
			aCount++;
			totalVowelsCount++;
			
			break;
		case 'e':
			eCount++;
			totalVowelsCount++;
			break;
		case 'i':
			iCount++;
			totalVowelsCount++;
			break;
		case 'o':
			oCount++;
			totalVowelsCount++;
		
			break;
		case 'u':
			uCount++;
			totalVowelsCount++;
			break;
		default:
			break;
					
	}
}
	System.out.println("Total vowels count : "+totalVowelsCount);
	if(aCount>0)
		System.out.println("a-->"+aCount);
	if(eCount>0)
		System.out.println("e-->"+aCount);
	if(iCount>0)
		System.out.println("i-->"+aCount);
	if(oCount>0)
		System.out.println("o-->"+aCount);
	if(uCount>0)
		System.out.println("u-->"+aCount);
	
	int uniqueVowels=0;
	if(aCount>0)
		uniqueVowels++;
	if(eCount>0)
		uniqueVowels++;

	if(iCount>0)
		uniqueVowels++;
	if(oCount>0)
		uniqueVowels++;
	if(uCount>0)
		uniqueVowels++;
	
	System.out.println("Unique Vowels: " +	uniqueVowels);
	sc.close();
}
}


