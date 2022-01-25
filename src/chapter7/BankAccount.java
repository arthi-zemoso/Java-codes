package chapter7;

public class BankAccount {
    private String owner;
    private int balance;
    public BankAccount(String owner)
    {
        this(owner,0);
    }
    public BankAccount(String owner,int balance)
    {
        this.owner=owner;
        this.balance=balance;
    }
    public void deposit(int value)
    {
        if(value>=0)
            balance+=value;
        else
            System.out.println("put deposit>0");
    }
    public void withdraw(int amount)
    {
        if(amount>0 &&  amount<=balance)
            balance-=amount;
        else
            System.out.println("the amt to be deposited>0");
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }
}
