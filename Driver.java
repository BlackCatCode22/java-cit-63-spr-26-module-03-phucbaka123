package BankAccount;

public class Driver {
    static void main(String[] args){
        Mystuff Phil = new Mystuff("Phil", "Huynh", 1000);

        Phil.deposit(500);
        Phil.withdraw(100000);
        System.out.println(Phil);

    }
}
