import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n=153;
		int temp,sum=0,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER :");
		String number=sc.next();
		int Size=number.length();
		System.out.println("Size Of the given Number "+ Size);
		int n=Integer.parseInt(number);
		temp=n;
		while(temp!=0) {
			rem=temp%10;
			sum=(int) (sum+Math.pow(rem, Size));
			temp=temp/10;
		}
		System.out.println("sum = "+sum);
		if(n==sum) {
			System.out.println("THE GIVEN NUMBER  "+ n +" IS AN ARMSTRONG NUMBER");
		}
		else {
			System.out.println("THE GIVEN NUMBER   "+ n +" IS NOT AN ARMSTRONG NUMBER");
		}
		

	}

}
