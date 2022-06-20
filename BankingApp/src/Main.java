import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        CurrentAccount currentAccount1 = new CurrentAccount(1, "John", "Smith", 239045, 85035972, 10, "2020/4/25");
        currentAccount1.showBalance();
        currentAccount1.depositMoney(5);
        currentAccount1.withdrawMoney(4);

        ISAaccount ISAaccount1 = new ISAaccount(2, "Samantha", "Bush", 305290, 12790500, 199, "2021/7/16");
        ISAaccount1.checkBalance();
        ISAaccount1.showBalance();
        LocalDate ld = LocalDate.of(2022,4,1);
        // LocalDate ld = LocalDate.now(); can be used it will use today`s date and will only run the code
        // once a year but for the purposes of showing the working method I am using the specific date needed
        int month = ld.getMonthValue();
        int day = ld.getDayOfMonth();
        int year = ld.getYear();

        if (month == 4) {
            if(day == 1) {
                ISAaccount1.addInterest();
            }
        }


    }
}