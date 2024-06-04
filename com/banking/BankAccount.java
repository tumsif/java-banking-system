package com.banking;

public class BankAccount {
    public int accountnumber;
    private String accountowner;
    // set the balance initially to be zero
    private double balance = 0;

    public BankAccount(int accountno, String owner) {
        this.accountnumber = accountno;
        this.accountowner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void depositMoney(double deposit) {
        this.balance += deposit;
        System.out.println(
                "An amount of " + deposit + " was added to the bank account thank you for choosing our service.");
    }

    public void withdrawMoney(double withdrawal) {
        if (withdrawal > balance) {
            System.out.println("Their is no enough credits to withdraw");
        } else {
            this.balance -= withdrawal;
            System.out.println("An amount of " + withdrawal + " is removed from the account the new balance is "
                    + this.balance + ". thank you for choosing our service");
        }
    }

    public String getAccountowner() {
        return accountowner;
    }

}
