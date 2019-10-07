//My Details
//ID:17473436
//Name:Ross Creaven
import java.io.*;
//A class to handle the input and output streams
//Adapted from assignment 3 last year
public class Data_in_out {

	   //Save class 
	   public static void Save( Object object,String directory) {
		   //Attempts to save an object to a file
		   try {
		         FileOutputStream fileOut =new FileOutputStream(directory);
		         ObjectOutputStream out = new ObjectOutputStream(fileOut);
		         out.writeObject(object);
		         out.close();
		         fileOut.close();
		         System.out.printf("Save succesful  \n");
		      } catch (IOException i) {
		    	 //Catches the IO errors
		         i.printStackTrace();
		      }
	   }
	   
	   public static Object Load(String directory) {
		 //Attempts to load an object to a file
		   try {
		         FileInputStream fileIn = new FileInputStream(directory);
		         ObjectInputStream in = new ObjectInputStream(fileIn);
		         Object loaded_data = (Object) in.readObject();
		         in.close();
		         fileIn.close();
		         System.out.printf("Load succesful\n");
		         return loaded_data;
		      } catch (IOException i) {
		    	//Catches the IO errors
		         i.printStackTrace();
		      } catch (ClassNotFoundException c) {
		    	 //Catch for not finding the file
		         System.out.println("File not found");
		         c.printStackTrace();
		      }
		   		//if it errors returns null
		   		return null;
		
	   }
}