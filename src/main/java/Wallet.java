import java.util.ArrayList;
import java.util.List;

public class Wallet {

    private int value;
    private List<Transaction> transactions;

    public Wallet(int value) {
        this.value = value;
        this.transactions = new ArrayList<>();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    @Override
    public String toString() {
        return "Wallet{" + "value=" + value + ", transactions=" + transactions +'}';
    }

}
