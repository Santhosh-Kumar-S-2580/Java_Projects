package javaex;

import java.util.Map;
import java.util.TreeMap;

class TreeMapEX{  
	 public static void main(String args[]){  
	   TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(100,"Amit");    
	      map.put(102,"Ravi");    
	      map.put(101,"Vijay");    
	      map.put(103,"Rahul");    
	        
	      for(Map.Entry m:map.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }    
	 }  
	}  
////Returns a Set view of the mappings contained in this map        
//	      map.entrySet()  
//	      //Returns a sequential Stream with this collection as its source  
//	      .stream()  
//	      //Sorted according to the provided Comparator  
//	      .sorted(Map.Entry.comparingByKey())  
//	      //Performs an action for each element of this stream  
//	      .forEach(System.out::println); 
/*
  
 *Java TreeMap class is a red-black tree based implementation. It provides an efficient means of storing key-value pairs in sorted order.

The important points about Java TreeMap class are:

Java TreeMap contains values based on the key. 
It implements the NavigableMap interface and extends AbstractMap class.
Java TreeMap contains only unique elements.
Java TreeMap cannot have a null key but can have multiple null values.
Java TreeMap is non synchronized.
Java TreeMap maintains ascending order.*/
 