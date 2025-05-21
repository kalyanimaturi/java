package tcs;
import java.util.*;
public class lis9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String>m1=new HashMap<Integer,String>();
		m1.put(1,"cse");
		m1.put(2,"aiml");
		m1.put(3,"ds");
		m1.put(4,"civil");
		m1.put(5,"eee");
		m1.put(null, null);
		m1.put(7,"oo");
		System.out.println(m1);
		for(Map.Entry<Integer,String> i:m1.entrySet()) {
			System.out.println(i.getValue());
			System.out.println(i.getKey());
		}
		

	}

}
