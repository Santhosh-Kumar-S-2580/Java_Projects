import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class dupilcateHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER NO.OF NAMES YOU WANT :");
		int size=sc.nextInt();
	    String [] arr = new String[size];
	    System.out.println(arr.length);
	    
	    for(int i=0;i<size;i++) {
	    	System.out.println("----------------------------------");
			System.out.println("ENTER THE NAME : "+(i+1));
			String nb=sc.next();
	    	arr[i]=nb;
	    }
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element
        
   HashMap<String, Integer> map = new HashMap<>();
		
		for (String element : arr) 
			
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
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
        System.out.println(entrySet);
        for (Entry<String, Integer> entry : entrySet) 
        {               
            if(entry.getValue() > 1)
            {
                System.out.println("Duplicate Element : "+entry.getKey()+" - found "+entry.getValue()+" times.");
            }
        }
	}

}
