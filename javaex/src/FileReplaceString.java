import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReplaceString {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Instantiating the File class
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Source File Name : ");
		String s=scan.nextLine();
		File file = new File(s);
		FileInputStream inputStream = new FileInputStream(file);
		Scanner sc = new Scanner(inputStream);
	      StringBuffer buffer = new StringBuffer();
	      while (sc.hasNextLine()) {
	         buffer.append(sc.nextLine()+System.lineSeparator());
	      }
	      String fileContents = buffer.toString();
	      System.out.println("Contents of the file: "+fileContents);
	      sc.close();
			
			  System.out.println("Enter the old Line you want to change : ");
			  String oldLine = scan.nextLine();
			  System.out.println("Enter the New Line you want to change : "); String
			  newLine = scan.nextLine(); 
			  fileContents = fileContents.replaceAll(oldLine, newLine);
			  FileWriter writer = new FileWriter(s);
			  System.out.println("");
			  System.out.println("new data: "+fileContents); 
			  writer.append(fileContents);
			  writer.flush();
			 
	   }
	
	}


