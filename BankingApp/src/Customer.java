public abstract class Customer {  // Creating a parent class for customer
    int customerID;
    String firstName;
    String lastName;

    public Customer(int customerID, String firstName, String lastName){
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public int getCustomerID() {     // Creating getter and setter for customer ID
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getFirstName() {     // Creating getter and setter for First Name
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {        // Creating getter and setter for last name
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
