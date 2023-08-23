package javaex;

public  class Faculty {
	
	public static String clgName="GCES";
	String Name;
	String Dept;
	int rollNo;

	public Faculty(String Name,int rollNo,String Dept) {
		this.Name=Name;
		this.Dept=Dept;
		this.rollNo=rollNo;
			
	}
	public Faculty(String Name) {
		this.Name=Name;
			
	}
	
	public void display() {
		System.out.println("DISPLAY METHOD CALL FROM Faculty CLASS");
		System.out.println("Faculty staff Details");
		System.out.println("------------------------------");
		System.out.println("FacultyID : "+ rollNo +  " \nName :" + Name + "\nDepartment " + Dept +" \nCollegeName :" +clgName);
		System.out.println("------------------------------");
	}
	public void show() {
		System.out.println("Faculty Name:"+Name);
	}
	
}
	   
	   
	   
	

