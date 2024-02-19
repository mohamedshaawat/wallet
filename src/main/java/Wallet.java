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
    
    
    public void deposit(int amount) {
    	if (amount >0) {
    		this.value+=amount;
            System.out.println("Deposited: " + amount);

    	}
    	
    	else {
    		System.out.println("Invalid deposit amount");
    	}
    }
    	
    public void withdraw (int amount) {
    	if (amount <0)
    	{
    		this.value-=amount;
    		System.out.println("Withdrawn:" + amount);
    	}
    	 else {
             System.out.println("Invalid withdrawal ");
         }
    		
    	}
    

    @Override
    public String toString() {
        return "Wallet{" + "value=" + value + ", transactions=" + transactions +'}';
    }

}
