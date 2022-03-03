public class StartApp {
    public static void main(String[] args) {


        Account account = new Account(new Statement());

        account.deposit(amountOf(1000), date("10/01/2021"));
/*
        account.printStatements();

        account.deposit(amountOf(2000), date("13/01/2021"));
        account.withdrawl(amountOf(500), date("14/01/2021"));

        account.printStatement(System.out);
*/

    }

    private static int amountOf(int amount) {
        return amount;
    }

    private static String date(String date) {
        return date;
    }




}
