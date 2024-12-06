/*
Assignment - 20 : 24th Nov'2024 [20 mins] [IMP]
Find the given character count from given string. 

input : aakanskha, a
output : Count of a in aakanskha is 4.  		 

hint : 
int getCharFreq(String str, char ch){
     return count;
}

*/
package pramod;
class Assignment20 {
    
    int getString(String str, char at) {
        int Count=0;
        System.out.println("Orignal string as :"+str);
        System.out.println("Provided Char is :"+at);
        for(int index=0; index<=str.length()-1; index++) {
            if(str.charAt(index)==at) {
                Count++;
            }
         }
         return Count;
    }
    
    public static void main(String[] args) {
        Assignment20 m=new Assignment20();
        int frequency=m.getString("PRAMODA",'A');
        System.out.println("Frequency of the char is:"+frequency);
    }
}