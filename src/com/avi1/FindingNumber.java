package com.avi1;
import java.util.*;

public class FindingNumber {

	public static void main(String[] args) {
               Scanner sc=new Scanner(System.in);
               int  size=sc.nextInt();
               int no[]=new int[size];
               
               for(int i=0;i<size;i++) {
            	   no[i]=sc.nextInt();
               }
               int x=sc.nextInt();
               for(int i=0;i<no.length;i++) {
            	   if(no[i]==x) {
            		   System.out.println("x found at index :"+i);
            	   }
               }
	}

}