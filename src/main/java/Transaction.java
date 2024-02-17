import java.util.*;

public class Transaction {
	
	private String type ;
	private int value ;
	private String description;
	private Date date;
	
	
	 public Transaction(String type, int value, String description, Date date) {
	        this.type = type;
	        this.value = value;
	        this.description = description;
	        this.date = date;
	    }

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
	 
	 public String toString() {
		 return "Transaction{" + "type='" + type + 
	                ", value=" + value +
	                ", description='" + description +
	              ", date=" +date +  '}';
	 }
	

}
