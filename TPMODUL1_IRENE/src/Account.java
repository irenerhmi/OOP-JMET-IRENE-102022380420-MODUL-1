public class Account {
    private String name;
    private int accountNumber;
    private int balance;

    //Constructor dgn parameter
    public Account(String name, int accountNumber, int balance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //GET dr parameter
    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    //method deposit (setor uang) dgn parameter saldo
    //void tdk mengembalikan nilai
    public void Deposit(double saldo) {
        if (saldo > 0) {
            balance += saldo;
        } else {
            System.out.println("Deposit tidak berhasil");
        }
    }

    //method witdraw (mengambil uang) dgn parameter saldo
    //mengembalikan nilai
    public boolean Withdraw(double saldo) {
        if (saldo > 0 && balance >= saldo) {
            balance -= saldo;
            return true;
        } else {
            System.out.println("Withdraw tidak berhasil");
            return false;
        }
    }

}
