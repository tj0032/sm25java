package bank;

import javax.security.auth.login.AccountException;

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

    public void deposit(double money) throws AccountException {
        if(money < 0) {
            throw new NegativeArraySizeException("Ex002");
        }
        this.balance += money;
        System.out.printf("입금처리 완료: \n");

    }

    public void withdraw(double money) throws NotEnoughBalanceException {
        // 출금 금액이 balance보다 커야 한다.
        if (money > this.balance) {
            throw new NotEnoughBalanceException("EX0001");
        }
        this.balance -= money;
        System.out.printf("당행 출금 완료: \n");
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
