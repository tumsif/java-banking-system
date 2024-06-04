package com.banking;

import java.util.ArrayList;

public class Bank {
    ArrayList<BankAccount> accounts = new ArrayList<>();

    public void addAccount(BankAccount account) {
        accounts.add(account);
        System.out.println("An account was added successfully");
    }

    public BankAccount returnAccByNo(int accno) {
        for (BankAccount account : accounts) {
            if (accno == account.accountnumber) {
                return account;
            }
        }
        // if account not found return null
        return null;
    }

    public void displayAllAccounts() {
        System.out.println("Displaying all the accounts");
        if (accounts.isEmpty()) {
            System.out.println("Nothing to show here no account registered.");
        } else {
            for (BankAccount account : accounts) {
                System.out
                        .println("Acc no - " + account.accountnumber + ", Account owner - " + account.getAccountowner()
                                + ", Balance - " + account.getBalance());
            }
        }

    }
}