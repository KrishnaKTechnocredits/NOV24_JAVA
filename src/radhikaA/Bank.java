package radhikaA;
public class Bank {
    int balance = 1000; 
    
    void crebal() {
        balance += 300;
    }
    void debtbal() {
        balance -= 500;
    }

    void display() {
        System.out.println("Your current balance is " + balance);
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.crebal();
        bank.debtbal(); 
        bank.crebal();
        bank.display();   
    }
}