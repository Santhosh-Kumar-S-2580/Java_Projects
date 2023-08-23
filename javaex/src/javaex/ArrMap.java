package javaex;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ArrMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {2,9,5,6,12,14,96,78};
		HashMap<Integer,Integer> HM=new HashMap<Integer,Integer>();
		//loop
		System.out.println("Using Loop");
		for(int i=1;i<a.length;i=i+2) {
			System.out.println(a[i]);
			HM.put(i, a[i]);		
		}
		System.out.println(HM);

		System.out.println("Using HashMap");
		 for(Entry<Integer, Integer> em:HM.entrySet()) {
			 System.out.println(em.getValue());
		 }
		 for(Map.Entry e:HM.entrySet()) {
			 System.out.println(e.getValue());
		 }
	}

}





























//Map loop
// for(int i=1;i<=8;i=i+2) {
//	System.out.println(HM.get(i));
// }