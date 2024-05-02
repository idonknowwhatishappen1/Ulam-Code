package bookpublication;

import java.io.*;

public class WriteToFile {
    public static void main(String[] args) {
        Display[] array = new Display[3];
        array[0] = new Publication("IELTS", "English", 19.99);
        array[1] = new Book("Harry Potter", "English", 69.99, "J. K. Rowling", "6655577774");
        array[2] = new Car("Conan", 619, 3000);

       FileOutputStream filestream;
	try {
		filestream = new FileOutputStream(new File("C:\\Users\\Admin\\Documents\\Distributed System\\whooo\\him.txt"));
		ObjectOutputStream outputStream = new ObjectOutputStream(filestream);
    	
		for (  int i = 0; i< array.length; i++) {  
    		outputStream.writeObject((Display)array[i]); 
    		} 
		outputStream.close();
		
        System.out.println("Objects written to file successfully");

	}
    	catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
        
         catch (IOException e) {
            System.err.println(e.toString());
        }
    }
}
