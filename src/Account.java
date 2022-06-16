import java.time.LocalDateTime;

public class Account {
    String name;
    int sortCode=000000;
    int accountNumber=00000000;
    double balance=0;

    public LocalDateTime openingTime;

    public LocalDateTime getOpeningTime() {
        return openingTime;
    }

    public Account(String name, int sortCode, int accountNumber, double balance, LocalDateTime openingTime) {
        this.name = name;
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.openingTime=LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
