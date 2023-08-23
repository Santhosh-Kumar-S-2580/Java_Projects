package javaex;

import java.util.Scanner;

public class Lateral extends Student {
	String StudentType;
	String Doj;
	public Lateral(String Name,int rollNo,String Dept,String StudentType,String Doj) {
		// TODO Auto-generated constructor stub
		super(Name, rollNo,Dept);
		this.StudentType=StudentType;
		this.Doj=Doj;
	}
	public void display() {
		System.out.println("DISPLAY METHOD CALL FROM LATERAL CLASS");
		System.out.println("LATERAL ENTRY STUDENT DETAILS");
		System.out.println("------------------------------");
		System.out.println("RollNo : "+ rollNo +  "\nName :" + Name +  
				"\nDepartment " + Dept + "\nCollegeName :" + clgName + "\nStudent Type :"+StudentType+ "\nDate of Joining :" + Doj);
		System.out.println("------------------------------");
	}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner sc=new Scanner(System.in);
	
	     System.out.println("Enter the No.of students Details to be Stored :");
	     int size = sc.nextInt();
	     Student Stu[]=new Student[size];
	     
	     for(int i=0;i<Stu.length;i++) {
	    	 System.out.println("Enter Details of  STUDENT :"+(i+1));
	    	 System.out.println("Enter the Student Name :");
	    	 String name=sc.next();
	    	 System.out.println("Enter the Student Department :");
	    	 String Dep=sc.next();
	    	 System.out.println("Enter the Student Rollno :");
	    	 int roll=sc.nextInt();
	    	 Stu[i]=new Student(name,roll,Dep);
	    	 
	    	 Stu[i].display();
	    	 
	     }
	     for(int i=0;i<Stu.length;i++) {
	    	 System.out.println(Stu[i].Dept);
	    	 
	     }
	     	     
	     System.out.println("Enter the No.of LateralEntry students Details to be Stored :");
	     int size1 = sc.nextInt();
	     Lateral late[]=new Lateral[size1];
	     
	     for(int i=0;i<late.length;i++) {
	    	 System.out.println("Enter Details of LateralEntry STUDENT "+(i+1));
	    	 System.out.println("Enter the Student Name :");
	    	 String name=sc.next();
	    	 System.out.println("Enter the Student Department :");
	    	 String Dep=sc.next();
	    	 System.out.println("Enter the Student Rollno :");
	    	 int roll=sc.nextInt();
	    	 System.out.println("Enter the Student Type :");
	    	 String Stutype=sc.next();
	    	 System.out.println("Enter the Student Date of Joining (DD-MM-YYYY):");
	    	 String doj=sc.next();
	    	 late[i]=new Lateral(name,roll,Dep,Stutype,doj);
	    	 late[i].display();
	    	 
	     }
		/*
		 * Student s1=new Student("Raju",101,"CSE"); Student s2=new
		 * Student("Raja",102,"EEE"); Student s3=new
		 * Lateral("Kumar",103,"ECE","LateralEntry","16-06-2018"); Student s4=new
		 * Lateral("Ram",104,"MECH","LateralEntry","18-06-2019"); Student s5=new
		 * Lateral("Ashok",105,"CIVIL","LateralEntry","30-06-2020"); s1.display();
		 * s2.display(); s3.display(); s4.display(); s5.display();
		 */
        
	}

}
