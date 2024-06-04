package com.banking;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        // initialize the Bank Class
        Bank bank = new Bank();

        System.out.println("Welcome to Banking system");
        System.out.println();
        System.out.println("Here is the list of choices");
        System.out.println("1. Add Account");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Check Balance");
        System.out.println("5. Display all accounts");
        System.out.println("7. Quit the application");

        int command = 0;

        while (command != 7) {
            System.out.println();
            System.out.print("Choose your choice number ");
            command = userinput.nextInt();
            userinput.nextLine();
            System.out.println();
            switch (command) {
                case 1:
                    System.out.println("Registering an account...");
                    System.out.println();
                    System.out.print("Enter the account number ");
                    int accountno = userinput.nextInt();
                    userinput.nextLine();
                    System.out.print("Who will be the owner of the account ");
                    String owner = userinput.nextLine();
                    // initialize account
                    BankAccount account = new BankAccount(accountno, owner);
                    bank.addAccount(account);
                    break;
                case 2:
                    bank.displayAllAccounts();
                    if (!bank.accounts.isEmpty()) {
                        System.out.print("Select the account number to deposit to ");
                        int accno = userinput.nextInt();
                        userinput.nextLine();

                        BankAccount selectedAcc = bank.returnAccByNo(accno);
                        if (selectedAcc == null) {
                            System.out.println("Such account does not exist in our records");
                        } else {
                            System.out.println("The account is already selected ");
                            System.out.print("Enter amount to deposit ");
                            double depositCash = userinput.nextDouble();
                            userinput.nextLine();

                            selectedAcc.depositMoney(depositCash);
                        }

                    }
                    break;
                case 3:
                    bank.displayAllAccounts();
                    if (!bank.accounts.isEmpty()) {
                        System.out.println();
                        System.out.print("Select the account number to withdraw from ");
                        int accno = userinput.nextInt();
                        userinput.nextLine();

                        BankAccount selectedAcc = bank.returnAccByNo(accno);
                        if (selectedAcc == null) {
                            System.out.println("Such account does not exist in our records");
                        } else {
                            System.out.println("The account is already selected ");
                            System.out.print("Enter amount to withdraw ");
                            double withdrawCash = userinput.nextDouble();
                            userinput.nextLine();

                            selectedAcc.withdrawMoney(withdrawCash);
                        }
                    }
                    break;
                case 4:
                    bank.displayAllAccounts();
                    if (!bank.accounts.isEmpty()) {
                        System.out.println();
                        System.out.print("Select the account number to check balance ");
                        int accno = userinput.nextInt();
                        userinput.nextLine();

                        BankAccount selectedAcc = bank.returnAccByNo(accno);
                        if (selectedAcc == null) {
                            System.out.println("Such account does not exist in our records");
                        } else {
                            System.out.println("The account you selected has a balance of " + selectedAcc.getBalance()
                                    + " shillings");
                        }
                    }
                    break;
                case 5:
                    bank.displayAllAccounts();

                case 7:
                    System.out.println("Exiting the application...");
                    break;
                default:
                    System.out.println("Invalid choice try again");
                    break;
            }

        }
        System.out.println("Successfully excited the application");
    }
}
