// Default constructors are used when we have to provide some default values to our class instead of the ones decided by compiler or predafault values

// Defining bank account class and over riding default values
class BankAccount {
    double balance;

    // If we dont create below BankAccount function and define balance then system will automatically pick 0 or garbage value
    public BankAccount() {
        balance = 100;
    }
    public void printBalance() {
        
        System.out.println(balance);
    }
}

public class DefaultConstructors {
    public static void main(String[] args) {
        BankAccount test = new BankAccount();
        test.printBalance(); 
    }
}
