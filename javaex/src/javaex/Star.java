package javaex;



//Print the star in the single without using loop


import java.util.Scanner;

public class Star {
   static void p(int n) {
	    if(n>0) {
	    	System.out.print("*");
	    	
	    	p(n-1);
	    	
	    }
	    
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N value");
		int n=sc.nextInt();
        p(n);
	}

}
