package tcs;

import java.util.*;

public class test31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//enumerator
		Vector<Integer>li=new Vector<Integer>();
		li.add(12);
		li.add(45);
		li.add(78);
		System.out.println(li);
		Enumeration il=li.elements();
		
		while(il.hasMoreElements()) {
			System.out.println(il.nextElement());
			
		}
		
		

	}
 

	}


