package javaex;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


class MyOwnException extends Exception {
	public MyOwnException(String message) {
		super(message);
	}
}

class ExceptionThrow {

	ArrayList<String> Speakinglanguages = new ArrayList<>(Arrays.asList("Tamil", "English", "English"));
	public void checkLanguage(String lang) throws MyOwnException  {
		if(Speakinglanguages.contains(lang)) {
			throw new MyOwnException(lang + " already exists");
		}
		else {
			Speakinglanguages.add(lang);
			System.out.println(lang + " is added to the ArrayList");
		}
	}

	public static void main(String[] args) {
		ExceptionThrow obj = new ExceptionThrow();
		Scanner sc=new Scanner(System.in);    

		try {
			System.out.println("Enter the No.of.Language You want to ADD : ");
			int l=sc.nextInt();
			for(int i=0;i<l;i++) {
				System.out.println("Enter the Language");
				String lang=sc.next();
				obj.checkLanguage(lang);
			}

		}

		catch(MyOwnException e) {
			System.out.println("[" + e + "] Exception Occured");
		}
		finally {
			sc.close();
			System.out.println("Program Ends Successfully");
		}
	}
}