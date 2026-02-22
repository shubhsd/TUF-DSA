// PARAMETERISED CONSTRUCTORS - Where we pass value on our own

class BankAccount {
    double balance;
    String accountType;

    public BankAccount(double _balance) {
        balance = _balance;
        accountType = "Current";
    }

    public BankAccount(double _balance, String _accountType) {
        balance = _balance;
        accountType = _accountType;
    }

    public void printBalance() {
        System.out.println("Balance is " + balance);
    }

    public void printAccountType() {
        System.out.println("Your account type is - " + accountType);
    }
}

public class ParameterisedConstructor {
    public static void main(String[] args) {
        BankAccount person1 = new BankAccount(100);
        person1.printBalance();
        person1.printAccountType();

        BankAccount person2 = new BankAccount(5000, "Savings");
        person2.printBalance();
        person2.printAccountType();
    }
}
