import java.util.List;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank();

        // Membuat tiga objek akun
        Account acc1 = new Account("Irene_SI4601", 327372917, 1000000);
        Account acc2 = new Account("Nina", 999882233, 2000000);
        Account acc3 = new Account("Ilham", 333226677, 1500000);

        // Menyimpan akun ke dalam bank
        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.addAccount(acc3);

        // Show All Account
        List<Account> allAccounts = bank.getAllAccount();
        for (Account account : allAccounts) {
            System.out.println("Saldo Akun " + account.getName() + ": " +  account.getBalance());
        }

        // Menarik dan menyetor saldo
        acc1.Deposit(50000.0);
        acc3.Withdraw(120000.0);

        // Show Account setelah transaksi
        System.out.println("\n");
        System.out.println("Saldo Akun " + acc1.getName() + " setelah menyetor: " + acc1.getBalance());
        System.out.println("Saldo Akun " + acc3.getName() + " setelah menarik uang: " + acc3.getBalance());

        // Menghapus akun yang dipilih
        System.out.println("\n");
        String nameAccount = "Nina";
        bank.removeAccount(nameAccount);

        // Menampilkan daftar semua akun setelah penghapusan satu akun
        allAccounts = bank.getAllAccount();
        System.out.println("\nDaftar Semua Akun dalam Bank:");
        for (Account account : allAccounts) {
            System.out.println("Nama: " + account.getName() + ", Nomor Akun: " + account.getAccountNumber() + ", Saldo: " + account.getBalance());
        }  
        
    }
}
