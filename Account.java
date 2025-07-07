public class Account
{
    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name)
    {
        this.id = id;
        this.name = name;
    }
    public Account(String id, String name, int balance)
    {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public int getBalance()
    {
        return = balance;
    }
    public int credit()
    {
        this.balance += amount;
        return this.balance;
    }
    public int debit()
    {
        if(amount<=balance)
        {
            this.balance -= amount;
        }
        else
        {
            System.out.println("Account exceeded balance");
        }
        return balance;
    }
    
}