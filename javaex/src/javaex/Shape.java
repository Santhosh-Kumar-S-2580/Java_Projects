package javaex;

import java.util.Scanner;

public class Shape  {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch;		
		while(true) {
			System.out.println("WELCOME TO SHAPES AREA FINDER APPLICATION ");
			System.out.println("------------------------------------------");
			System.out.println("Please Select Your Choice to find the Area Shapes:\n1.Square \n2.Rectangle \n3.Circle \n4.Trianngle\n5.Exit from Application");
			System.out.println("--------------------------------------------");
			System.out.println("Please Enter Your Choice");
			ch=sc.nextInt();
		    switch (ch) {
			case 1: 
				System.out.println("Weclome To Square Area Finder ");
				System.out.println("------------------------------------------");
				System.out.println("Please Enter the Length of the Square Side :");
				int a=sc.nextInt();
				Area sq=new Square(a);
				sq.CalculateArea();
				System.out.println("------------------------------------------");
				System.out.println("Thanks For Using Square Area Finder !");
				System.out.println("------------------------------------------");
				break;
			case 2:
				System.out.println("Weclome To Rectangle Area Finder ");
				System.out.println("------------------------------------------");
				System.out.println("Please Enter the Length of the Rectangle :");
				int l=sc.nextInt();
				System.out.println("Please Enter the Breadth of the Rectangle :");
				int b=sc.nextInt();
				Area r=new Rectangle(l,b);
				r.CalculateArea();
				System.out.println("------------------------------------------");
				System.out.println("Thanks For Using Rectangle Area Finder !");
				System.out.println("------------------------------------------");
				break;
			case 3:
				System.out.println("Weclome To Circle Area Finder ");
				System.out.println("------------------------------------------");
				System.out.println("Please Enter the Radius of the Circle :");
				double rad=sc.nextInt();
				Area c =new Circle(rad);
				c.CalculateArea();
				System.out.println("------------------------------------------");
				System.out.println("Thanks For Using Circle Area Finder !");
				System.out.println("------------------------------------------");
				break;
			case 4:
				System.out.println("Weclome To Triangle Area Finder");
				System.out.println("------------------------------------------");
				System.out.println("Please Enter the Base of the Triangle :");
				int base=sc.nextInt();
				System.out.println("Please Enter the Height of the Triangle :");
				int heigh=sc.nextInt();
				Area t=new Triangle(base,heigh);
				t.CalculateArea();
				System.out.println("------------------------------------------");
				System.out.println("Thanks For Using Triangle Area Finder !");
				System.out.println("------------------------------------------");
				break;
			case 5:
				System.out.println("Thanks For Using SHAPES AREA FINDER APPLICATION !!!");
				System.exit(0);
				
				break;
				
			default:
				
				System.out.println("INVALID SELECTION !!!!\n Please Provide valid options from 1 to 5.");
			}
		}
		
		
		
	}

}
class Square extends Area{
	int a;

	public Square(int a) {
		this.a=a;
	}

	public void CalculateArea() {
		int area=a*a;
		System.out.println("Area of the Square : "+area);
	}
} 
class Rectangle extends Area {
	int l;
	int b;
	public Rectangle(int l,int b) {
		this.l=l;
		this.b=b;

	}
	public void CalculateArea() {
		int area=l*b;
		System.out.println("Area of the Rectangle :"+ area);
	}

}
class Circle extends Area{
	double r;
	public Circle(double r) {
		this.r=r;

	}
	public void CalculateArea()
	{
		double area= 3.14*r*r;
		System.out.println("Area of the Circle :"+ area);
	}
}

class Triangle extends Area {
	int b;
	int h;
	public Triangle(int b,int h) {
		this.b=b;
		this.h=h;
	}
	public void CalculateArea() {
		double area=0.5*b*h;
		System.out.println("Area of the Triangle :"+area);
	}
}

