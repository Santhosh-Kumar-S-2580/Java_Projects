public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		a
		bb
		ccc
		dddd*/
		 
	  /*  for(int i=1;i<5;i++)
        {
        	for(int j=1;j<=i;j++)
        	{
        		 
        		System.out.printf("%c",96+i);
                          System.out.printf(" ");

        		
        	}
        	System.out.println(" ");
        	
        	}*/
		/*
		 a
		 ab
		 abc
		 abcd
		 abcde
	
		 */
		for(String i='a';i<'e';i++)
		   {
		                            //ASCII value of A
		   for(String j='a';j<=i;j++)
		   { 
		   System.out.print(i);
                   System.out.print("/t");
		 
		   }
		   System.out.println();
		   }
		/*
		 a
		 bc
		 def
		 ghij
		 */
		/*int alp=97;
		for(int i=1;i<5;i++)
		   {
		                             //ASCII value of A
		   for(int j=1;j<=i;j++)
		   {
		   System.out.print((char)alp);
		   alp++;
		   }
		   System.out.println();
		   }*/
	}

}
