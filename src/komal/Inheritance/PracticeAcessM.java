package komal.Inheritance;

import komal.Basic.PracticeAccessM;

public class PracticeAcessM extends PracticeAccessM {

	protected String demo() {
//		System.out.print("call in child");
		String str = "komal";
		return str.reverse();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeAcessM p = new PracticeAcessM();
		String str = p.demo();
		System.out.println("call in child" + str);

	}
}
