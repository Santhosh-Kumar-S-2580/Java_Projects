package javaex;

import java.util.*;
public class ExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String s=sc.next();
		Integer a []=null;
		System.out.println("");
		System.out.println("");
		System.out.print("STRING POSITION : ");
		for(int i=0;i<s.length();i=i+1){
			System.out.print(i+"\t");
		}
		System.out.println("");
		System.out.print("CHARACTER       : ");
		for(int i=0;i<s.length();i=i+1){
			System.out.print(s.charAt(i)+"\t");
		}
		System.out.println("");
		System.out.println("");
		try {
			System.out.println("-------------STRING CHARACTERS AT MULTIPLES OF 4-----------------------");
			System.out.print("STRING POSITION : ");
			for(int i=0;i<=s.length();i=i+4){
				System.out.print(i+"\t");
			}
			System.out.println("");
			System.out.print("CHARACTER       : ");
			for(int i=0;i<=s.length();i=i+4){
				System.out.print(s.charAt(i)+"\t");
			}
			
		} 
		
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("");
			System.out.println("");
			System.out.println(e.getMessage());
			System.out.println("Please Enter the String Character contains ONLY odd number");
			
		}
		
		try {
			for(int i=0;i<a.length;i++) {
				System.out.println(i);
			}
			
		} 
		catch (NullPointerException e) {
			System.out.println("");
			System.out.println("");
			System.out.println(e.getMessage());
			System.out.println("Please assign the values to the array");
		}
		
		finally {
			
			System.out.println("Program ENDS Successfully");
		}
	}

}
