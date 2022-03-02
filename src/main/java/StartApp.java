public class StartApp {
    public static void main(String[] args) {


        Account account = new Account(new Statement());

        account.deposit(amount(1000), date("10/01/2021"));
        account.deposit(amount(2000), date("13/01/2021"));
        account.withdrawl(amount(500), date("14/01/2021"));

        account.printStatement(System.out);

    }



}
