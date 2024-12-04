package com.avi1;
import java.util.*;

public class Array {

	public static void main(String[] args) {
               Scanner sc=new Scanner(System.in);
               int  size=sc.nextInt();
               int no[]=new int[size];
               
               for(int i=0;i<size;i++) {
            	   no[i]=sc.nextInt();
               }
               for(int i=0;i<size;i++) {
            	   System.out.println(no[i]);
               }
	}

}
