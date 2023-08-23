import java.util.HashMap;
import java.util.Scanner;

public class dupHashString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc=new Scanner(System.in);
			System.out.println("ENTER THE STRING");   
				String nb=sc.nextLine();
				char [] arr=nb.toCharArray();
		   
		    
		    
		HashMap<Character, Integer> map = new HashMap<>();
			
			for (Character element : arr) 
				
			{	 //1, 2, 3, 4, 2, 7, 8, 8, 3
				//System.out.println(map.get(element));
				
				if(map.get(element) == null)
				{    
					//System.out.println(element +" 1");
					 map.put(element, 1);
					 
				}
				else
				{   
					//System.out.println(element+" "+(map.get(element)+1));
					map.put(element, map.get(element)+1);
					
					
					
				}
			}
			System.out.println("Enter the Character: ");
		    char c = sc.next().charAt(0);
			
			System.out.println("The character " + " ' "+ c + " ' " + "is  present "+  map.get(c)+ " times in the given string");
			System.out.println("Other Characters count");
			System.out.println(map);
	}

}
