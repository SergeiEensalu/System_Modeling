
import java.util.ArrayList;
import java.util.List;

public class ATM {
    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void addTransaction(Transaction transaction) {
        this.transactions.add(transaction);
    }

    public ATM withTransaction(Transaction transaction) {
        addTransaction(transaction);
        return this;
    }

    private List<Transaction> transactions = new ArrayList<Transaction>();


}
