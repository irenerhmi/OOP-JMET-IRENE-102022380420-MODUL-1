import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    //List utk menampung akun
    public Bank() {
        accounts = new ArrayList<>();
    }

    //Menambahkan akun ke list
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // method untuk menghapus akun dari bank
    //pake acc number
    public void removeAccount(String name) {
        for (int i = 0; i < accounts.size(); i++) {
            Account account = accounts.get(i);
            if (account.getName() == name) {
                accounts.remove(i);
                System.out.println("Akun " + name + " Berhasil Dihapus!");
                break;
            }
        }

    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public List<Account> getAllAccount() {
        return accounts;
        
    }

}
