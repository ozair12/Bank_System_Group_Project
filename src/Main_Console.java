import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;

public class Main_Console {


    public static void main(String[]args){


    Acc_Methods method = new Acc_Methods();


        CurrentAccount currentAcc = new CurrentAccount();
        BusinessAccount businessAccount = new BusinessAccount();
        ISAAccount isaAccount = new ISAAccount();
        businessAccount.setSortCode("098765");
        currentAcc.setSortCode("123456");
        isaAccount.setSortCode("456789");

        CurrentAccount JSPA=new CurrentAccount("Jon Smith",currentAcc.getSortCode(),87654321,1000.00);
        CurrentAccount BJPA=new CurrentAccount("Boris Johnson",currentAcc.getSortCode(),87654321,0.00);
        BusinessAccount JSBA= new BusinessAccount("Jon Smith",businessAccount.getSortCode(),97531864,10000.00);
        BusinessAccount BJBA =new BusinessAccount("Boris Johnson", businessAccount.getSortCode(),95498621,1000.0);
        ISAAccount JSISA =new ISAAccount("Jon Smith", isaAccount.getSortCode(), 12345678,1000.00);
        ISAAccount BJISA=new ISAAccount("Boris Johnson",isaAccount.getSortCode(),99655642,1000.0);




        ArrayList<BusinessAccount> businessAccounts = new ArrayList<>();
        ArrayList<ISAAccount>isaAccounts = new ArrayList<>();
        ArrayList<CurrentAccount> Currentacc = new ArrayList<>();
        Currentacc.add(JSPA);

        Scanner name = new Scanner(System.in);

        System.out.println("Enter the customer's first name");
        String firstName = name.next();

        System.out.println("Enter the customer's last name");
String lastName = name.next();



        for(int i = 0; i < Currentacc.toArray().length; i++){
            if(Currentacc.get(i).getName().equals(firstName + " " + lastName) ){
                System.out.println("true");

            }else{
                System.out.println("false");
                System.out.println(Currentacc.get(i).getName());
            }
        }



}





}
