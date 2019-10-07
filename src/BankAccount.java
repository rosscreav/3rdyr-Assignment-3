//My Details
//ID:17473436
//Name:Ross Creaven
import java.io.Serializable;
public class BankAccount implements Serializable{
	
	//Variables
	private String name;
	private double balance;
	private int account_num;
	//Transient so its non-serializable
	private transient double overdraft;
	//Array for any number of transactions
	private Transaction[] transactions=new Transaction[1000];
	//Counts the number of transactions
	private int transaction_count=1;
	//Num the account nums count from
	private static int numofaccounts=1000;
	
	
	//Constructor
	public BankAccount(String name_con,double balance_con,String date) {
		name=name_con;
		balance=balance_con;
		account_num=numofaccounts+1;
		transactions[0]=new Transaction(date,"Open Account:",balance);
	}
	
	//Deposit method just adds to balance and creates the tranasction
	public void deposit(String date,double amount) {
		balance=balance+amount;
		transactions[transaction_count]=new Transaction(date,"Deposit:",amount);
		transaction_count=transaction_count+1;
		
	}
	
	//Deposit method just takes away from the balance and creates the tranasction
	public void withdraw(String date,double amount) {
		//Checks to see if the funds are there
		if(amount>balance) {
			System.out.println("Insufficient Funds");
		}
		//If they are executes normally
		else {
			balance=balance-amount;
			transactions[transaction_count]=new Transaction(date,"Withdraw:",amount);
			transaction_count=transaction_count+1;
		}
		
	}
	
	//Prints out the list of transactions stops when it hits null
	public void getTransactionDetail() {
		for(Transaction i:transactions) {
			if(i != null) {
				System.out.println(i);
			}
			else break;	
		}
		
	}
	
	//To string for the account
	public String toString() {
		return "Account Number:"+account_num+"  Name:"+name+"  Balance:"+balance;
		
	}

}
