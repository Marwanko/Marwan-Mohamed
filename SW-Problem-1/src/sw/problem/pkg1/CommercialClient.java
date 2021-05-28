/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sw.problem.pkg1;

/**
 * The commercial client class inherits from the client class
 *
 * @author Mohamed Ashraf Hassan
 * @version 0.1
 */
public class CommercialClient extends Client {

    /**
     * the commercial ID of the CommercialClient.
     */
    private String commercial_ID;

    /**
     * a parameterized constructor for the class. national_ID the national ID of
     * the client that equal "00000000000000".
     *
     * @param name the name of the client.
     * @param address the address of the client.
     * @param phone_Number the phone number of the client.
     * @param account the account of the client.
     * @param commercial_ID the commercial ID of the client.
     */
    public CommercialClient(String name, String address, String phone_Number, Account account, String commercial_ID) {
        super(name, "00000000000000", address, phone_Number, account);
        this.commercial_ID = commercial_ID;
    }

    /**
     * a parameterized constructor for the class without account. national_ID
     * the national ID of the client that equal "00000000000000".
     *
     * @param name the name of the client.
     *
     * @param address the address of the client.
     * @param phone_Number the phone number of the client.
     * @param commercial_ID the commercial ID of the client.
     */
    public CommercialClient(String name, String address, String phone_Number, String commercial_ID) {
        super(name, "00000000000000", address, phone_Number);
        this.commercial_ID = commercial_ID;
    }

    /**
     * a getter function to get the commercial ID.
     *
     * @return the commercial ID of the client.
     */
    public String getCommercial_ID() {
        return commercial_ID;
    }

    /**
     * a setter function to set the commercial ID.
     *
     * @param commercial_ID the commercial ID of the client.
     */
    public void setCommercial_ID(String commercial_ID) {
        this.commercial_ID = commercial_ID;
    }

    /**
     * string function to print the Commercial client info.
     *
     * @return client info which is name, Commercial ID, address, phone number
     * and account.
     */
    @Override
    public String toString() {
        return "CommercialClient{ " + "Name:" + this.getName() + ", Commercial_ID=" + commercial_ID + ", Address:" + this.getAddress() + ", Phone number:" + this.getPhone_Number() + ", Account: " + this.getAccount() + '}';

    }

}
