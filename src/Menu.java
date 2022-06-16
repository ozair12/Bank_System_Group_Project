import java.time.LocalDateTime;

public class Menu {
    public static void main(String[] args)
            throws java.io.IOException {
        char choice;/*from  w w  w  .j  ava2  s. c  om*/

        do {
            System.out.println("Please Select a Person by Selecting their Associated Number :");
            System.out.println("  1. Jon Smith");
            System.out.println("  2. Boris Johnson");
            System.out.println("  3. Donald Trump");
            System.out.println("  4. Barak Obama");
            System.out.println("  5. Hilary Clinton\n");
            System.out.println("Choose one:");
            choice = (char) System.in.read();
        } while( choice < '1' || choice > '5');

       // System.out.println("\n");

        switch(choice) {
            case '1':


                do {
                    PersonalAccount js=new PersonalAccount("Jon Smith",010506,87654321,0.00, LocalDateTime.now());
                    System.out.println("You have Selected "+js.getName());
                    System.out.println("Choose an Account to Manage for Mr. "+js.getName());
                    System.out.println("  1. Personal Account");
                    System.out.println("  2. Business Account");
                    System.out.println("  3. ISA Account");

                    choice = (char) System.in.read();
                } while( choice < '1' || choice > '3');





                        switch(choice) {
                            case '1':
                                System.out.println("if\n");
                                break;
                            case '2':
                                System.out.println("switch:\n");
                                break;
                            case '3':
                                System.out.println("while:\n");
                                break;

                        }






                break;
            case '2':
                PersonalAccount bj=new PersonalAccount("Boris Johnson",010506,87654321,0.00,LocalDateTime.now());
                System.out.println("You have Selected "+bj.getName());
















                break;
            case '3':
                PersonalAccount dt=new PersonalAccount("Donald Trump",010506,87654321,0.00,LocalDateTime.now());
                System.out.println("You have Selected "+dt.getName());














                break;
            case '4':
                PersonalAccount bo=new PersonalAccount("Barak Obama",010506,87654321,0.00,LocalDateTime.now());
                System.out.println("You have Selected "+bo.getName());

















                break;

            case '5':
                PersonalAccount hc=new PersonalAccount("Hilary Clinton",010506,87654321,0.00,LocalDateTime.now());
                System.out.println("You have Selected "+hc.getName());



















                break;
        }
    }
}