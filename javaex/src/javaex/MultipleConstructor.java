package javaex;

public class MultipleConstructor {
     
    	 String name="santhosh";
    	String role="Graduate Engineer";
    	  MultipleConstructor() {
    		 System.out.println(name);
    		 System.out.println(role);
    	 }
    	   MultipleConstructor(int a,int b) {
    		 System.out.println(a);
    		 System.out.println(b);
    		 System.out.println(a+b);
    	 }
   
	public static void main(String[] args) {
		new MultipleConstructor();
		new MultipleConstructor(5,6);
		

	}

}
