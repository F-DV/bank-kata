public class Statement implements  FilterStatement{

    private String date;
    private int balance;

    public Statement() {}

    @Override
    public void withdraw(int amount) {this.balance -= amount;}

    @Override
    public void deposit(int amount) {this.balance += amount;}

    @Override
    public void date(String date) {this.date = date;}

    //todo Crear formato String para la tabla de salida
    public String printStatement(){
        return "";
    }

}
