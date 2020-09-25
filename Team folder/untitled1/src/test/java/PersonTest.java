import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class PersonTest {
    @Test
    public void personTest () throws Exception {

        Person person = new Person();

        Account account = new Account();

        Transaction transaction = new Transaction();

        ATM atm = new ATM();

        person.withAccount(account).withAtm(atm);
        person.setCash(0);

        account.withTransaction(transaction).setBalance(100);
        transaction.setProcessing(false);

        atm.withTransaction(transaction);
    }

    @Test
    public void personTest2 () throws Exception {

        Person person = new Person();

        Account account = new Account();

        Transaction transaction = new Transaction();

        ATM atm = new ATM();

        person.withAccount(account).withAtm(atm);
        person.setCash(10);

        account.withTransaction(transaction).setBalance(90);
        transaction.setProcessing(false);

        atm.withTransaction(transaction);
    }

    @Test
    public void personTest3 () throws Exception {
        Person person = new Person();

        Account account = new Account();

        Transaction transaction = new Transaction();

        ATM atm = new ATM();

        person.withAccount(account).withAtm(atm);
        person.setCash(10);

        account.withTransaction(transaction).setBalance(90);
        transaction.setProcessing(false);

        atm.withTransaction(transaction);

        assertEquals(atm.getTransactions().get(0), transaction);
        assertEquals(person.getAccounts().get(0), account);

    }
}
