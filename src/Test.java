//My Details
//ID:17473436
//Name:Ross Creaven
import java.io.RandomAccessFile;
import java.util.Scanner;
public class Test {
	
	static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args){
		//Part 1
		System.out.println("Part 1:Transaction Array");
		//Create the array and add the transactions
		Transaction[] Transaction_Array=new Transaction[3];
		Transaction_Array[0] = new Transaction("16/08/2019","Open Account",100);
		Transaction_Array[1] = new Transaction("22/08/2019","Withdraw",50);
		Transaction_Array[2] = new Transaction("23/09/2019","Deposit",100);
		
		//Save the array
		Data_in_out.Save(Transaction_Array,"transaction.bin");
		//Load it and loop through it printing
		Transaction[] Transaction_Array_Loaded=new Transaction[3];
		Transaction_Array_Loaded=(Transaction[]) Data_in_out.Load("transaction.bin");
		for(Transaction i:Transaction_Array_Loaded) {
			System.out.println(i);
			
		}
		
		//Part 2
		System.out.println("");
		System.out.println("Part 2:Bank Account");
		//Create the account and do the transactions
		BankAccount ac = new BankAccount("Jenny, Lee",150,"16/08/2019");
		ac.withdraw("22/08/2019", 200);
		ac.deposit("23/08/2019", 100);
		ac.withdraw("01/09/2019", 50);
		//Saves the file
		Data_in_out.Save(ac,"accountdetails.bin");
		//Loads it and toStrings the account and gets the list of transactions
		BankAccount ac_loaded = (BankAccount) Data_in_out.Load("accountdetails.bin");
		System.out.println(ac_loaded);
		ac_loaded.getTransactionDetail();
		
		//Part 3
		System.out.println("");
		System.out.println("Part 3:Random Access File");
		//Trys to create the randomaccessfile
		try {
			//Creats the object and prints it out
			RandomAccessFile rf= new RandomAccessFile("Overdraft.txt","rw");
			System.out.println(rf.readLine());
			//Takes input in through the console
			String input = sc.nextLine();
			//goes to the end of the file and leaves a space and appends the string
			rf.seek(rf.length()+1);
			rf.writeBytes(input);
			//goes to the start and prints it out and closes the file
			rf.seek(0);
			System.out.println(rf.readLine()); 
			rf.close();
		}
		catch(Exception e){
			//catch for failing to create the file
			System.out.println("Random Access file failed");
			e.printStackTrace();}


		
		

	}

}
