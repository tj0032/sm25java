package bank;

public class bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        System.out.println(account1);
        Account account2 = new Account(10000);
        // account2.balance = 10000000000.0;
        System.out.println(account2);
        account2.deposit(10000);
        System.out.println(account2);
        System.out.println(account2.getBalance());

        account2.withdraw(10000);



    }
}
