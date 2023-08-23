package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CREATE AN FILE
		
		  try {  
              // Creating an object of a file  
			  File f = new File("C:\\Users\\santhosh.kumar\\Documents\\javaex1.txt");
              if (f.createNewFile()) {  
                         System.out.println("File " + f.getName() + " is created successfully.");  
              } else {  
                         System.out.println("File is already exist in the directory.");  
              }  
            } catch (IOException exception) {  
                     System.out.println("An unexpected error is occurred.");  
                     
         }
		  //To GET file Info
		  File f = new File("C:\\Users\\santhosh.kumar\\Documents\\javaex1.txt");
		  if (f.exists()) {  
			  
	            // Getting file name  
	            System.out.println("The name of the file is: " + f.getName());  
	   
	            // Getting path of the file   
	            System.out.println("The absolute path of the file is: " + f.getAbsolutePath());     
	   
	            // Checking whether the file is writable or not  
	            System.out.println("Is file writeable?: " + f.canWrite());    
	   
	            // Checking whether the file is readable or not  
	            System.out.println("Is file readable " + f.canRead());    
	   
	            // Getting the length of the file in bytes  
	            System.out.println("The size of the file in bytes is: " + f.length());    
	        } else {  
	            System.out.println("The file does not exist.");  
	        }  
		  // Write to file
		  try {  
		        FileWriter fwrite = new FileWriter("C:\\Users\\santhosh.kumar\\Documents\\javaex1.txt");  
		        // writing the content into the FileOperationExample.txt file  
		        fwrite.write("A named location used to store related information is referred to as a File.");   
		         
		        // Closing the stream  
		        fwrite.close();   
		        System.out.println("Content is successfully wrote to the file.");  
		    } catch (IOException e) {  
		        System.out.println("Unexpected error occurred");  
		          
		        }  
		  //Read from the file
		  try {  
	            // Create f1 object of the file to read data  
	            File f1 = new File("C:\\Users\\santhosh.kumar\\Documents\\javaex1.txt");    
	            Scanner dataReader = new Scanner(f1);  
	            while (dataReader.hasNextLine()) {  
	                String fileData = dataReader.nextLine();  
	                System.out.println(fileData);  
	            }  
	            dataReader.close();  
	        } catch (FileNotFoundException exception) {  
	            System.out.println("Unexcpected error occurred!");  
	             
	        } 
		 // Delete the file
		  if (f.delete()) {   
		      System.out.println(f.getName()+ " file is deleted successfully.");  
		    } else {  
		      System.out.println("Unexpected error found in deletion of the file.");  
		    }   
	}

}
