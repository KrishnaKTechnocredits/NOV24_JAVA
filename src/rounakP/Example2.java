package rounakP;

public class Example2 {
    int num1 = 10, num2 = 5;
    int sum, subtract, multiply, divide;

    void add(){
        sum = num1 + num2;
    }

    void sub(){
        subtract = num1 - num2;
    }

    void mul(){
        multiply = num1*num2;
    }

    void div(){
        divide = num1/num2;
    }

    void total(){
        int totalsum = sum + subtract + multiply + divide;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(totalsum);
    }

    public static void main(String[] args) {
        Example2 e = new Example2();
        e.div();
        e.mul();
        e.add();
        e.sub();
        e.total();
    }
}
