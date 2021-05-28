/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sw.problem.pkg1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The main function prints all the initial options
 *
 * @author Marwan Mohamed Abd Almonem
 * @author Mohamed Ashraf Hassan
 * @author Youssef hesham mohamed
 * @version 0.1
 */
public class SWProblem1 {

    private static Scanner scanner = new Scanner(System.in);
    /**
     * aggregation of bank class.
     */
    public static Bank bank;
    /**
     * counter for client number.
     */
    public static int clients_NUM = 0;
    /**
     * list which contain arrays of accounts.
     */
    public static ArrayList<Account> accounts_List = new ArrayList<>();
    /**
     * list which contain arrays of client.
     */
    public static ArrayList<Client> clients_List = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter your bank information with recpect to: \n Name  Address  PhoneNumber");
        String bank_Name = scanner.next();
        String bank_Address = scanner.next();
        String banck_Phone = scanner.next();
        bank = new Bank(bank_Name, bank_Address, banck_Phone, accounts_List, clients_List);
        bank.setAccounts_List(accounts_List);
        bank.setClients_List(clients_List);
        ShowIntialOption();

    }

    /**
     * a menu function to display main window and select options whether to
     * enter account of enter client or to quit.
     */
    public static void ShowIntialOption() {
        System.out.println("Please select one option: \n\t 1-Enter account menu \n\t 2-Enter client menu \n\t 3-Quit");
        /**
         * variable for choice for client number.
         */
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                manageAccounts();
                break;
            case 2:
                manageClients();
                break;

            default:
                break;
        }

    }

    /**
     * a menu function to display manage account and select options whether to
     * enter Enter a normal account or a Special account or Display all accounts
     * or Back to main menu.
     */
    private static void manageAccounts() {
        System.out.println("Please Select one option: \n\t 1- Enter a normal account \n\t 2- Enter a Special account\n\t 3- Display all accounts \n\t 4- Back to main menu");
        double balance;
        int account_Number;
        int choice = scanner.nextInt();
        /**
         *
         * @param choice.
         */
        switch (choice) {
            /**
             * first case makes user enter balance and account number in normal
             * account. which contains a for loop were it check if the account
             * number is taken or not and assign it.
             */
            case 1:
                System.out.println("Enter Your Balance and the account number");
                System.out.print("The balance: ");
                balance = scanner.nextDouble();
                System.out.print("The account number: ");
                account_Number = scanner.nextInt();

                for (int i = 0; i < bank.getAccounts_List().size(); i++) {
                    if (bank.getAccounts_List().get(i).getAccount_Number() == account_Number) {
                        System.out.println("This account number is already taken \n");

                        manageAccounts();
                    }
                }
                Account account = new Account(balance, account_Number);
                accounts_List.add(account);
                manageAccounts();
                break;
            /**
             * second case makes user enter balance and account number in
             * special account. which contains a for loop were it check if the
             * account number is taken or not and assign it.
             */
            case 2:
                System.out.println("Enter Your Balance and the account number");
                System.out.print("The balance: ");
                balance = scanner.nextDouble();
                System.out.print("The account number: ");
                account_Number = scanner.nextInt();
                for (int i = 0; i < bank.getAccounts_List().size(); i++) {
                    if (bank.getAccounts_List().get(i).getAccount_Number() == account_Number) {
                        System.out.println("This account number is already taken \n");

                        manageAccounts();
                    }
                }
                SpecialAccount special_Account = new SpecialAccount(balance, account_Number);
                accounts_List.add(special_Account);
                manageAccounts();
                break;
            /**
             * third case display account list which contains account info and
             * numbers.
             *
             */
            case 3:
                display_AccountsList();
                System.out.println();
                manageAccounts();

                break;
            /**
             * forth case return to main menu.
             *
             */
            default:
                ShowIntialOption();
                break;
        }

    }

    private static void manageClients() {
        System.out.println("Please Select one option: \n\t 1- Enter a normal client \n\t 2- Enter a commercial account\n\t 3- Display all Clients\n\t 4- Display commercial clients \n\t 5 -Display normal clients \n\t 6- Back to main menu");
        String name;
        String national_ID;
        String address;
        String phone_Number;
        int choice = scanner.nextInt();
        int count = 1;
        /**
         *
         * @param choice.
         */
        switch (choice) {
            /**
             * first case allows the user to create a normal client.
             *
             */
            case 1:
                System.out.println("Enter your client info wiht recpect to: \n\t Name  National_ID  Address  Phone_Number");
                System.out.print("The Name: ");
                name = scanner.next();
                System.out.print("The national_ID: ");
                national_ID = scanner.next();
                System.out.print("The address: ");
                address = scanner.next();
                System.out.print("The phone number: ");
                phone_Number = scanner.next();
                Client client = new Client(name, national_ID, address, phone_Number);
                clients_List.add(client);
                clients_NUM++;
                Assign_Account();
                break;
            /**
             * second case allows the user to create a commercial client.
             *
             */
            case 2:
                System.out.println("Enter your client info wiht recpect to: \n\t Name  Address  Phone_Number  Commercial_ID");
                System.out.print("The name: ");
                name = scanner.next();
                System.out.print("The national_ID: ");
                national_ID = scanner.next();
                System.out.print("The address: ");
                address = scanner.next();
                System.out.print("The phone number: ");
                phone_Number = scanner.next();
                System.out.print("The commercial ID: ");
                String commercial_ID = scanner.next();
                CommercialClient commercialclient = new CommercialClient(name, address, phone_Number, commercial_ID);
                clients_List.add(commercialclient);
                clients_NUM++;
                Assign_Account();
                break;
            /**
             * third case display all clients and its info.
             *
             */
            case 3:
                bank.display();
                manageClients();
                break;
            /**
             * forth case display all normal clients .
             *
             */
            case 4:
                if (clients_List.isEmpty()) {
                    System.out.println("Your List is Empty!");
                }
                for (int i = 0; i < clients_List.size(); i++) {
                    if (clients_List.get(i).getNational_ID() == "00000000000000") {
                        System.out.println(count + ". " + clients_List.get(i));
                        count++;
                    }
                }
                manageClients();
                break;
            /**
             * fifth case display all commercial clients.
             *
             */
            case 5:

                for (Client c : clients_List) {
                    if (c.getNational_ID() != "00000000000000") {
                        System.out.println(count + ". " + c);
                    }
                }
                manageClients();
                break;
            /**
             * sixth case return to main menu.
             *
             */
            default:
                ShowIntialOption();
                break;
        }

    }

    /**
     * a void function to display account list and its info. were if account
     * list is empty display certain message or if not display the detailed info
     * .
     */
    private static void display_AccountsList() {
        int count = 1;
        if (accounts_List.isEmpty()) {
            System.out.println("Your accounts list is empty");
        } else {
            for (Account c : accounts_List) {
                System.out.println(count + ". " + "Balance: " + c.getBalance() + " , AccountNumber: " + c.getAccount_Number());
                count++;
            }
        }
    }

    /**
     * a void function to assign accounts.
     *
     */
    private static void Assign_Account() {
        if (accounts_List.size() != 0) {

            System.out.println("do you want to assign an account?!\n\t 1- yes \n\t 2- No \n\t 3- Back to main menu ");
            int choice = scanner.nextInt();
            /**
             *
             * @param choice.
             */
            switch (choice) {
                /**
                 * first case allows the user to Enter the account number of the
                 * account he want to assign to this client. if the account
                 * number is valid assign if not print certain message.
                 */
                case 1:
                    System.out.println("Enter the account number of the account you want to assign to this client: ");
                    int Number = scanner.nextInt();
                    for (int i = 0; i < accounts_List.size(); i++) {
                        if (Number == accounts_List.get(i).getAccount_Number()) {
                            clients_List.get(clients_NUM - 1).setAccount(accounts_List.get(i));
                            System.out.println("After Assiging an account: " + clients_List.get(clients_NUM - 1) + "\n");
                            Operations();
                        } else {
                            System.out.println("There is no such account");
                        }

                    }

                    break;
                /**
                 * second case returns to manage client window.
                 *
                 */
                case 2:
                    manageClients();
                    break;
                /**
                 * third case return to main menu.
                 *
                 */
                default:
                    ShowIntialOption();
                    break;
            }
        } else {
            manageClients();
        }
    }

    /**
     * a void function to allow operations on accounts.
     *
     */
    private static void Operations() {
        System.out.println("do you want to withdraw or deposit?\n\t 1- Withdraw \n\t 2- Deposit \n\t 3- Return to main menu");

        int choice;
        choice = scanner.nextInt();

        switch (choice) {
            /**
             * first case allows the user to Enter account number to withdraw
             * the desired amount of money. if the account number is valid allow
             * the operation if not print certain message.
             */
            case 1:

                System.out.println("Enter your account number");
                int Account_Number = scanner.nextInt();
                for (int i = 0; i < bank.getAccounts_List().size(); i++) {
                    if (bank.getAccounts_List().get(i).getAccount_Number() == Account_Number) {
                        System.out.println("How much you want to withdraw");
                        double amount = scanner.nextDouble();
                        bank.getAccounts_List().get(i).withdraw(amount);
                        ShowIntialOption();
                    } else {
                        System.out.println("There is no such account");
                    }
                }

                break;
            /**
             * second case allows the user to Enter the account number to
             * deposit the desired amount of money. if the account number is
             * valid allow the operation if not print certain message.
             */
            case 2:

                Account_Number = scanner.nextInt();
                System.out.println("Enter your account number");
                Account_Number = scanner.nextInt();
                for (int i = 0; i < bank.getAccounts_List().size(); i++) {
                    if (bank.getAccounts_List().get(i).getAccount_Number() == Account_Number) {
                        System.out.println("How much u want to deposit");
                        double amount = scanner.nextDouble();
                        bank.getAccounts_List().get(i).deposit(amount);
                        ShowIntialOption();
                    } else {
                        System.out.println("There is no such account");
                    }
                }
                ShowIntialOption();
                break;
            default:
                ShowIntialOption();
                break;

        }

    }

}
