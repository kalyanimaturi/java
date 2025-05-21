package tcs;
import java.util.*;
public class cat6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		try {
			System.out.println("enter the class name");
			String className=s1.next();
			Class.forName(className);
			System.out.println("the class was found");
		}catch(ClassNotFoundException e) {
			System.out.println("class not found:");
		}finally {
			System.out.println("");
		}

	}

}
