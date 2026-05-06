package roshan.SingleTonDesignPattern;

public class mainCLass {
 public static void main(String[] args) {
	 AllowToCreateSingleObjectOnly obj1 = AllowToCreateSingleObjectOnly.m1();
	 AllowToCreateSingleObjectOnly obj2 = AllowToCreateSingleObjectOnly.m1();
	 System.out.println(obj1);
	 System.out.println(obj2);

	
}

}
