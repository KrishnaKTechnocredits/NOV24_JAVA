package RounakP;

public class Example1 {

    String name = "Raunak";
    int age = 30;
    int salary = 10000;

    void displayInfo(){
        System.out.println("My anme is " + name);
        System.out.println("My age is " + age);
        System.out.println("My salary is " + salary);
    }

    public static void main(String[] args) {
        Example1 e = new Example1();
        e.displayInfo();
    }
}