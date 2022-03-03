public class Account {

    private Statement statement;

    public Account(Statement statement) {
        this.statement = statement;
    }

    void deposit(int amount,String date) {
        statement.deposit(amount);
        statement.date(date);
    }

    void withdraw(int amount){

    }

    void printStatements() {
        System.out.println(statement.printStatement());
    }



}

