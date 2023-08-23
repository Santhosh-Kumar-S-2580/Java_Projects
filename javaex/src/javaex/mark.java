package javaex;

import java.util.Scanner;

public class mark {

	public static String clgName="GCES";
	String Name;
	String Dept;
	int rollNo;
	int []marks;
	int Total;
	int percentage;
	String Result;
	

	public  mark(String Name,int rollNo,String Dept,int [] marks) {
		this.Name=Name;
		this.Dept=Dept;
		this.rollNo=rollNo;
		this.marks=marks;
			
	}
	public  mark(int rollNo,int Total,int percentage) {	
		this.rollNo=rollNo;
		this.Total=Total;
		this.percentage=percentage;
	    
			
	}
	
	public void display() {
		System.out.println("DISPLAY METHOD CALL FROM STUDENT CLASS");
		System.out.println("STUDENT DETAILS");
		System.out.println("------------------------------");
		System.out.println("RollNo : "+ rollNo +  " \nName :" + Name + "\nDepartment " + Dept +" \nCollegeName :" +clgName);
		System.out.println("------------------------------");
	}
	
		
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 int size = sc.nextInt();
			mark Stu[]=new mark[size];
		     mark Stud[]=new mark[size];
		System.out.println("Enter the No.of students Details to be Stored :");     
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
	    	 Stu[i]=new mark(name,roll,Dep,ma);
	    	 //Stu[i].calculateTotalAndPercentage();
	    	 //Stu[i].showResult();
	     }	 //Stu[i].display();
	    	 for(int i1=0;i1<Stu.length;i1++) {
		    	 int total=Stu[i1].marks[0]+Stu[i1].marks[1]+Stu[i1].marks[2]+Stu[i1].marks[3]+Stu[i1].marks[4];
		    	 int p=((total*100)/500);
		    
		    	 Stud[i1]=new mark(Stu[i1].rollNo,total,p);  
		    	 
		     }
	    	 System.out.println("\n*******************************************************************************************************************************************************************************************************");
	       	 System.out.print("\n\t\tROLLNO\t\t\tNAME\t\t\tSTANDARD\t\tTAMIL\t\tENGLISH\t\tMATHS\t\tSCIENCE\t\tSOCIAL SCIENCE\t\tTOTAL\t\tPERCENTAGE\t\t");
	       	 System.out.println("\n********************************************************************************************************************************************************************************************************");
	    	     for(int i1=0;i1<Stu.length;i1++) {
	    	    	
	    	    	 System.out.print("\n\t\t"+Stu[i1].rollNo+"\t\t"+Stu[i1].Name+"\t\t"+Stu[i1].Dept+"\t\t"+Stu[i1].marks[0]+"\t\t"+Stu[i1].marks[1]+"\t\t"+Stu[i1].marks[2]+"\t\t"+Stu[i1].marks[3]+"\t\t"+Stu[i1].marks[4]+"\t\t"+Stud[i1].Total+"\t\t"+Stud[i1].percentage+"\t\t");
	    				/*
	    				 * System.out.println(Stu[i].Name); System.out.println(Stu[i].rollNo);
	    				 * System.out.println(Stu[i].Dept); System.out.println(Stu[i].marks);
	    				 * System.out.println(Stu[i].marks[0]); System.out.println(Stu[i].marks[1]);
	    				 * System.out.println(Stu[i].marks[2]); System.out.println(Stud[i].rollNo);
	    				 * System.out.println(Stud[i].Total);
	    				 */
	    	    	 
	    	     }
	    		
		
	    	 
		
		
	     }} 
	    
	   
	     
	

