package javaex;

public class TempFactuly extends Faculty {
	String FacultyType;
	String Doj;
	public TempFactuly(String Name,int rollNo,String Dept,String FacultyType,String Doj) {
		// TODO Auto-generated constructor stub
		super(Name, rollNo,Dept);
		this.FacultyType=FacultyType;
		this.Doj=Doj;
	}
	@Override
	public void display() {
		super.display();
		System.out.println("DISPLAY METHOD CALL FROM TemporaryFaculty CLASS");
		System.out.println("Temporary Staff DETAILS");
		System.out.println("------------------------------");
		System.out.println("TempFacultyID : "+ rollNo +  "\nName :" + Name +  
				"\nDepartment " + Dept + "\nCollegeName :" + clgName + "\nFacultyType :"+FacultyType+ "\nDate of Joining :" + Doj);
		System.out.println("------------------------------");
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Faculty s1=new Faculty("Raju",101,"CSE");
	//Faculty s2=new Faculty("Raja",102,"EEE");
	//Faculty s6=new Faculty("Raja");
	//Faculty s3=new TempFactuly("Kumar",103,"ECE","Temp","16-06-2018");
	//Faculty s4=new TempFactuly("Ram",104,"MECH","Temp","18-06-2019");
	Faculty s5=new TempFactuly("Ashok",105,"CIVIL","Temp","30-06-2020");
        s1.display();
       // s2.display();
       // s3.display();
		//s4.display();
		s5.display();
		//s6.show();
        
}}
