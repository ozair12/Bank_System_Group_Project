public class Main {
    public static void main(String[] args) {
        CurrentAccount currentAccount1 = new CurrentAccount(1, "John", "Smith", 239045, 85035972, 10, "2020/4/25");
        currentAccount1.showBalance();
        currentAccount1.depositMoney(5);
        currentAccount1.withdrawMoney(4);

        ISAaccount ISAaccount1 = new ISAaccount(2, "Samantha", "Bush", 305290, 12790500, 99, "2021/7/16");
        ISAaccount1.checkBalance();

    }
}