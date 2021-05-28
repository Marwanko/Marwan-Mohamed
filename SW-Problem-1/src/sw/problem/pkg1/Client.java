package sw.problem.pkg1;

/**
 * The client class
 *
 * @author Mohamed Ashraf Hassan
 * @version 0.1
 */
public class Client {

    /**
     * The name of the client.
     */
    private String Client_Name;
    /**
     * The national ID of the client.
     */
    private String National_ID;
    /**
     * The address of the client.
     */
    private String Client_Address;
    /**
     * The phone number of the client.
     */
    private String Phone_Number;
    /**
     * an aggregation relation between the client and the account.
     */
    protected Account account;

    /**
     * a parameterized constructor for the class.
     *
     * @param name the name of the client.
     * @param national_ID the national ID of the client.
     * @param address the address of the client.
     * @param phone_Number the phone number of the client.
     * @param account the account of the client.
     */
    public Client(String name, String national_ID, String address, String phone_Number, Account account) {
        this.Client_Name = name;
        this.National_ID = national_ID;
        this.Client_Address = address;
        this.Phone_Number = phone_Number;
        this.account = account;
    }

    /**
     * a parameterized constructor for the class without the account.
     *
     * @param name the name of the client.
     * @param national_ID the national ID of the client.
     * @param address the address of the client.
     * @param phone_Number the phone number of the client.
     */
    public Client(String name, String national_ID, String address, String phone_Number) {
        this.Client_Name = name;
        this.National_ID = national_ID;
        this.Client_Address = address;
        this.Phone_Number = phone_Number;
    }

    /**
     * a getter function to get the name.
     *
     * @return the name of the client.
     */
    public String getName() {
        return Client_Name;
    }

    /**
     * a setter function to set the name.
     *
     * @param name the name of the client.
     */
    public void setName(String name) {
        this.Client_Name = name;
    }

    /**
     * a getter function to get the national ID.
     *
     * @return the national ID of the client.
     */
    public String getNational_ID() {
        return National_ID;
    }

    /**
     * a setter function to set the national ID.
     *
     * @param national_ID the national ID of the client.
     */
    public void setNational_ID(String national_ID) {
        this.National_ID = national_ID;
    }

    /**
     * a getter function to get the address.
     *
     * @return the address of the client.
     */
    public String getAddress() {
        return Client_Address;
    }

    /**
     * a setter function to set the address.
     *
     * @param address the address of the client.
     */
    public void setAddress(String address) {
        this.Client_Address = address;
    }

    /**
     * a getter function to get the phone number.
     *
     * @return the phone number of the client.
     */
    public String getPhone_Number() {
        return Phone_Number;
    }

    /**
     * a setter function to set the phone number.
     *
     * @param phone_Number the phone number of the client.
     */
    public void setPhone_Number(String phone_Number) {
        this.Phone_Number = phone_Number;
    }

    /**
     * a getter function to get the account.
     *
     * @return the account of the client.
     */
    public Account getAccount() {
        return account;
    }

    /**
     * a setter function to set the account.
     *
     * @param account the account of the client.
     */
    public void setAccount(Account account) {
        this.account = account;
    }

    /**
     * string function to print the client info.
     *
     * @return client info which is name, national ID, address, phone number and
     * account.
     */
    @Override
    public String toString() {
        return "Client{" + "name=" + Client_Name + ", national_ID=" + National_ID + ", address=" + Client_Address + ", phone_Number=" + Phone_Number + ", account=" + account + '}';
    }

}
