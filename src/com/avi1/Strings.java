package com.avi1;

public class Strings {

	public static void main(String[] args) {
		System.out.println(" Stirng concatenation\n");
		String firstname="avi";
		String lastname="keche";
		String fullname=firstname+" "+lastname;
		System.out.println(fullname);
		
		for(int i=0;i<fullname.length();i++) {
		     System.out.println(fullname.charAt(i));
		     
		}
		System.out.println("String comaring");
		     
		     String name1="avi";
		     String name2="avi";
		     if (name1.compareTo(name2)==0) {
		    	 System.out.println("String is equal\n");
		     }else {
				System.out.println("String is not equal");
			
		}
		     System.out.println("String Builder");
		     StringBuilder sb=new StringBuilder("avi");
		     System.out.println(sb);
		     System.out.println("char at inder is cheking 2 ");
		     System.out.println(sb.charAt(2)+"\n");
		     System.out.println("set char index at index 0,1,2,3,4");
		     sb.setCharAt(0, 'A');
		     System.out.println(sb+"\n");
		     System.out.println("inserting a char in String ");
		     sb.insert(0, 'p');
		     System.out.println(sb+"\n");
		     System.out.println("Deleting char in String");
		     sb.delete(0, 1);
		     System.out.println(sb+"\n");
		     System.out.println("Adding elment  on String one by one\n");
		     sb.append("J");
		     sb.append("a");
		     
		     System.out.println("                                             ->>>^"+sb+"^<<<-");
	}

	
}
