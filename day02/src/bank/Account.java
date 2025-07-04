package bank;

public class Account{
    private String accNo;
    private double balance;

    public Account() {
        this.accNo = "111111";
        this.balance = 0;
    }

    public  Account(double balance){
        this.accNo = "222222";
        this.balance = balance;
    }

    public Account(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;

    }

    public void deposit(double money) {
        this.balance += money;
        System.out.printf("입금처리 완료: \n");

    }

    public void withdraw(double money) {
        // 출금 금액이 balance보다 커야 한다.
        if (this.balance > money) {
            System.out.printf("잔액부족: \n");
        }
        this.balance -= money;
        System.out.printf("당행 출금: \n");
    }

    public void withdraw(double money, String acc) {
        this.balance -= money;
        System.out.printf("타행 출금: %s \n", acc);

    }

    @Override
    public String toString() {
        return "Account{" +
                "accNo='" + accNo + '\'' +
                ", balance=" + balance +
                '}';
    }

    public double getBalance() {
        return this.balance;
    }
}
