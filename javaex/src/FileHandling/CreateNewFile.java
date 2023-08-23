package FileHandling;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class CreateNewFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today=new Date();
		
	 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file Name you want to create : ");
		String base=sc.nextLine();
		String ref=sc.nextLine();
		//String filePath1 = System.getProperty("user.dir") + "\\Extract_Images\\" + base + "_"+ ref + "_difference.html";
		String filePath1 = System.getProperty("user.dir") + "\\Extract_Images\\" +(new java.sql.Date(today.getTime()))+"_"+ base + "_"+ ref + "_difference.html";
		System.out.println(filePath1);
		File f = new File(filePath1);
		 try {  
             // Creating an object of a file  
			 
             if (f.createNewFile()) {  
                        System.out.println("File " + f.getName() + " is created successfully."); 
                        System.out.println(f.getPath());
             } else {  
                        System.out.println("File is already exist in the directory.");  
             }  
           } catch (IOException exception) {  
                    System.out.println("An unexpected error is occurred.");  
                    
	}
	
		    // Main driver method
		    
//		        // Custom input string
//		        String str = "geekss'\'for'\'geekss";
//		         System.out.println(str.replace("'\'", " "));
//		        String[] arrOfStr = str.split("['\']", 3);
//		  
//		        for (String a : arrOfStr)
//		            System.out.println(a);
		  
		

		 
		   
}}
