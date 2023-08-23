package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		File f1 = new File("C:\\Users\\santhosh.kumar\\Documents\\javaex1.txt");    
        Scanner dataReader = new Scanner(f1);  
        while (dataReader.hasNextLine()) {  
            String fileData = dataReader.nextLine();  
            System.out.println(fileData);  
        }  
        dataReader.close();  
    } 
	catch (FileNotFoundException exception) {  
        System.out.println("Unexcpected error occurred!");  
         
    } 
	}} 


