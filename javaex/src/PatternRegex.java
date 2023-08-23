import java.util.Scanner;

public class PatternRegex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("USERNAME REQUIREMENTS : ");
		System.out.println("1)a digit must occur at least once\r\n"
				+ "		 2)a lower case letter must occur at least once\r\n"
				+ "		 3)an upper case letter must occur at least once\r\n"
				+ "		 4)a special character . and @ only accepted\r\n"
				+ "		 5)no whitespace allowed in the entire string\r\n"
				+ "		 6)at least eight Charcters\r\n"
				+ "		   EXAMPLE USERNAME : Ss9@gmail.com");
		System.out.println("");
		System.out.println("PASSWORD REQUIREMENTS : ");
		System.out.println("1)a digit must occur at least once\r\n"
				+ "		 2)a lower case letter must occur at least once\r\n"
				+ "		 3)an upper case letter must occur at least once\r\n"
				+ "		 4)a special character must occur at least once\r\n"
				+ "		 5)no whitespace allowed in the entire string\r\n"
				+ "		 6)at least eight Charcters\r\n"
				+ "		 EXAMPLE PASSWORD : aaZZa44@");
		System.out.println("");
		String UsernamePattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@.])(?=\\S+$).{8,}";
		String PWDPattern ="(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
		System.out.println("Welcome TO REGISTRATION PAGE ");
		  System.out.println("ENTER THE USERNAME : ");
		  System.out.println("ENTER THE PASSWORD : ");
		  String usr=sc.nextLine();
		  String pwd=sc.nextLine();
		  boolean us=usr.matches(UsernamePattern);
		  boolean pd=pwd.matches(PWDPattern);
		  if(us==true && pd==true) {
			  System.out.println("REGISTRATION DONE SUCCESSFULLY ......");
		  }
		  else if(us==false && pd==false) {
			  System.out.println("REGISTRATION FALIED ......\nPlease Enter the USERNAME & PASSWORD AS PER THE GIVEN REQUIREMENT ABOVE ... ");
		  }
		  else if(us==true && pd==false) {
			  System.out.println("REGISTRATION FALIED ......\nPlease Enter the PASSWORD AS PER THE GIVEN REQUIREMENT ABOVE ... ");
		  }
		  else if(us==false && pd==true) {
			  System.out.println("REGISTRATION FALIED ......\nPlease Enter the USERNAME AS PER THE GIVEN REQUIREMENT ABOVE ... ");
		  }
	      }
	}









































//^                 # start-of-string
//(?=.*[0-9])       # a digit must occur at least once
//(?=.*[a-z])       # a lower case letter must occur at least once
//(?=.*[A-Z])       # an upper case letter must occur at least once
//(?=.*[@#$%^&+=])  # a special character must occur at least once
//(?=\S+$)          # no whitespace allowed in the entire string
//.{8,}             # anything, at least eight places though
//$                 # end-of-string







//
//(?=.*[0-9]) a digit must occur at least once
//(?=.*[a-z]) a lower case letter must occur at least once
//(?=.*[A-Z]) an upper case letter must occur at least once
//(?=.*[@#$%^&+=]) a special character must occur at least once
//(?=\\S+$) no whitespace allowed in the entire string
//.{8,} at least 8 characters