import java.time.LocalDateTime;

public class BusinessAccount extends Account{
    public BusinessAccount(String name, int sortCode, int accountNumber, double balance,LocalDateTime openingTime) {
        super(name, sortCode, accountNumber, balance, openingTime);
    }
}
