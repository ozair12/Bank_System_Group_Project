import java.time.LocalDateTime;
import java.util.HashMap;

public class App {
    private HashMap<LocalDateTime,Double> statement;
    public static void main(String[] args) {
        PersonalAccount pc=new PersonalAccount("Jon Smith",010506,87654321,0.00,  LocalDateTime.now());
        pc.setStatement(pc.openingTime,pc.balance);
        System.out.println(pc.getName());
        System.out.println(pc.getOpeningTime());

        System.out.println(pc.getOpeningTime());
        pc.addMoney(100);
        System.out.println("Your balance is "+pc.getBalance());
        pc.withdrawMoney(20);
        System.out.println("Your balance is "+pc.getBalance());
        pc.setStatement(LocalDateTime.now(), pc.balance);
        System.out.print("Your balance is " + pc.getStatement());


    }
}
