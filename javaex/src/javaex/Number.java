package javaex;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=sc.nextInt();
		if(n>=1 && n<=10) {
			System.out.println(n+" is between 1 to 10");
		}
		else if(n>=11 && n<=20) {
			System.out.println(n+" is between 11 to 20");
		}
		else if(n>=21 && n<=30) {
			System.out.println(n+" is between 21 to 30");
		}
		else {
			System.out.println(n+" is Above 30");
		}

	}

	}


