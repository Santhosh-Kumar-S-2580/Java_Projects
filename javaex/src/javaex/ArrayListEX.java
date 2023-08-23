package javaex;



import java.util.*; 
class emp{  
	  String name; 
	  int age; 
	  emp(String name,int age){ 
	   this.name=name; 
	   this.age=age; 
	  } 
	} 
class ArrayListEX{ 
	public static void main(String args[]){ 
		//Creating user-defined class objects 
		emp s1=new emp("Babu",20); 
		emp s2=new emp("Madhan",21); 
		emp s3=new emp("Paru",22); 
		emp s4=new emp("SS",22);
		emp s5=new emp("Arun",20); 
		emp s6=new emp("Raja",21); 
		
		//creating arraylist 
		ArrayList<emp> al=new ArrayList<emp>(); 
		ArrayList<emp> a2=new ArrayList<emp>();
		al.add(s1);//adding Student class object 
		al.add(s2); 
		al.add(s3); 
	System.out.println(" VAULES IN ARRAY LIST 1 :");
	   System.out.println("---------------------");
		System.out.println("NAME \tAGE");
		System.out.println("---------------------");
		//Getting Iterator 
		Iterator itr=al.iterator(); 
		//traversing elements of ArrayList object 
		while(itr.hasNext()){ 
			emp st=(emp)itr.next(); 
			System.out.println(st.name+"\t"+st.age); 
			
		} 
		System.out.println("___________________________________________________________________");
		a2.add(s4);
		a2.add(s5);
		a2.add(s6);
		System.out.println(" VAULES IN ARRAY LIST 2 :");
		System.out.println("---------------------");
		System.out.println("NAME \tAGE");
		System.out.println("---------------------");
		Iterator itr1=a2.iterator(); 
		//traversing elements of ArrayList object 
		while(itr1.hasNext()){ 
			emp st=(emp)itr1.next(); 
			System.out.println(st.name+" \t"+st.age); 
			
		} 
		System.out.println("___________________________________________________________________");
		al.addAll(a2);
		//Updating the ARRAYLIST 1
		
		System.out.println(" VAULES IN ARRAYLIST 1 AFTER UPDATING :");
		System.out.println("---------------------------------------");
		System.out.println("NAME \tAGE");
		System.out.println("---------------------");
		//Getting Iterator 
		Iterator<emp> itr3=al.iterator(); 
		//traversing elements of ArrayList object 
		while(itr3.hasNext()){ 
			emp st=(emp)itr3.next(); 
			System.out.println(st.name+"\t"+st.age); 
			
		} 
		System.out.println("___________________________________________________________________");
		//Delete the Values in the array
		System.out.println(" VAULES IN ARRAYLIST 1 AFTER DELETING :");
		System.out.println("---------------------------------------");
		al.remove(5);
		System.out.println("NAME \tAGE");
		System.out.println("---------------------");
		for(emp i:al) {
			System.out.println(i.name+"\t"+i.age);
		}
		ArrayList<String> a3=new ArrayList<>(); 
		for(emp i:al) {
			a3.add(i.name);
		}
		System.out.println("___________________________________________________________________");
		System.out.println("VAULES IN ARRAYLIST 3 contains only Name");
		System.out.println("-----------------------------------------");
		System.out.println("NAME");
		System.out.println("-----------");
		for(String i:a3) {
			System.out.println(i);
		}
		System.out.println("___________________________________________________________________");
		System.out.println("VAULES IN ARRAYLIST 3 AFter Sorting Name in Ascending Order");
		System.out.println("------------------------------------------------------------");
		System.out.println("NAME");
		System.out.println("---------------");
		Collections.sort(a3);
		for(String i:a3) {
			System.out.println(i.toString());
		}
		System.out.println("___________________________________________________________________");
		System.out.println("VAULES IN ARRAYLIST 3 AFter Sorting Name in Descending Order");
		System.out.println("-------------------------------------------------------------");
		System.out.println("NAME");
		System.out.println("---------------------");
		Collections.sort(a3,Collections.reverseOrder());
		for(int i=0;i<a3.size();i++) {
		
			System.out.println(a3.get(i));
		}
		System.out.println("___________________________________________________________________");
	} 
}