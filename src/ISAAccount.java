import java.time.LocalDateTime;

public class ISAAccount extends Account{
    public ISAAccount(String name, int sortCode, int accountNumber, double balance, LocalDateTime openingTime) {
        super(name, sortCode, accountNumber, balance, openingTime);
    }

}
