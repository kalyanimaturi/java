package tcs;
import java.util.*;
public class test30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//iterator and listiterator
		List<Integer>li=new ArrayList<Integer>();
		li.add(12);
		li.add(45);
		li.add(78);
		System.out.println(li);
		ListIterator il=li.listIterator();
		while(il.hasNext()) {
			System.out.println(il.next());
			
		}while(il.hasPrevious()) {
			System.out.println(il.previous());
			
		}
		
		

	}
 
}
