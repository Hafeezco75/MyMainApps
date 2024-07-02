package ElecronicStore;

import java.util.ArrayList;
import java.util.List;

public class Users extends Estore {

    private int age;
    private String emailAddress;
    private String homeAddress;
    private String name;
    private String password;
    private String phone;
    private Customers customers;
    private Admin admin;

    private List<Customers> customersList = new ArrayList<>();
    private int noOfCustomers;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCustomers(Customers customers) {
        this.customers = customers;
    }

    public int getCustomers(){ return noOfCustomers; }

    public void registerCustomers(BillingInformation billingInformation, ShoppingCart shoppingCart) {
        Customers addCustomer = new Customers();
        addCustomer.setCustomers(customers);
        customersList.add(addCustomer);
        noOfCustomers++;
    }










}
