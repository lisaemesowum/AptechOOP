package AptechInheritance;

public class BankPolymorphism {
    public void deposit(double amount ){
        System.out.println("Deposited: " + amount);
    }

    public void deposit(double amount, String accountType) {
        System.out.println("Deposited: " + amount + " into " + accountType + " account");
    }

}
