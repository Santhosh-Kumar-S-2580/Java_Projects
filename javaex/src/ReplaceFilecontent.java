import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.Scanner;

public class ReplaceFilecontent {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter the Source File Name : ");
//		String s=scan.nextLine();
//		File file = new File(s);
//		FileInputStream inputStream = new FileInputStream(file);
//		Scanner sc = new Scanner(inputStream);
//	      StringBuffer buffer = new StringBuffer();
//	      while (sc.hasNextLine()) {
//	         buffer.append(sc.nextLine()+System.lineSeparator());
//	      }
//	      String fileContents = buffer.toString();
//	      System.out.println("Contents of the file: "+fileContents);
//	      sc.close();
//			
//			 // System.out.println("Enter the old Line you want to change : ");
//			//  String oldLine = scan.next();
//			  String oldLine="File_1.pdf= 037000 Dispute Form sample letter (1).pdf\n"
//			  		+ "File_2.pdf= 037000Dispute.pdf";
//			  System.out.println("Enter the New Line you want to change : "); String
//			 // newLine = scan.next(); 
//			  newLine="File_1.pdf= 037000 Dispute Form .pdf\n"
//			  		+ "File_2.pdf= 03500Dispute.pdf";
//			  fileContents = fileContents.replaceAll(oldLine, newLine);
//			  FileWriter writer = new FileWriter(s);
//			  System.out.println("");
//			  System.out.println("new data: "+fileContents); 
//			  writer.append(fileContents);
//			  writer.flush();
		//get properties
		// Creating properties files from Java program
        Properties properties = new Properties();
        
        // In the name of userCreated.properties, in the
        // current directory location, the file is created
//        FileOutputStream fileOutputStream
//            = new FileOutputStream(
//                "TestConfiguration.properties");
  
        // As an example, given steps how
        // to keep username and password
        properties.setProperty("username", "value1");
        properties.setProperty("password", "value2");
  
        // writing properties into properties file
        // from Java As we are writing text format,
        // store() method is used
//        properties.store(
//            fileOutputStream,
//            "Sample way of creating Properties file from Java program");
//  
//        fileOutputStream.close();
    }
}
