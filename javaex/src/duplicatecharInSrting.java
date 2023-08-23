import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class duplicatecharInSrting {
	public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("ENTER THE STRING");   
		String nb=sc.nextLine();
		char [] arr=nb.toCharArray();
   
    System.out.println("Duplicate elements in given array: ");  
    //Searches for duplicate element
    
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
	System.out.println(map);
	System.out.println(map.get('a'));
	
	
	Set<Entry<Character, Integer>> entrySet = map.entrySet();
    System.out.println(entrySet);
    System.out.println("Enter the Character: ");
    char c = sc.next().charAt(0);
    
   // System.out.println("Duplicate Element : "+entry.getKey()+" - found "+entry.getValue()+" times.");
    for (Entry<Character, Integer> entry : entrySet) 
    {               
        if(entry.getValue() > 1)
        {
            System.out.println("Duplicate Element : "+entry.getKey()+" - found "+entry.getValue()+" times.");
        }
    }
	}
}
