package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Source File Name : ");
		String s=scan.nextLine();
		File file = new File(s);
		FileInputStream inputStream = new FileInputStream(file);
		Scanner sc = new Scanner(inputStream);
		StringBuffer buffer = new StringBuffer();
		while(sc.hasNext()) {
			buffer.append("\n "+sc.nextLine());
		}
		System.out.println("Contents of the Source file: \n"+buffer);
		System.out.println("Enter the Destination File Name : ");
		String d=scan.nextLine();
		File dest = new File(d);
		FileWriter writer = new FileWriter(dest);
		writer.write(buffer.toString());
		writer.flush();
		System.out.println("The Contents Are Read From the Source File & Write To the Destination file successfully.......");
	}

}
