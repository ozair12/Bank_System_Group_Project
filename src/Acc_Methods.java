import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Acc_Methods {

    private long amount;
    long sortcode;
    long accountNumber;
    String Name;

    public static void details(){

Scanner Input = new Scanner(System.in);

        // First input is for name
        //These conditions check whether name entered contains only letters
        System.out.println("Enter your name");
        String name = Input.next();

        Boolean result = name.matches("[a-zA-Z]+");
System.out.println(result);

while (result == false){
           System.out.println("Name should only contain letters");
    System.out.println("Enter the customer name");
     name = Input.next();
     result = name.matches("[a-zA-Z]+");

}

// This is where the user inputs the sort code
        // There are conditions to check whether the sortcode is greater than or less than 6

        System.out.println("Enter the customer sort code");
        String sortcode = Input.next();
result = sortcode.matches("[a-zA-Z]+");
System.out.println(result);

        while((sortcode.length() > 6) || (sortcode.length() < 6) || (result == true) ){
            System.out.println("Sort code  should only contain numbers and should only be 6 digits");
            System.out.println("Enter a valid sort code");
            sortcode = Input.next();
            sortcode = String.valueOf(sortcode);
            result = sortcode.matches("[a-zA-z]+");
            System.out.println(result);
        }
// This is where the user inputs the account number
        // There are conditions to check whether the number is greater than or less than 8
        System.out.println("Enter account number");
        String AccountNumber = Input.next();


result = AccountNumber.matches("[a-zA-z]+");
while((AccountNumber.length() > 8) || (AccountNumber.length() < 8) || (result == true)){

    System.out.println("Account number should only contain numbers and should only be 8 digits");
    System.out.println("Enter a valid account number");
    AccountNumber = Input.next();
    result = AccountNumber.matches("[a-zA-z]+");

}
        System.out.println("Enter Amount");
        String amount = Input.next();
        result  = amount.matches("[a-zA-z]+");
        while(result == true) {
System.out.println("Amount should only contain numbers");
            amount = Input.next();
            result  = amount.matches("[a-zA-z]+");

        }

    }

    public static void AddMoney( double amount,String classType, CurrentAccount personal){

        if(classType == "PersonalAccount"){
            double NewBalance = amount + personal.getBalance();
            personal.setBalance(NewBalance);
            System.out.println("Customer Name:" + " " + personal.getName());
            System.out.println("Account Number: "  + " " + personal.getAccountNumber() );
            System.out.println("New balance:" + " " +  personal.getBalance() );
        }

    }
    public static void AddMoney( double amount,String classType, BusinessAccount businessAccount){

        if(classType == "BusinessAccount"){
            double NewBalance = amount + businessAccount.getBalance();
            businessAccount.setBalance(NewBalance);
            System.out.println("Customer Name:" + " " + businessAccount.getName());
            System.out.println("Account Number: "  + " " + businessAccount.getAccountNumber() );
            System.out.println("New balance:" + " " +  businessAccount.getBalance() );
        }

    } public static void AddMoney( double amount,String classType, ISAAccount isaAccount){

        if(classType == "ISAAcount"){
            double NewBalance = amount + isaAccount.getBalance();
            isaAccount.setBalance(NewBalance);
            System.out.println("Customer Name:" + " " + isaAccount.getName());
       System.out.println("Account Number: "  + " " + isaAccount.getAccountNumber() );
       System.out.println("New balance:" + " " +  isaAccount.getBalance() );


        }

    }
    public static void WithdrawMoney( double amount,String classType, CurrentAccount personal){

        if(classType == "PersonalAccount"){
            double NewBalance = personal.getBalance() - amount ;
            personal.setBalance(NewBalance);
            System.out.println("Customer Name:" + " " + personal.getName());
            System.out.println("Account Number: "  + " " + personal.getAccountNumber() );
            System.out.println("New balance:" + " " +  personal.getBalance() );
        }

    }
    public static void WithdrawMoney( double amount,String classType, BusinessAccount businessAccount){

        if(classType == "BusinessAccount"){
            double NewBalance = businessAccount.getBalance() - amount;
            businessAccount.setBalance(NewBalance);
            System.out.println("Customer Name:" + " " + businessAccount.getName());
            System.out.println("Account Number: "  + " " + businessAccount.getAccountNumber() );
            System.out.println("New balance:" + " " +  businessAccount.getBalance() );
        }

    } public static void WithdrawMoney( double amount,String classType, ISAAccount isaAccount){

        if(classType == "ISAAcount"){
            double NewBalance = isaAccount.getBalance() - amount;
            isaAccount.setBalance(NewBalance);
            System.out.println("Customer Name:" + " " + isaAccount.getName());
            System.out.println("Account Number: "  + " " + isaAccount.getAccountNumber() );
            System.out.println("New balance:" + " " +  isaAccount.getBalance() );


        }

    }
public static void CheckBalance(){

}

public static void TransferMoney(int amount, String Account_Type){


}


}
