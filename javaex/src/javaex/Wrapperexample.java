package javaex;

public class Wrapperexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Wrapper Class : \n Wrapper Class provides way to use primitive datatype as objects & It can be used collections"); 
		
		int a=10;
		//AutoBoxing 
		System.out.println("AutoBoxing  : \n It refers to conversion of primitive value to objects"); 
		Integer i= a;
		System.out.println("\n  Autoboxing :" + i);

		
		Double d=2.0;
		//Unboxing
		System.out.println("UnBoxing  : \n conversion of object(Wrapper class) to primitive values"); 
		double d1=d;
		System.out.println("\n  Unboxing :" + d1);

	}

}
