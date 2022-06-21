import java.time.LocalDateTime;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args)
            throws java.io.IOException {
        PersonalAccount JSPA=new PersonalAccount("Jon Smith",010506,87654321,1000.00, LocalDateTime.now());
        BusinessAccount JSBA= new BusinessAccount("Jon Smith",020607,97531864,10000.00,LocalDateTime.now());
        ISAAccount JSISA =new ISAAccount("Jon Smith", 030405,12345678,1000.00,LocalDateTime.now());
        PersonalAccount BJPA=new PersonalAccount("Boris Johnson",010506,87654321,0.00,LocalDateTime.now());
        BusinessAccount BJBA =new BusinessAccount("Boris Johnson", 735686,95498621,1000.0,LocalDateTime.now());
        ISAAccount BJISA=new ISAAccount("Boris Johnson",325242,99655642,1000.0,LocalDateTime.now());
        char choice;
        Scanner sc=new Scanner(System.in);

        do {
            System.out.println("Please Select a Person by Selecting their Associated Number :");
            System.out.println("  1. Jon Smith");
            System.out.println("  2. Boris Johnson");

            System.out.println("Choose one:");
            choice = (char) System.in.read();
        } while( choice < '1' || choice > '2');


        // System.out.println("\n");

        switch(choice) {
            case '1':


                do {

                    System.out.println("You have Selected "+JSPA.getName());
                    System.out.println("Choose an Account to Manage for Mr. "+JSPA.getName());
                    System.out.println("  1. Personal Account");
                    System.out.println("  2. Business Account");
                    System.out.println("  3. ISA Account");

                    choice = (char) System.in.read();
                } while( choice < '1' || choice > '3');





                switch(choice) {
                    case '1':
                        do {
                            System.out.println("Type a Number Associated with Action on  "+JSPA.getName()+"'s Personal Account");
                            System.out.println("  1. Add Money");
                            System.out.println("  2. Withdraw Money");
                            System.out.println("  3. Check Balance");
                            System.out.println("  4. Transfer Money");
                            System.out.println("  5. Display Statement");

                            System.out.println("Choose one:");
                            choice = (char) System.in.read();
                        } while( choice < '1' || choice > '5');

                        System.out.println("\n");

                        switch(choice) {
                            case '1':
                                System.out.println("Enter the Amount to deposit in floating point Number.");
                                double val= sc.nextDouble();
                                JSPA.setBalance(val);
                                JSPA.setStatement(LocalDateTime.now(), JSPA.balance);
                                System.out.println("The account balance after deposit is "+JSPA.getBalance());

                                break;
                            case '2':
                                System.out.println("Enter the Amount to withdraw in floating point Number.");
                                double out= sc.nextDouble();
                                JSPA.withdrawMoney(out);
                                JSPA.setStatement(LocalDateTime.now(), JSPA.balance);
                                System.out.println("The account balance after withdrawal is "+JSPA.getBalance());
                                break;
                            case '3':
                                System.out.println("Current Balance on the account is "+JSPA.getBalance());
                                break;
                            case '4':
                                System.out.println("do-while:\n");
                                break;
                            case '5':
                                System.out.println("Printing Account Statement for "+JSPA.getName() +"\n  "  + JSPA.getStatement());
                                break;

                        }


















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


        }
    }
}