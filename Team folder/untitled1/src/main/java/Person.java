import java.util.ArrayList;
import java.util.List;

public class Person {
    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public Person withAccount(Account account) {
        addAccount(account);
        return this;
    }

    public Person withAtm(ATM atm) {
        setAtm(atm);
        return this;
    }

    private List<Account> accounts = new ArrayList<Account>();;

    public ATM getAtm() {
        return atm;
    }

    public void setAtm(ATM atm) {
        this.atm = atm;
    }

    private ATM atm;
    private double cash;

}
