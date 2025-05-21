package tcs;


public class cat3 {
	static void add(int a,int b) {
	if(b==0) {
		throw new ArithmeticException("maths radha miku");
	}
		
		// TODO Auto-generated method stub
	int c=a/b;
	System.out.println(c);
		//System.out.println("enter a,b values");
		
			//int a=sc.nextInt();
			//int b=sc.nextInt();
			
			
		}
	public static void main(String[] args) 
	{
		try {
			add(10,0);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("covered all keywords");
		}

		
		/*catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}*/
		//two can also printed
		
	}}

