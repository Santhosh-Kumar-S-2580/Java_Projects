package javaex;

public class Student {
	
	public static String clgName="GCES";
	String Name;
	String Dept;
	int rollNo;

	public Student(String Name,int rollNo,String Dept) {
		this.Name=Name;
		this.Dept=Dept;
		this.rollNo=rollNo;
			
	}
	
	public void display() {
		System.out.println("DISPLAY METHOD CALL FROM STUDENT CLASS");
		System.out.println("STUDENT DETAILS");
		System.out.println("------------------------------");
		System.out.println("RollNo : "+ rollNo +  " \nName :" + Name + "\nDepartment " + Dept +" \nCollegeName :" +clgName);
		System.out.println("------------------------------");
	}
	
	
	

}
