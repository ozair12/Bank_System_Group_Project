import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {
        PersonalAccount pc=new PersonalAccount("Jon Smith",010506,87654321,0.00, LocalDateTime.now());
         System.out.println(pc.getName());
        System.out.println(pc.getOpeningTime());

        System.out.println(pc.getOpeningTime());
    }
}
