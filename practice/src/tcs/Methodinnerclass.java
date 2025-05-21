package tcs;

public class Methodinnerclass {
	void show() {
		System.out.println("good afternoon");
		class Test3{
			void print() {
				System.out.println("wassup");
			}
			
		}
		Test3 u=new Test3();
		u.print();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodinnerclass m=new Methodinnerclass();
		m.show();

	}

}
