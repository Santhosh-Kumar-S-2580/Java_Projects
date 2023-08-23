package javaex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionEX {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		  
		        FileWriter fwrite = new FileWriter("C:\\Users\\santhosh.kumar\\Documents\\javaex.txt");  
		        // writing the content into the FileOperationExample.txt file  
		        fwrite.write("A named location used to store related information is referred to as a File.");   
		   
		        // Closing the stream  
		        fwrite.close();   
		        System.out.println("Content is successfully wrote to the file.");  
		        FileInputStream fis =new FileInputStream("C:\\Users\\santhosh.kumar\\Documents\\javaex.txt");
	}

}
