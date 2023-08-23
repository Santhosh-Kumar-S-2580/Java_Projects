import java.util.Scanner;
class First extends Thread{
	public void run(){
		Scanner sc=new Scanner(System.in);
		System.out.println("First Thread started running..");
		System.out.println("Enter the Two Numbers to ADD");
		try {
			System.out.println("ENTER A value for addition");
			int a= sc.nextInt();
			Thread.sleep(500);
			System.out.println("ENTER B value for addition");
			int b=sc.nextInt();
			Thread.sleep(1000);
			int result = a+b;
			System.out.println("Sum of two numbers is: "+ result);
			System.out.println("First Thread Executed successfully ");
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
class Second extends Thread{
	public void run(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Second Thread started running..");
		System.out.println("Enter the Two Numbers to SUBTRACT");
		try {
			System.out.println("ENTER A value for subtraction");
			int a= sc.nextInt();
			Thread.sleep(500);
			System.out.println("ENTER B value for subtraction");
			int b=sc.nextInt();
			int result = a-b;
			Thread.sleep(1000);
			System.out.println("Subtraction of two numbers is: "+ result);
			System.out.	println("Second Thread Executed successfully ");
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class ThreadEx {
	public static void main(String[] args)  {
		First f1 = new First();
		Second f2=new Second();
		f1.start();
		
		f2.start();
	}
}
