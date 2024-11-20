package vidya;

public class Compare {
	
	void maximumNum(int a,int b) {
		if(a>b)
			System.out.println(a +" is bigger between "+a +" and "+ b);
		else
			System.out.println(b +" is bigger between "+a +" and "+ b);
	}
	
	void minNum(int a,int b) {
		if(a<b)
			System.out.println(a +" is samller between "+a +" and "+ b);
		else
			System.out.println(b +" is samller between "+a +" and "+ b);
		
	}
	public static void main(String[] a)
	{
		Compare compare = new Compare();
		compare.maximumNum(10, 17);
		compare.minNum(10, 17);
	}

}
