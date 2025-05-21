package tcs;
import java.util.*;
public class lis5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer>l1=new LinkedList<Integer>();
		l1.add(2);
		l1.add(4);
		l1.add(6);
		System.out.println(l1);
		l1.addFirst(3);
		System.out.println(l1);
		l1.addLast(55);
		System.out.println(l1);
		l1.removeFirst();
		l1.removeLast();
		l1.removeFirstOccurrence(45);
		System.out.println(l1);

	}

}
