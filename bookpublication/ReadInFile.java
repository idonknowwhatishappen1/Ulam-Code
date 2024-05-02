package bookpublication;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import java.io.IOException;

public class ReadInFile {
    public static void main(String[] args){
		FileInputStream filestream;

			try {
				filestream = new FileInputStream(new File("C:\\Users\\Admin\\Documents\\Distributed System\\whooo\\him.txt"));
				ObjectInputStream is;
			
					is = new ObjectInputStream(filestream);
					  ArrayList<Display> arr = new ArrayList<Display>(); 					   
			            for(int i = 0; i<3; i++) {  
			            	 Display o;
							
								o = (Display)is.readObject();

				            	arr.add(o);
				            }
			            for(int i=0; i< arr.size(); i++) {
			            	arr.get(i).display();   
			            	
			            	}
			            } catch (ClassNotFoundException e) {
								e.printStackTrace();
							

			} catch (IOException e) {
					e.printStackTrace();				


			}
			  
	          
		
    }
}

