package chapter7;

public class BankAccountDemo {
    public static void main(String[] args) {
    BankAccount myAccount=new BankAccount("john",5000);
        System.out.println("owner "+myAccount.getOwner());
        System.out.println("balance"+myAccount.getBalance());
        myAccount.deposit(1000);
        myAccount.withdraw(100);
        System.out.println("baalnce"+myAccount.getBalance());
    }
}
