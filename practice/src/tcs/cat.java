package tcs;
import java.util.*;
public class cat {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a,b values");
		try {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);
			
		}catch(ArithmeticException|InputMismatchException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("hi");
		}
		/*catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}*/
		
	}

}
