package tcs;
interface I1{
	void add();

}
interface I2{
	void sub();
	
	}
interface I3 extends I1,I2{
	void mul();
	
}
public class inter1 implements I3{
	public void add() {
		System.out.println("hi");
}
	public void sub() {
		System.out.println("hello");

	}

public void mul() {
	System.out.println("hey");
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inter1 t=new inter1();
		t.add();
		t.sub();
		t.mul();

	}

}
