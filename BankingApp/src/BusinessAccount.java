public class BusinessAccount extends Customer{
    int sortCode;
    int accountNumber;
    double balance;
    String dateOpened;  // the date is a string for now before we figure out how to show actual date

    public BusinessAccount(int customerID, String firstName, String lastName, int sortCode, int accountNumber, double balance, String dateOpened) {
        super(customerID, firstName, lastName);
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.dateOpened = dateOpened;
    }

    public int getSortCode() {
        return sortCode;
    }

    public void setSortCode(int sortCode) {
        this.sortCode = sortCode;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDateOpened() {
        return dateOpened;
    }

    public void setDateOpened(String dateOpened) {
        this.dateOpened = dateOpened;
    }

    public void issueChequebook(){
        System.out.println("A chequebook has been issued for this client");

    }

    public void yearlyCharge() {
        // decrease the balance by 25 pounds once every year
    }

    public void showBalance(){    // method to show the current balance
        System.out.println("The customers` balance is: " + getBalance());
    }

    public void depositMoney(int amount) {    // method for depositing money into the account
        System.out.print("Balance after deposit: ");
        System.out.println(balance = balance + amount);
    }

    public void withdrawMoney(int amount) {
        System.out.print("Balance after withdraw: ");
        System.out.println(balance = balance - amount);
    }

}