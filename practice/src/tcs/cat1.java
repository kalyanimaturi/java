package tcs;

import java.util.InputMismatchException;
import java.util.Scanner;
public class cat1 {

	public static void main(String[] args) throws ArithmeticException,InputMismatchException
	{
		
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
		
		/*catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}*/
		//two can also printed
		
	}}
}

