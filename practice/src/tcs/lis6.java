package tcs;
import java.util.*;
public class lis6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>s1=new Stack<Integer>();
		s1.push(44);
		s1.push(55);
		s1.push(80);
		Iterator i1=s1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		System.out.println(s1);
		System.out.println(s1.peek());
		System.out.println(s1.pop());

	}

}
