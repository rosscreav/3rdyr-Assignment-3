//My Details
//ID:17473436
//Name:Ross Creaven
import java.io.Serializable;
public class Transaction implements Serializable{
	
	//Variables
	private String date;
	private String type;
	private double amount;
	private static int numoftansactions=0;
	private int transaction_num=numoftansactions+1;
	

	//Constructor
	public Transaction(String con_date, String con_type, double con_amount) {
		date=con_date;
		type=con_type;
		amount=con_amount;
		numoftansactions++;
	}
	
	//Getters and setters
	public String getDate() {
		return date;
	}
	public void setDate(String input) {
		date=input;
	}
	public String getType(){
		return type;
	}
	public void setType(String input) {
		type=input;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double input) {
		amount=input;
	}
	public int getTransaction_num() {
		return transaction_num;
	}
	
	//toString
	public String toString() {
		return transaction_num + "." +date+' '+type+' '+amount;
	}

}
