
public class YourFirstAccount {

    public static void main(String[] args) {
        Account agataAccount = new Account("Agata's account", 100);
        
        agataAccount.deposit(20);
        
        System.out.println(agataAccount);
    }
}
