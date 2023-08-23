package javaex;

import java.util.Scanner;


public class enumEx {
 Day day;

 // Constructor
 public enumEx(Day day) { 
	 this.day = day; 
	 }

 // Prints a line about Day using switch
 public void dayIsLike()
 {
     switch (day) {
     case MONDAY:
         System.out.println("Mondays are bad.");
         break;
     case FRIDAY:
         System.out.println("Fridays are better.");
         break;
     case SATURDAY:
     case SUNDAY:
         System.out.println("Weekends are best.");
         break;
     default:
         System.out.println("Midweek days are so-so.");
         break;
     }
 }

 // Driver method
 public static void main(String[] args)
 {
	 Scanner sc=new Scanner(System.in);
	 
	 System.out.println(" Days of the WEEK ");
     for (Day s : Day.values()) { 
	 System.out.println(s.ordinal()+" "+s);  
	 }
	 System.out.println("Enter the DAY : ");
     String str = sc.next();
     enumEx t1 = new enumEx(Day.valueOf(str.toUpperCase()));
     System.out.println("MESSAGE FOR THE DAY : ");
     t1.dayIsLike();
     System.out.println("The Index Position of the DAY WHICH YOU ENTERED : " + Day.valueOf(str.toUpperCase()).ordinal());
      
 }  
 }
