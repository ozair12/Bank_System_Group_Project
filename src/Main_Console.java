import java.util.Scanner;

public class Main_Console {

   private static  ISAAccount JOHN = new ISAAccount("JOHN", 1234567, 323334446,3000);
  private static ISAAccount JACOB= new ISAAccount("JACOB", 1234567, 7632,3000);
  private static ISAAccount DANIAL = new ISAAccount("DANIAL", 1234567, 26773476,3000);

  private static  CurrentAccount jacob = new CurrentAccount("jacob", 123456,377377,2000);
  private static CurrentAccount danial = new CurrentAccount("danial", 123456,22434234,2000);
   private static CurrentAccount john = new CurrentAccount("john", 123456,2323231,2000);

  private  BusinessAccount Jacob = new BusinessAccount("Jacob", 1234567,232323,1000);
  private  BusinessAccount Danial = new BusinessAccount("Danial", 1234567,2323243,1000);
    private static  BusinessAccount John = new BusinessAccount("John", 1234567,32213,1000);

    public static void main(String[]args){

    Acc_Methods method = new Acc_Methods();



    System.out.println("Please Select a Person by Selecting their Associated Number :");
    System.out.println("  1. John");
    System.out.println("  2. Jacob");
    System.out.println("  3. Danial");

Scanner input = new Scanner(System.in);
int option = input.nextInt();

    System.out.println("Which service do you require");
    System.out.println("1: Add money" + " " + "2: Withdraw money"  + " " + "3:Check balance"+ " " + "4:Transfer money");
    System.out.println("Enter 1 , 2, 3 or 4");

    int service = input.nextInt();


    while(service < 1 || service > 4){
        System.out.println("Enter a value between 1, 2, 3 or 4");
        service = input.nextInt();

    }

    System.out.println("Which account do you want");
    System.out.println("1: Current Account" + " " + "2: Business Account" + " " +  "3: ISA Account");
    System.out.println("Enter 1 , 2 or 3");

    int account = input.nextInt();


    while(account < 1 || account > 3 ){
        System.out.println("Enter a value between 1, 2 and 3");
        account = input.nextInt();

    }
int amount;
    if(service == 1 ){

System.out.println("Enter the amount ou wish to add");
 amount = input.nextInt();

        switch(account){

            case 1 ->  method.AddMoney(amount, "PersonalAccount",john);
            case 2 -> method.AddMoney(amount,"BusinessAccount",John);
            case 3 -> method.AddMoney(amount,"ISAAccount",JOHN);

        }

    }else if (service == 2){

        System.out.println("Enter the amount you wish to withdraw");
        amount = input.nextInt();
        switch(account){

            case 1 ->  method.WithdrawMoney(amount, "PersonalAccount",john);
            case 2 -> method.WithdrawMoney(amount, "BusinessAccount",John);
            case 3 -> method.WithdrawMoney(amount, "ISAAccount",JOHN);

        }
    }





}





}
