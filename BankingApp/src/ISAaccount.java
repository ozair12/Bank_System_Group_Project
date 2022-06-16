public class ISAaccount extends Customer {
    int sortCode;
    int accountNumber;
    double balance;       // cannot be less than 100, if balance < 100 show warning
    String dateOpened;


    public ISAaccount(int customerID, String firstName, String lastName, int sortCode, int accountNumber, double balance, String dateOpened) {
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

    public void showBalance(){               // method to show the current balance
        System.out.println("The customers` balance is: " + getBalance());
    }

    public void checkBalance() {
        if (balance <= 100)
        {
            System.out.println("Balance in ISA account can not be less than 100 please deposit money!");
        }
    }

    public void depositMoney(int amount) {    // method for depositing money into the account
        System.out.print("Balance after deposit: ");
        System.out.println(balance = balance + amount);
    }

    public void withdrawMoney(int amount) {
        System.out.print("Balance after withdraw: ");
        System.out.println(balance = balance - amount);
    }

    public void addInterest() {
        // method for incrementing the balance by 2% between 31st March and 1st April
    }

    public void transferMoney(){
        //method fot transferring money between accounts
    }
}
