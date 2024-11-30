package reshma;

public class Assignment9_IfElseLadder {
	void getResult(int marks){
		if(marks <=100 && marks>90){
			System.out.println("A+");
		}else if(marks <=90 && marks>80){
			System.out.println("A");
		}else if(marks <=80 && marks>70){
			System.out.println("B+");
		}else if(marks <=70 && marks>60){
			System.out.println("B");
		}else if(marks <=60 && marks>50){
			System.out.println("C");
		}else if(marks <=50 && marks>0){
			System.out.println("work harder");
		}else
			System.out.println("Invalid score");
	}
		public static void main(String[]args){
			Assignment9_IfElseLadder e=new Assignment9_IfElseLadder();
			e.getResult(92);
			e.getResult(76);
			e.getResult(23);
			e.getResult(-19);
			e.getResult(102);
			
	}
}
