import java.util.Scanner;

public class ThreadRunnableEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable fr1=new First1();
		Runnable fr2=new Second2();
		Thread f1=new Thread(fr1);
		Thread f2=new Thread(fr2);
		f2.start();
		f1.start();


	}

}
class First1 implements Runnable{
	@Override
	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println("First Thread started running..");
		System.out.println("Enter any number for Thread 1 ");
		int n=sc.nextInt();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int c=0;
		while(n>0) {

			if(c==10) {
				break;
			}
			else {
				System.out.println("The Values is Increase by "+n);
				c++;
			}
			n++;
		}


	}
}
class Second2 implements Runnable{
	@Override
	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Second Thread started running..");
		System.out.println("Enter any number Thread 2 ");
		int s=sc.nextInt();
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int c1=0;
		while(0<=s) {

			if(c1==10) {

				break;
			}
			else {
				System.out.println("The Values is Decrease by "+s);
				c1++;
			}
			s--;
		}



	}

}