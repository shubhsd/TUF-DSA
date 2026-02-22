// Encapsulation -> getter setter, private keyword
class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }
    // Setter function
    public void setBalance(double balance) {
        this.balance = balance;
    }
    //Getter function
    public double getBalance() {
        return balance;
    }

    public void printBalance() {
        System.out.println("Balance is " + balance);
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        BankAccount person = new BankAccount(900);
        person.setBalance(1000);
        // person.balance = 0; //In order to avoid this we used private balance
        person.printBalance();
    }
}
