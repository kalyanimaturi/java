package tcs;

public class nestedinner {
	void show() {
		System.out.println("goo");
	}
	class Test2{
		void print() {
			System.out.println("give");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nestedinner n=new nestedinner();
		n.show();
		nestedinner.Test2 t=new nestedinner().new Test2();
		t.print();
		

	}

}
