package prashant;
class Assignmnet2{
	int num1=10;
	int num2=2;
	int addAns;int subAns;int mulAns;int divAns;int finalAns;

	void addation(){
	  addAns=num1+num2;
	}
	
	void substraction(){
	  subAns=num1-num2;
	}
	
	void multiplication(){
	  mulAns=num1*num2;
	}
	
	void division(){
	  divAns=num1/num2;
	}
	
	void printTotalAns(){
		finalAns=addAns+subAns+mulAns+divAns;
		System.out.println("Answer is-:"+finalAns);
	}
	
	public static void main(String[] args){
		Assignmnet2 assignmnet2=new Assignmnet2();
		assignmnet2.addation();
		assignmnet2.substraction();
		assignmnet2.multiplication();
		assignmnet2.division();
		assignmnet2.printTotalAns();
	}

}