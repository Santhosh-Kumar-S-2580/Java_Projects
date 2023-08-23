package javaex;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class HashTableEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Hashtable <String,Integer> book=new Hashtable<>();
		System.out.println("******************WELCOME TO BOOK SHOP**********************");
		System.out.println("----------------------------------------------");
		System.out.println("ENTER THE NO.OF BOOKS TO ADD :");
		int size=sc.nextInt();
		for(int i=0;i<size;i++) {
			System.out.println("----------------------------------");
			System.out.println("ENTER THE NAME OF THE BOOK "+(i+1));
			String nb=sc.next();
			System.out.println("ENTER THE PRICE OF THE BOOK"+(i+1));
			int  p=sc.nextInt();
			
			book.put(nb, p);
		}
		System.out.println("----------------------------------------");
		System.out.println("***********************");
		System.out.println("HashTable Contains : "+book);
		
		System.out.println("***********************");
		System.out.println(" BOOK'S PRICE LIST");
		System.out.println("***********************");
		Enumeration<String> k=book.keys();
		Enumeration<Integer> v=book.elements();
		System.out.println("BOOK NAME\tPRICE ");
		System.out.println("----------------------");
		while(k.hasMoreElements()) {
			System.out.println(k.nextElement()+"\t\t "+v.nextElement());
			System.out.println("----------------------");
		}
		
		System.out.println("----------------------------------------");
		
		
		
	}

}
