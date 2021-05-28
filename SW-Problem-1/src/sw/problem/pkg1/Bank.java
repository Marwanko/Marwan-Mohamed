/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sw.problem.pkg1;

import java.util.ArrayList;
import static sw.problem.pkg1.SWProblem1.clients_List;

/**
 * The bank class
 *
 * @author Youssef hesham mohamed
 * @version 0.1
 */
public class Bank {

    /**
     * The name of the Bank.
     */
    private String Bank_Name;
    /**
     * The address of the Bank.
     */
    private String Bank_Address;
    /**
     * The phone number of the Bank.
     */
    private String Bank_Phone;
    /**
     * The detailed info of the Accounts.
     */
    private ArrayList<Account> accounts_List;
    /**
     * The detailed info of the clients.
     */
    private ArrayList<Client> clients_List;

    /**
     * a parameterized constructor for the class.
     *
     * @param name the name of the Bank.
     * @param address address of the Bank.
     * @param phone the phone number of the Bank.
     * @param accounts_List The detailed info of the Accounts.
     * @param clients_List The detailed info of the clients.
     */
    public Bank(String name, String address, String phone, ArrayList<Account> accounts_List, ArrayList<Client> clients_List) {
        this.Bank_Name = name;
        this.Bank_Address = address;
        this.Bank_Phone = phone;
        this.accounts_List = accounts_List;
        this.clients_List = clients_List;
    }

    /**
     * a getter function to get the accounts info.
     *
     * @return the detailed info list of the saved accounts .
     */
    public ArrayList<Account> getAccounts_List() {
        return accounts_List;
    }

    /**
     * a setter function to set the account info.
     *
     * @param accounts_List the accounts list.
     */
    public void setAccounts_List(ArrayList<Account> accounts_List) {
        this.accounts_List = accounts_List;
    }

    /**
     * a getter function to get the client info.
     *
     * @return the detailed info of the client.
     */
    public ArrayList<Client> getClients_List() {
        return clients_List;
    }

    /**
     * a setter function to set the client info.
     *
     * @param clients_List the clients list.
     */
    public void setClients_List(ArrayList<Client> clients_List) {
        this.clients_List = clients_List;
    }

    /**
     * a getter function to the name of the bank.
     *
     * @return the name of the bank.
     */
    public String getName() {
        return Bank_Name;
    }

    /**
     * a setter function to set the bank name.
     *
     * @param name the bank name.
     */
    public void setName(String name) {
        this.Bank_Name = name;
    }

    /**
     * a getter function to get the bank address.
     *
     * @return the bank address.
     */
    public String getAddress() {
        return Bank_Address;
    }

    /**
     * a setter function to set bank address.
     *
     * @param address the bank address.
     */
    public void setAddress(String address) {
        this.Bank_Address = address;
    }

    /**
     * a getter function to get bank phone.
     *
     * @return bank phone.
     */
    public String getPhone() {
        return Bank_Phone;
    }

    /**
     * a setter function to set the bank phone.
     *
     * @param phone the bank phone number.
     */
    public void setPhone(String phone) {
        this.Bank_Phone = phone;
    }

    /**
     * a function to display the clients with its accounts info. it check if the
     * client is empty or not to display the info where if empty print list is
     * empty or if not display the desired function
     *
     */
    public void display() {
        int count = 1;
        if (clients_List.isEmpty()) {
            System.out.println("Your List is Empty! ");
        } else {

            for (Client c : clients_List) {
                System.out.println(count + ". " + c);
                count++;
            }

        }
    }

    /**
     * string function to print the bank info.
     *
     * @return bank info .
     */
    @Override
    public String toString() {
        return "Bank{" + "name=" + Bank_Name + " , address=" + Bank_Address + " , phone=" + Bank_Phone + " , accounts_List=" + accounts_List + " , clients_List=" + clients_List + '}';
    }

}
