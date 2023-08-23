package javaex;

import java.util.Scanner;

public class IFExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int age=15;
//		
//		if(age<=18) {
//			System.out.println("Eligibility to Vote");
//		}
//		else {
//			System.out.println("Not Eligible");
//		}
		
		String Student_status="Pass";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Percentage : ");
		int percentage=sc.nextInt();
	
		if(Student_status=="Pass") {
			System.out.println("Eligible to get rank");
			if(percentage<=100 && percentage >=90) {
				
				System.out.println("1st Rank");
			}
			else if(percentage<=50) {
				System.out.println("5th Rank");
			}
			
			
		}
		else {
			System.out.println("Not Eligible to get rank ");
		}
	}
	

}
