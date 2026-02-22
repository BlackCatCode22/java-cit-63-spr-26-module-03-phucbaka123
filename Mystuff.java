package BankAccount;

public class Mystuff {
    private String firstname;
    private String lastname;
    private double balance;

    public Mystuff(String first, String last, double balance){
        this.firstname = first;
        this.lastname = last;
        this.balance = balance;

    };

    public void deposit(double amount){

        balance = balance + amount;

    };

    public void withdraw(double amount){

        if (balance >= amount){
            balance = balance - amount;
            System.out.println("Withdraw successful");
        }
        else{
            System.out.println("Your balance is not enough");
        }
    }

    public String getBalance(){

        return("Your balance is " + balance);
    }
    public String toString() {

            return "Name: " + firstname + " " + lastname + ", Balance: " + balance;


    }





}
