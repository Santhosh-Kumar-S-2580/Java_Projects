package javaex;

import java.util.Scanner;

public class five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=sc.nextInt();
		switch (n) {
		case 5: {
			System.out.println("5 is Present");
			break;
		}
		case 10: {
			System.out.println("10 is Present");
			break;
		}
		case 15: {
			System.out.println("15 is Present");
			break;
		}
		case 20: {
			System.out.println("20 is Present");
			break;
		}
		default:
			System.out.println("The ENTERED NUMBER IS NOT PRESENT");
		
	}
}}
