package anuja;

public class PracticeInterview1 {
	
	void getNum(int startNum, int endNum){
		int i =0;
        int count = 0;
        for (i= endNum;i>=startNum;i--){
            if(i%5==0 && i%9==0){
                count++;
                if(count == 2){
                    System.out.print("Second last num which is devisible by 5 and 9 is " +i);
                    break;
                }
            }
        }
    }
        
    public static void main (String[] args){
        PracticeInterview1 practiceInterview1 =  new PracticeInterview1();
        practiceInterview1.getNum(5,100);
        }
	}
