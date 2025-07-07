package bank;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Account account = new Account(10000);
        System.out.println(account);
        try {
            account.withdraw(20000);
        } catch (bank.NotEnoughBalanceException e) {
            System.out.println("양수 금액을 입금 하세요");
            System.out.println(e.getMessage());
        }

        System.out.println(account);




    }
}

