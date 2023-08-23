package javaex;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashsetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs=new HashSet<Integer>();
		/*
		 * hs.add(1); hs.add(2); hs.add(3); hs.add(4); hs.add(5);
		 */
		System.out.println("Enter the No.of elements to be add :");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		for(int i=0;i<size;i++) {
			System.out.println("Enter the Element "+i);
			int a=sc.nextInt();
			hs.add(a);
		}
		System.out.println(hs);
		Iterator <Integer> it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
