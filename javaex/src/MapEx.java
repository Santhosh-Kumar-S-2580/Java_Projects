import java.util.*; 
public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<Integer,String>();  
		map.put(109,"java");  
		map.put(103,"python");  
		map.put(101,"sql");  
		map.put(139,"c");   
		map.put(null,null);
		System.out.println("---------------------HASHMAP------------------");
        System.out.println("HashMap Allow Null Key & Null Values \nHashMap maintains no order. ");
		System.out.println("HashMap Contains : "+ map);
		System.out.println("-----------------------------------------------");

		TreeMap<Integer,String> tmap=new TreeMap<Integer,String>();  
		tmap.put(109,"java");  
		tmap.put(103,"python");  
		tmap.put(101,"sql");  
		tmap.put(139,"c"); 

		System.out.println("---------------------TREEMAP------------------");
		System.out.println("TreeMap Maintains Ascending Order ");
		System.out.println("TreeMap cannot contain any null key ");
		System.out.println("TREEMap Contains : "+ tmap);
		System.out.println("Descending order of tree map : "+tmap.descendingMap());
		System.out.println("-----------------------------------------------");


		LinkedHashMap<Integer, String> lmap = new LinkedHashMap<Integer, String>();          
		lmap.put(109,"java");  
		lmap.put(103,"python");  
		lmap.put(101,"sql");  
		lmap.put(139,"c"); 
		lmap.put(null, null);
		System.out.println("---------------------LINKED HASHMAP------------------");

		System.out.println("HashMap Allow Null Key & Null Values \nHashMap maintains Insertion order. ");
		System.out.println("Linked HashMap Contains : "+ lmap);
		//Fetching key  
		System.out.println("Keys: "+lmap.keySet());  
		//Fetching value  
		System.out.println("Values: "+lmap.values());  
		//Fetching key-value pair  
		System.out.println("Key-Value pairs: "+lmap.entrySet()); 
		System.out.println("-----------------------------------------------");

		


	}

}

