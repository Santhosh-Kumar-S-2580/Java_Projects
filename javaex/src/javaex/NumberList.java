package javaex;

public class NumberList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int []n= {6,3,7,2,9,0};
      for(int i=0;i<n.length;i++) {
    	  if((n[i]%2)==0){
    		  continue;
    	  }
    	  else {
    		  System.out.println("The number is ODD "+n[i]);
    	  }
      }
	}

}
