package javaex;

import java.util.Scanner;

public class StudentMark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("Enter the No.of students Details to be Stored :");  
		size = sc.nextInt();
		SchoolData2 Stu[]=new Student1[size];
		
	

		for(int i=0;i<Stu.length;i++) {
			System.out.println("Enter Details of  STUDENT :"+(i+1));
			System.out.println("Enter the Student Name :");
			String name=sc.next();
			System.out.println("Enter the Student Standard :");
			String Dep=sc.next();
			System.out.println("Enter the Student Rollno :");
			int roll=sc.nextInt();
			int s=5;
			int ma[]=new int[s];
			System.out.println("Enter the Tamil Mark :");
			ma[0]=sc.nextInt();
			System.out.println("Enter the English Mark :");
			ma[1]=sc.nextInt();
			System.out.println("Enter the Maths Mark :");
			ma[2]=sc.nextInt();
			System.out.println("Enter the Science Mark:");
			ma[3]=sc.nextInt();
			System.out.println("Enter the Social Science Mark:");
			ma[4]=sc.nextInt();
			int total=ma[0]+ma[1]+ma[2]+ma[3]+ma[4];
			int p=((total*100)/500);
			String res;
			if(p>=35) {
				res="PASS";
			}
			else {
				res="FAIL";
			}
			Stu[i]=new Student1(name,roll,Dep,ma,total,p,res); 

		}
		System.out.println("\n****************************************");
		System.out.print("\nROLLNO   NAME   STANDARD   SCHOOLNAME  ");
		System.out.println("\n****************************************");
		for(int i=0;i<Stu.length;i++) {

			Stu[i].showStudentDetails();

		}
		System.out.println("\n************************************************************************************************");
		System.out.println("ROLLNO NAME STANDARD TAMIL ENGLISH MATHS SCIENCE SOCIAL SCIENCE TOTAL PERCENTAGE RESULT ");
		System.out.println("\n*************************************************************************************************");
		for(int i=0;i<Stu.length;i++) {

			Stu[i].displayResult();

		}

	}
}
class Student1 implements SchoolData2{
	public static String sclName="GCES";
	String Name;
	String Dept;
	int rollNo;
	int []marks;
	int Total;
	int percentage;
	String Result;

	public  Student1(String Name,int rollNo,String Dept,int [] marks,int Total,int percentage,String Result) {
		this.Name=Name;
		this.Dept=Dept;
		this.rollNo=rollNo;
		this.marks=marks;
		this.Total=Total;
		this.percentage=percentage;
		this.Result=Result;

	}

	/*
	 * public StudentMark(int rollNo,) { this.rollNo=rollNo; this.Total=Total;
	 * this.percentage=percentage;
	 * 
	 * }
	 */
	@Override
	public void displayResult() {

		System.out.println(rollNo+"\t"+Name+"\t"+Dept+"\t"+marks[0]+"\t"+marks[1]+"\t"+marks[2]+"\t"+marks[3]+"\t"+marks[4]+"\t"+Total+"\t"+percentage+"\t"+Result+"\t");
	}
	@Override
	public void showStudentDetails() {
		//System.out.println("DISPLAY METHOD CALL FROM LATERAL CLASS");
		System.out.println(rollNo+"  \t"+Name+"\t  "+Dept+"\t  "+sclName+"\t");

	}


}





