public class encapsulation {
    private String holder_name;
    private String holder_account_no;
    private int balance;

    public encapsulation(String holder_name, String holder_account_no, int balance) {
        this.holder_name = holder_name;
        this.holder_account_no = holder_account_no;
        this.balance = balance;
    }

    public String getName(String holder_name) {
        return holder_name;
    }

    public String getNo(String holder_account_no) {
        return holder_account_no;
    }

    public int getBalance(int balance) {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0)
            balance += amount;
        else
            System.out.println("amount cant be negative");
        return;
    }

    public void withdraw(int amount)
    {
        if(amount>0) {
            if (amount > balance)
                System.out.println("insufficient balance");
            else balance -= amount;
        } else
            System.out.println("cant be negative");
    }
    public void show_details(){
        System.out.println(getNo(holder_account_no));
        System.out.println(getName(holder_name));
        System.out.println(getBalance(balance));
    }
}
class Main{
    public static void main(String[] args)
    {
        encapsulation e1 = new encapsulation("Aman Belwal","12345678",30000);
        e1.deposit(5000);
        e1.show_details();
        e1.withdraw(1000);
        e1.show_details();
    }
}

